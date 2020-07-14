package com.example.demo.service;

import java.util.List;

import com.example.demo.bean.PageRequest;
import com.example.demo.bean.PageResult;
import com.example.demo.bean.StudentCoursesBean;

public interface StudentCoursesService {
	
	public List<StudentCoursesBean> getCourses();
	
	public List<StudentCoursesBean> getCoursesById(Integer studentId);
	
	public List<StudentCoursesBean> getCoursesByName(String name);
	
	 /**
     * 分页查询接口
     * 这里统一封装了分页请求和结果，避免直接引入具体框架的分页对象, 如MyBatis或JPA的分页对象
     * 从而避免因为替换ORM框架而导致服务层、控制层的分页接口也需要变动的情况，替换ORM框架也不会
     * 影响服务层以上的分页接口，起到了解耦的作用
     * @param pageRequest 自定义，统一分页查询请求
     * @return PageResult 自定义，统一分页查询结果
     */
	public PageResult getCoursesByPage(PageRequest request);

}
