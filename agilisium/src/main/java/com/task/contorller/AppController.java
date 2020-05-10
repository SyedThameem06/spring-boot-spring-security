package com.task.contorller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.task.response.FetchConfigDetailsRes;
import com.task.response.FetchProductDetailsRes;
import com.task.services.ConfigDetailsService;
import com.task.services.ProductDetailsService;

@RestController
public class AppController {
	
	@Autowired
	ProductDetailsService productDetails;
	
	@Autowired
	ConfigDetailsService configDetails;
	
	@GetMapping("/")
	public String home() {
		return("<h1>Application is read to check the documentation of api click on below link</h1></br><a href='http://localhost:8082/swagger-ui.html'>Click Here</a>");
	}
	
	@GetMapping(value="/api/getproductdetails")
	public FetchProductDetailsRes fetchProductDetails() {
		return productDetails.fetchProductDetails();
	}
	
	@GetMapping(value="/api/getconfigdetails")
	public FetchConfigDetailsRes fetchConfigDetails() {
		return configDetails.fetchConfigDetails(); 
	}
	
}
