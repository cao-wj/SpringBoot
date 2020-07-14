package com.example.demo.bean;

import java.util.List;

public class PageResult {
	
	/**
	 * 当前页码
	 */
	private int currentPageNum;
	/**
	 * 每页显示数量
	 */
	private int pageSize;
	/**
	 * 数据总量
	 */
	private long totalSize;
	/**
	 * 页码总数
	 */
	private int totalPageCount;
	
	private List<?> content;

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

	public long getTotalSize() {
		return totalSize;
	}

	public void setTotalSize(long totalSize) {
		this.totalSize = totalSize;
	}

	public int getTotalPageCount() {
		return totalPageCount;
	}

	public void setTotalPageCount(int totalPageCount) {
		this.totalPageCount = totalPageCount;
	}

	public List<?> getContent() {
		return content;
	}

	public void setContent(List<?> content) {
		this.content = content;
	}

}
