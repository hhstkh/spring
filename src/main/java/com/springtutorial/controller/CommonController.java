package com.springtutorial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.springtutorial.entity.Category;
import com.springtutorial.service.MasterDataService;

@ControllerAdvice
public class CommonController {
	@Autowired
	private MasterDataService masterDataService;
	
	@ModelAttribute
	public void getMasterData(ModelMap model) {
		List<Category> categories = masterDataService.getAllCategory();
		
		model.addAttribute("categories", categories);
	}
}
