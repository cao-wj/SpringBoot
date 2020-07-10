package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.demo.bean.JsonResult;
import com.example.demo.bean.StudentCoursesBean;
import com.example.demo.bean.StudentRequestBean;
import com.example.demo.service.StudentCoursesService;
import com.example.demo.utils.RedisUtil;
import com.sun.org.apache.bcel.internal.generic.NEW;

@Controller
public class StudentCoursesController extends BaseController{
	
	@Resource
	private StudentCoursesService studentCoursesService;
	
	@Autowired
    private RedisUtil redisUtil;
	
		
	@GetMapping("/getCourses")
	@ResponseBody
	public JsonResult getStudentCourses() {
		
		//查询缓存中是否存在
        boolean hasKey = redisUtil.hasKey("studentCourses");
        List<StudentCoursesBean> list = null;
        JsonResult result = new JsonResult();
        if(hasKey){
            //获取缓存
            Object object = redisUtil.get("studentCourses");
            
            list = (ArrayList<StudentCoursesBean>) object;
            logger.info("从redis缓存获取的数据:"+ list.size());
        } else {
        	list = studentCoursesService.getCourses();
        	redisUtil.set("studentCourses", list, 20);
        	logger.info("从数据库获取数据:"+list.size());
        }

		
		if (list != null) {
			result.setStatus("200");
			result.setMsg("正常");
			result.setResultData(list);
		} else {
			result.setStatus("201");
			result.setMsg("没有数据");
			result.setResultData(new ArrayList<StudentCoursesBean>());
		}
		
		return result;
	}
	
	@PostMapping("/getCoursesBy")
	@ResponseBody
	public JsonResult getCourseByStudent(@RequestBody StudentRequestBean requestBean) {
		logger.info("name:"+requestBean.getName());
		List<StudentCoursesBean> list = null;
		JsonResult result = new JsonResult();
		if (requestBean.getName() != null && requestBean.getName() != "") {
			list = studentCoursesService.getCoursesByName(requestBean.getName());

		} else if (requestBean.getStudentId() != null && requestBean.getStudentId() > 0) {
			list = studentCoursesService.getCoursesById(requestBean.getStudentId());
		} 
		
		if (list != null) {
			result.setStatus("200");
			result.setMsg("正常");
			result.setResultData(list);
		} else {
			result.setStatus("201");
			result.setMsg("没有数据");
			result.setResultData(new ArrayList<StudentCoursesBean>());
		}
		return result;
	}

}