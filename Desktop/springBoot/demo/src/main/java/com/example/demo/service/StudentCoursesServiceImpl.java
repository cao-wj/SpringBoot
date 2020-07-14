package com.example.demo.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.example.demo.bean.PageRequest;
import com.example.demo.bean.PageResult;
import com.example.demo.bean.StudentCoursesBean;
import com.example.demo.mapper.StudentCoursesReaderMapper;
import com.example.demo.utils.PageUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class StudentCoursesServiceImpl implements StudentCoursesService{

	@Resource
	private StudentCoursesReaderMapper readerMapper;
	
	@Override
	public List<StudentCoursesBean> getCourses() {
		
		return readerMapper.getCourses();
	}

	@Override
	public List<StudentCoursesBean> getCoursesById(Integer studentId) {
		
		return readerMapper.getCoursesById(studentId, null);
	}

	@Override
	public List<StudentCoursesBean> getCoursesByName(String name) {

		return readerMapper.getCoursesById(null, name);
	}

	@Override
	public PageResult getCoursesByPage(PageRequest request) {
		
		return PageUtil.getPageResult(request, getPageInfo(request));
	}

	/**
     * 调用分页插件完成分页
     * @param request
     * @return
     */
	private PageInfo<StudentCoursesBean> getPageInfo(PageRequest request) {
		int pageNum = request.getCurrentPageNum();
		int pageSize = request.getPageSize();
		PageHelper.startPage(pageNum, pageSize);
		List<StudentCoursesBean> dbResult = readerMapper.getCoursesByPage();
		return new PageInfo<StudentCoursesBean>(dbResult);
	}

}
