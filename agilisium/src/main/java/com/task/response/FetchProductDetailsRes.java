package com.task.response;

import java.util.List;

import com.task.dto.ProductDetails;

public class FetchProductDetailsRes extends CommonResponse{

	public FetchProductDetailsRes(int responseCode, String errorCode, String errorDesc) {
		super(responseCode, errorCode, errorDesc);
	}

	private List<ProductDetails> productDetails;

	public List<ProductDetails> getProductDetails() {
		return productDetails;
	}

	public FetchProductDetailsRes setProductDetails(List<ProductDetails> productDetails) {
		this.productDetails = productDetails;
		return this;
	}
	
}
