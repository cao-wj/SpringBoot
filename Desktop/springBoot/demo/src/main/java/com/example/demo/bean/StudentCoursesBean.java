package com.example.demo.bean;

import java.io.Serializable;

public class StudentCoursesBean implements Serializable{
	/**
	 * 序列化ID
	 */
	private static final long serialVersionUID = 1L;
	
	private int studentId;
	
	private String student;
	
	private String name;
	
	private String chineseCourse;
	
	private String mathCourse;
	
	private String englishCourse;
	
	private String historyCourse;
	
	private String biologicalCourse;
	
	private String totalScore;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudent() {
		return student;
	}

	public void setStudent(String student) {
		this.student = student;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getChineseCourse() {
		return chineseCourse;
	}

	public void setChineseCourse(String chineseCourse) {
		this.chineseCourse = chineseCourse;
	}

	public String getMathCourse() {
		return mathCourse;
	}

	public void setMathCourse(String mathCourse) {
		this.mathCourse = mathCourse;
	}

	public String getEnglishCourse() {
		return englishCourse;
	}

	public void setEnglishCourse(String englishCourse) {
		this.englishCourse = englishCourse;
	}

	public String getHistoryCourse() {
		return historyCourse;
	}

	public void setHistoryCourse(String historyCourse) {
		this.historyCourse = historyCourse == null? "0" :  historyCourse;
	}

	public String getBiologicalCourse() {
		return biologicalCourse;
	}

	public void setBiologicalCourse(String biologicalCourse) {
		this.biologicalCourse = biologicalCourse;
	}

	public String getTotalScore() {
		return totalScore;
	}

	public void setTotalScore(String totalScore) {
		this.totalScore = totalScore;
	}

	
}
