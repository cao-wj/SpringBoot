package com.example.demo.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.JsonResult;
import com.example.demo.bean.UserInfoBean;
import com.example.demo.service.MyService;
import com.example.demo.service.UserInfoService;

@Controller
public class MyController {
	
	@Resource(name = "myService")
	private MyService myService;
	@Resource(name = "userService")
	private MyService uService;
	@Resource
	private UserInfoService userInfoService;

	@RequestMapping("/hello")
	@ResponseBody
	public List<String> hello() {

		return uService.gtList();
	}
	
	
	@RequestMapping("/getUserInfo")
	@ResponseBody
	public JsonResult getUserInfo() {
		UserInfoBean userInfoBean = userInfoService.getUserInfo();
		JsonResult result = new JsonResult();
		result.setStatus("200");
		result.setMsg("数据正常");
		result.setResultData(userInfoBean);
		
		return result;
	}
	
	@RequestMapping("/getUserInfos")
	@ResponseBody
	public JsonResult getUsers() {
		JsonResult result = new JsonResult();
		result.setStatus("200");
		result.setMsg("数据正常");
		result.setResultData(userInfoService.getUserInfos());
		
		return result;
	}
	
}
