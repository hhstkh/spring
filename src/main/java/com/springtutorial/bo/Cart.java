package com.springtutorial.bo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Cart {
	
	private String cartId;
	private List<CartItem> cartItems = new ArrayList<>();
	private BigDecimal grandTotal;
	
	public String getCartId() {
		return cartId;
	}
	public void setCartId(String cartId) {
		this.cartId = cartId;
	}
	
	public BigDecimal getGrandTotal() {
		return grandTotal;
	}
	public void setGrandTotal(BigDecimal grandTotal) {
		this.grandTotal = grandTotal;
	}
	
	public int getNumberOfItems() {
		return this.cartItems.size();
	}
	
	public List<CartItem> getCartItems() {
		return cartItems;
	}
	public void setCartItems(List<CartItem> cartItems) {
		this.cartItems = cartItems;
	}
	public void addCartItem(int id, String itemName, int qty, BigDecimal price) {
		boolean existItem = false;
		for (CartItem cartItem : cartItems) {
			if (cartItem.getProductName().equals(itemName)) {
				cartItem.setQuantity(qty);
				existItem = true;
			}
		}
		
		if (!existItem) {
			CartItem item = new CartItem(id, itemName, qty, price);
			this.cartItems.add(item);
		}
		
		this.updateGrantTotal();
	}
	
	private void updateGrantTotal() {
		BigDecimal total = BigDecimal.ZERO;
		
		for (CartItem cartItem : this.cartItems) {
			total = total.add(cartItem.getTotalPrice());
		}
		
		this.setGrandTotal(total);
	}
	
}
