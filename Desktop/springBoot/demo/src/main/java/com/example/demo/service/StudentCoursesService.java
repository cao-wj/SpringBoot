package com.example.demo.service;

import java.util.List;

import com.example.demo.bean.StudentCoursesBean;

public interface StudentCoursesService {
	
	public List<StudentCoursesBean> getCourses();
	
	public List<StudentCoursesBean> getCoursesById(Integer studentId);
	
	public List<StudentCoursesBean> getCoursesByName(String name);

}
