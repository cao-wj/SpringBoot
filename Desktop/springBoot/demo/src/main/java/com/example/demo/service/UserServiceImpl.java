package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.sym.Name;

@Service("userService")
public class UserServiceImpl implements MyService{
	
	private List<String> result;

	@Override
	public List<String> gtList() {
		result = new ArrayList<String>();
		result.add("1");
		result.add("2");
		result.add("3");
		result.add("4");
		result.add("5");
		result.add("6");
		result.add("7");
		
		return result;
	}

}
