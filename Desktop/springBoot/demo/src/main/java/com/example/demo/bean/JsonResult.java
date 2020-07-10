package com.example.demo.bean;

import java.io.Serializable;

public class JsonResult implements Serializable {

	/**
	 * 序列化ID
	 */
	private static final long serialVersionUID = -7073856910135669765L;

	private String status;

	private String msg;

	private Object resultData;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getResultData() {
		return resultData;
	}

	public void setResultData(Object resultData) {
		this.resultData = resultData;
	}

}
