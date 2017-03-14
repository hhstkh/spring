package com.springtutorial.util;

import javax.servlet.http.HttpServletRequest;

import com.springtutorial.bo.Cart;

public class CartUtil {
	public static Cart getCartInSession(HttpServletRequest request) {
		Cart cart = (Cart)request.getSession().getAttribute("cart");
		
		if (cart == null) {
			cart = new Cart();
			
			request.getSession().setAttribute("cart", cart);
		}
		return cart;
	}
	
	public static void removeCartInSession(HttpServletRequest request) {
		request.getSession().removeAttribute("cart");
	}
}
