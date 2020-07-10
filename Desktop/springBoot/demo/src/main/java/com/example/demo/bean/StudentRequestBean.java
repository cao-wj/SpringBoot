package com.example.demo.bean;

public class StudentRequestBean extends RequestBody{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer studentId;
	
	private String name;


	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
