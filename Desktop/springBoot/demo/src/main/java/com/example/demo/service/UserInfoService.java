package com.example.demo.service;

import java.util.List;

import com.example.demo.bean.UserInfoBean;

public interface UserInfoService {
	
	public UserInfoBean getUserInfo();
	
	public List<UserInfoBean> getUserInfos();

}
