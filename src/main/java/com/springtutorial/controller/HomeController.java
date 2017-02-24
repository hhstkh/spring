package com.springtutorial.controller;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.springtutorial.entity.Customer;

@Controller
public class HomeController {
	private static int counter = 0;
	private final static org.slf4j.Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String welcome(ModelMap model) {
		model.put("message", "Welcome");
		model.put("counter", ++counter);
		
		logger.debug("[welcome] counter : {}", counter);
		return "home";
	}
	
	@RequestMapping(value = "/changeLang")
	public String changeLanguage(HttpServletRequest request, HttpServletResponse response, @RequestParam(value = "lang") String langCode) {
		response.setLocale(new Locale(langCode));
		return "redirect:/?lang=" + langCode;
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public ModelAndView signUp() {
		return new ModelAndView("register", "customer", new Customer());
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String procesSignUp() {
		return "register";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		return "login";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String processLogin() {
		return "login";
	}
	
	@RequestMapping("/logout")
	public String logout(HttpServletRequest request, HttpServletResponse response) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		
		if (auth != null) {
			new SecurityContextLogoutHandler().logout(request, response, auth);
		}
		return "redirect:/login?logout";
	}

}
