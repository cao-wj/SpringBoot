package com.example.demo.bean;

public class PageRequest {
	
	/**
	 * 当前页码
	 */
	private int currentPageNum;
	/**
	 * 每页显示数量
	 */
	private int pageSize;
	
	public int getCurrentPageNum() {
		return currentPageNum;
	}
	public void setCurrentPageNum(int currentPageNum) {
		this.currentPageNum = currentPageNum;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

}
