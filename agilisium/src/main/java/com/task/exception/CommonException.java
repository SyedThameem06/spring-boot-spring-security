package com.task.exception;

public class CommonException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	private int responseCode;
	private String errorCode;
	private String errorDesc;
	
	public CommonException(int responseCode, String errorCode, String errorDesc) {
		super();
		this.responseCode = responseCode;
		this.errorCode = errorCode;
		this.errorDesc = errorDesc;
	}
	
	public int getResponseCode() {
		return responseCode;
	}
	public CommonException setResponseCode(int responseCode) {
		this.responseCode = responseCode;
		return this;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public CommonException setErrorCode(String errorCode) {
		this.errorCode = errorCode;
		return this;
	}
	public String getErrorDesc() {
		return errorDesc;
	}
	public CommonException setErrorDesc(String errorDesc) {
		this.errorDesc = errorDesc;
		return this;
	}
	
	
}
