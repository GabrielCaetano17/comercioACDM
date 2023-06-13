package com.itb.inf2am.comercioACDM.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/comercio/produto")

public class LojaController {
	
	@GetMapping("/Listar")
	public String LItarProdutos() {
		System.out.println("LISTA DE PRODUTOS");
		
		return "produtos";
	}

}
