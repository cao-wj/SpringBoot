package com.example.demo.utils;

import com.example.demo.bean.PageRequest;
import com.example.demo.bean.PageResult;
import com.github.pagehelper.PageInfo;

public class PageUtil {
	
	public static PageResult getPageResult(PageRequest request, PageInfo<?> pageInfo) {
		PageResult result = new PageResult();
		result.setCurrentPageNum(pageInfo.getPageNum());
		result.setPageSize(pageInfo.getPageSize());
		result.setTotalSize(pageInfo.getTotal());
		result.setTotalPageCount(pageInfo.getPages());
		result.setContent(pageInfo.getList());
		return result;
	}

}
