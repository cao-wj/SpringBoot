package com.example.demo.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.example.demo.bean.StudentCoursesBean;
import com.example.demo.mapper.StudentCoursesReaderMapper;

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



}
