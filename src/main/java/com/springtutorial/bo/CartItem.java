package com.springtutorial.bo;

import java.math.BigDecimal;

public class CartItem {
	private int productId;
	private String productName;
	private int quantity;
	private BigDecimal productPrice;
	private String productImageBase64;
	
	public CartItem() {
	}
	
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public BigDecimal getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(BigDecimal productPrice) {
		this.productPrice = productPrice;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = this.quantity + quantity;
	}
	public BigDecimal getTotalPrice() {
		return productPrice.multiply(new BigDecimal(quantity));
	}


	public String getProductImageBase64() {
		return productImageBase64;
	}


	public void setProductImageBase64(String productImageBase64) {
		this.productImageBase64 = productImageBase64;
	}
	
}
