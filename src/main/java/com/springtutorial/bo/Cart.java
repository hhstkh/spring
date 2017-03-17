package com.springtutorial.bo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.springtutorial.entity.Product;

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
		int total = 0;
		for (CartItem cartItem : this.cartItems) {
			total += cartItem.getQuantity();
		}
		
		return total;
	}
	
	public List<CartItem> getCartItems() {
		return cartItems;
	}
	public void setCartItems(List<CartItem> cartItems) {
		this.cartItems = cartItems;
	}
	public void addCartItem(int buyingQty, Product product) {
		boolean existItem = false;
		for (CartItem cartItem : cartItems) {
			if (cartItem.getProductId() == product.getProductId()) {
				cartItem.setQuantity(buyingQty);
				existItem = true;
			}
		}
		
		if (!existItem) {
			CartItem item = new CartItem();
			item.setProductId(product.getProductId());
			item.setProductName(product.getProductName());
			item.setProductPrice(product.getPrice());
			item.setProductImageBase64(product.getImageBase64());
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
