package com.springtutorial.controller;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springtutorial.entity.Category;
import com.springtutorial.service.CategoryService;

@Controller
public class CategoryController {
	
	@Autowired
	private CategoryService categoryService;
	
	@RequestMapping(value = "/category-form", method = RequestMethod.GET)
	public ModelAndView showCategoryForm() {
		return new ModelAndView("category-form", "category", new Category());
	}
	
	@RequestMapping(value = "/category-form", method = RequestMethod.POST)
	public String saveCategory(@Valid @ModelAttribute("category")Category category, BindingResult result) {
		if (result.hasErrors()) {
			return "errors";
		}
		
		categoryService.save(category);
		
		return "redirect:/category-form";
	}

}
