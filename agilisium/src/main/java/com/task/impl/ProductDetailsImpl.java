package com.task.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.task.dto.ProductDetails;
import com.task.exception.CommonException;
import com.task.response.FetchProductDetailsRes;
import com.task.services.MessageByLocaleService;
import com.task.services.ProductDetailsService;

@Service
public class ProductDetailsImpl implements ProductDetailsService {

	@Autowired
	MessageByLocaleService localResolver;
	
	@Override
	public FetchProductDetailsRes fetchProductDetails() {
		List<ProductDetails> productsList = new ArrayList<ProductDetails>();

		productsList.add(new ProductDetails().setProductCode("PLT")
				.setProductName("Platinum")
				.setProductDescription("Platinum Card")
				.setMinAmount(100000)
				.setMaxAmount(1000000)
				.setIssuanceFees(200));
		
		productsList.add(new ProductDetails().setProductCode("GLD")
				.setProductName("Gold")
				.setProductDescription("Gold Card")
				.setMinAmount(50000)
				.setMaxAmount(500000)
				.setIssuanceFees(200));
		
		productsList.add(new ProductDetails().setProductCode("SLV")
				.setProductName("Silver")
				.setProductDescription("Silver Card")
				.setMinAmount(20000)
				.setMaxAmount(200000)
				.setIssuanceFees(200));
		//productsList = null; //Enable to check user defined common exception
		//productsList = new ArrayList<ProductDetails>(); // Enable to check if list is empty
		
		if(productsList == null) {
			throw new CommonException(-1, "CMNRES", null);
		}
		
		FetchProductDetailsRes response = new FetchProductDetailsRes(0, "00", null);
		if(productsList.size()>0) {
			response.setProductDetails(productsList)
			.setErrorDesc(localResolver.getErrorMessage("00"));
		}else {
			response.setProductDetails(productsList)
			.setResponseCode(-1)
			.setErrorCode("NORECF")
			.setErrorDesc(localResolver.getErrorMessage("NORECF"));
		}
		
		return response;
	}
}