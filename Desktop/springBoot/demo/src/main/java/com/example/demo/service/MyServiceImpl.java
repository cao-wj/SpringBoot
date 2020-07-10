package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("myService")
public class MyServiceImpl implements MyService{
	
	private List<String> result;

	@Override
	public List<String> gtList() {
		
		result = new ArrayList<String>();
		result.add("a");
		result.add("b");
		result.add("c");
		result.add("d");
		result.add("e");
		result.add("f");
		result.add("g");
		
		return result;
	}

}
