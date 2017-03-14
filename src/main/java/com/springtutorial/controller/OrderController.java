package com.springtutorial.controller;

import java.math.BigDecimal;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springtutorial.bo.Cart;
import com.springtutorial.util.CartUtil;

@Controller
@RequestMapping("/checkout")
public class OrderController {
	
	@RequestMapping(value = "/cart", method = RequestMethod.GET)
	public String viewCart(ModelMap model, HttpServletRequest request) {
		Cart cart = CartUtil.getCartInSession(request);
		model.addAttribute("cart", cart);
		return "cart-detail";
	}
	
	@RequestMapping(value = "/addProduct", method = RequestMethod.POST)
	@ResponseBody
	public Cart addProduct(@RequestParam(value = "productId") int productId, 
			@RequestParam(value = "qty") int qty,
			@RequestParam(value = "productName") String productName,
			@RequestParam(value= "productPrice") BigDecimal productPrice,
			HttpServletRequest request, HttpServletResponse response) {
		Cart cart = CartUtil.getCartInSession(request);
		cart.addCartItem(productId, productName, qty, productPrice);
		
		return cart;
	}

}
