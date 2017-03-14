package com.springtutorial.editor;

import java.beans.PropertyEditorSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springtutorial.entity.Category;
import com.springtutorial.service.CategoryService;

@Component
public class CategoryEditor extends PropertyEditorSupport {
	
	@Autowired
	private CategoryService categoryService;
	
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		Category category = categoryService.find(Integer.valueOf(text));
		this.setValue(category);
	}
	
	

}
