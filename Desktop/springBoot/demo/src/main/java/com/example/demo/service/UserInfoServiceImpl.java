package com.example.demo.service;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import com.example.demo.bean.UserInfoBean;
import com.example.demo.mapper.UserInfoReaderMapper;

@Service
public class UserInfoServiceImpl implements UserInfoService{

	@Resource
	private UserInfoReaderMapper readerMapper;
	
	@Override
	public UserInfoBean getUserInfo() {
		UserInfoBean bean = new UserInfoBean();
		bean.setName("张三");
		bean.setStudentId("12345678");
		// 0:男 1:女
		bean.setSex(0);
		return bean;
	}

	@Override
	public List<UserInfoBean> getUserInfos() {
		return readerMapper.getUserInfos();
	}

}
