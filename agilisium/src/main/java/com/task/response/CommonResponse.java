package com.task.response;

public class CommonResponse{

	private int responseCode;
	private String errorCode;
	private String errorDesc;

	public CommonResponse(int responseCode,String errorCode,String errorDesc) {
		this.responseCode = responseCode;
		this.errorCode = errorCode;
		this.errorDesc = errorDesc;
	}
	
	public int getResponseCode() {
		return responseCode;
	}
	public CommonResponse setResponseCode(int responseCode) {
		this.responseCode = responseCode;
		return this;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public CommonResponse setErrorCode(String errorCode) {
		this.errorCode = errorCode;
		return this;
	}
	public String getErrorDesc() {
		return errorDesc;
	}
	public CommonResponse setErrorDesc(String errorDesc) {
		this.errorDesc = errorDesc;
		return this;
	}
}