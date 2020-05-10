package com.task.response;

import java.util.List;

import com.task.dto.ConfigDetails;

public class FetchConfigDetailsRes extends CommonResponse {

	public FetchConfigDetailsRes(int responseCode, String errorCode, String errorDesc) {
		super(responseCode, errorCode, errorDesc);
	}

	private List<ConfigDetails> configDetails;

	public List<ConfigDetails> getConfigDetails() {
		return configDetails;
	}

	public FetchConfigDetailsRes setConfigDetails(List<ConfigDetails> configDetails) {
		this.configDetails = configDetails;
		return this;
	}
}
