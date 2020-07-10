package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.bean.JsonResult;

@Controller
public class UserController {
	
	@GetMapping("/updateUserInfo/{id}")
	public JsonResult updateUserInfo(@PathVariable(name = "id") String id,@RequestParam(name = "name") String name,
			@RequestParam(name = "sex")int sex) {
		
		return null;
	}

}
