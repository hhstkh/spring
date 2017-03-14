package com.springtutorial.bo;

import java.math.BigDecimal;

public class CartItem {
	private int productId;
	private String productName;
	private int quantity;
	private BigDecimal productPrice;
	
	public CartItem(int id, String name, int qty, BigDecimal price) {
		this.productId = id;
		this.productName = name;
		this.quantity = qty;
		this.productPrice = price;
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
}
