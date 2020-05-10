package com.task.dto;

public class ProductDetails {

	private String productCode;
	private String productName;
	private String productDescription;
	private double minAmount;
	private double maxAmount;
	private double issuanceFees;
	
	public String getProductCode() {
		return productCode;
	}
	public ProductDetails setProductCode(String productCode) {
		this.productCode = productCode;
		return this;
	}
	public String getProductName() {
		return productName;
	}
	public ProductDetails setProductName(String productName) {
		this.productName = productName;
		return this;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public ProductDetails setProductDescription(String productDescription) {
		this.productDescription = productDescription;
		return this;
	}
	public double getMinAmount() {
		return minAmount;
	}
	public ProductDetails setMinAmount(double minAmount) {
		this.minAmount = minAmount;
		return this;
	}
	public double getMaxAmount() {
		return maxAmount;
	}
	public ProductDetails setMaxAmount(double maxAmount) {
		this.maxAmount = maxAmount;
		return this;
	}
	public double getIssuanceFees() {
		return issuanceFees;
	}
	public ProductDetails setIssuanceFees(double issuanceFees) {
		this.issuanceFees = issuanceFees;
		return this;
	}
}
