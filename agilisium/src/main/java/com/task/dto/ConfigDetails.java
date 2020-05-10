package com.task.dto;

public class ConfigDetails {

	private String apiName;
	private String userName;
	private String password;
	private String version;
	
	public String getApiName() {
		return apiName;
	}
	public ConfigDetails setApiName(String apiName) {
		this.apiName = apiName;
		return this;
	}
	public String getUserName() {
		return userName;
	}
	public ConfigDetails setUserName(String userName) {
		this.userName = userName;
		return this;
	}
	public String getPassword() {
		return password;
	}
	public ConfigDetails setPassword(String password) {
		this.password = password;
		return this;
	}
	public String getVersion() {
		return version;
	}
	public ConfigDetails setVersion(String version) {
		this.version = version;
		return this;
	}
}
