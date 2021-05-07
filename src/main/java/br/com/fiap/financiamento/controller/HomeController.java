package br.com.fiap.financiamento.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("financiamento")
public class HomeController {
	
	@GetMapping("/")
	public String home() {
		return "home";
	}
	

}
