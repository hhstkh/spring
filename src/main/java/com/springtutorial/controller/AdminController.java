package com.springtutorial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springtutorial.entity.Product;
import com.springtutorial.service.ProductService;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping("/")
	public String home() {
		return "admin-home";
	}
	
	@RequestMapping("/bikes")
	public String getAllBikes(ModelMap model) {
		
		List<Product> products = productService.getAll();
		model.addAttribute("products", products);
		return "admin-product-list";
	}
	
	@RequestMapping("/satictis/bike")
	public String getBikeStatistic() {
		return "admin-bike-statictis";
	}
}
