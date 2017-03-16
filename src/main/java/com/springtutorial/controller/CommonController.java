package com.springtutorial.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.springtutorial.bo.Cart;
import com.springtutorial.entity.Category;
import com.springtutorial.service.MasterDataService;
import com.springtutorial.util.CartUtil;

@ControllerAdvice
public class CommonController {
	@Autowired
	private MasterDataService masterDataService;
	
	@ModelAttribute
	public void getMasterData(ModelMap model, HttpServletRequest request) {
		List<Category> categories = masterDataService.getAllCategory();
		Cart cart = CartUtil.getCartInSession(request);
		model.addAttribute("cart", cart);
		model.addAttribute("categories", categories);
	}
}
