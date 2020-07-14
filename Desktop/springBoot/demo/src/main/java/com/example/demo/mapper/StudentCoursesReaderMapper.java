package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.demo.bean.StudentCoursesBean;

@Mapper
public interface StudentCoursesReaderMapper {
	
	public List<StudentCoursesBean> getCourses();
	
	public List<StudentCoursesBean> getCoursesByPage();
	
	public List<StudentCoursesBean> getCoursesById(@Param(value = "studentId") Integer studentId, @Param(value = "name") String name);

}
