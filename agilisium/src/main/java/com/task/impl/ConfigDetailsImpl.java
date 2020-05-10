package com.task.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.task.dto.ConfigDetails;
import com.task.exception.CommonException;
import com.task.response.FetchConfigDetailsRes;
import com.task.services.ConfigDetailsService;
import com.task.services.MessageByLocaleService;

@Service
public class ConfigDetailsImpl implements ConfigDetailsService{

	@Autowired
	MessageByLocaleService localResolver;
	
	@Override
	public FetchConfigDetailsRes fetchConfigDetails() {
		List<ConfigDetails> configList = new ArrayList<ConfigDetails>();
		
		configList.add(new ConfigDetails()
				.setApiName("getProductDetails")
				.setVersion("1.0")
				.setUserName("USER")
				.setPassword("gfgh-22ee-akbe-t12l"));
		
		configList.add(new ConfigDetails()
				.setApiName("getConfigDetails")
				.setVersion("1.0")
				.setUserName("ADMIN")
				.setPassword("efgh-12ee-adbe-t12f"));
		
		//configList = null; //Enable to check what if list is null
		//configList = new ArrayList<ConfigDetails>(); //enable to check what if list size is zero.
		
		if(configList == null) {
			throw new CommonException(-1, "CMNRES", null);
		}
		
		FetchConfigDetailsRes response = new FetchConfigDetailsRes(0, "00", null);
		if(configList.size()>0) {
			response.setConfigDetails(configList)
			.setErrorDesc(localResolver.getErrorMessage("00"));
		}else {
			response.setConfigDetails(configList)
			.setResponseCode(-1)
			.setErrorCode("NORECF")
			.setErrorDesc(localResolver.getErrorMessage("NORECF"));
		}
		
		return response;
	}

}
