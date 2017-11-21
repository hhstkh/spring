package com.springtutorial.bo;

import java.math.BigDecimal;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.collections4.map.HashedMap;

import com.springtutorial.entity.Product;

public class Cart {
	
	private String cartId;
	private Map<Integer, CartItem> cartItems = new HashedMap<Integer, CartItem>();
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
		for (Entry<Integer, CartItem> entry : cartItems.entrySet()) {
			total += entry.getValue().getQuantity();
		}
		
		return total;
	}
	
	public Map<Integer, CartItem> getCartItems() {
		return cartItems;
	}
	public void setCartItems(Map<Integer, CartItem> cartItems) {
		this.cartItems = cartItems;
	}
	public void addCartItem(int buyingQty, Product product) {
		CartItem cartItem = null;
		if (this.cartItems.containsKey(product.getProductId())) {
			cartItem = this.cartItems.get(product.getProductId());
			cartItem.setQuantity(buyingQty);
		} else {
			cartItem = new CartItem();
			cartItem.setProductId(product.getProductId());
			cartItem.setProductName(product.getProductName());
			cartItem.setProductPrice(product.getPrice());
			cartItem.setQuantity(buyingQty);
			cartItem.setProductImageBase64(product.getImageBase64());
			
			this.cartItems.put(product.getProductId(), cartItem);
		}
		
		
		this.updateGrantTotal();
	}
	
	private void updateGrantTotal() {
		BigDecimal total = BigDecimal.ZERO;
		
		for (Entry<Integer, CartItem> entry: this.cartItems.entrySet()) {
			total = total.add(entry.getValue().getTotalPrice());
		}
		
		this.setGrandTotal(total);
	}
	
}
