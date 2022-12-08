package com.example.Api.model;

public class CommonResponse {
	private boolean status;
	private String msg;
	
	public CommonResponse() {
		status = false;
		msg = "Opeartion Failed";
		}
	public boolean isStatus() {
		return status;
		
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	

}
