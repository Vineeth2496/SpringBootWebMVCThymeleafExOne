package com.SpringBootWebMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/product")
public class ProductController {
	@GetMapping("/home")
	public String showData(Model model) {
		model.addAttribute("title", "VINEETH-IT-HYD");
		return "ProductData";
	}
}
