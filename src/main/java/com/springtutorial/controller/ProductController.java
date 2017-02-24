package com.springtutorial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springtutorial.entity.Product;
import com.springtutorial.service.ProductService;

@Controller
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping("/products")
	public String listProducts(Model model) {
		List<Product> products = productService.getAll();
		
		model.addAttribute("products", products);
		return "list-product";
	}

}
