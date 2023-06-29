package com.itb.inf2am.comercioACDM.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itb.inf2am.comercioACDM.model.Produto;

@Controller
@RequestMapping("/comercio/produto")
public class LojaController {
	
		@GetMapping("/listar")
		public String listarPRodutos(Model model) {
			
			List<Produto> listaDeProduto = new ArrayList<Produto>();
			
			Produto p1 = new Produto();
			
			p1.setId(101);
			p1.setNome("Maquina de lavar Brasyemp 151");
			p1.setDescricao("Maquina de Lavar");
			p1.setCodigoBarras("JDHDSAD123");
			p1.setPreco(2415.33);
			p1.setCodStatus(false);
			
			Produto p2 = new Produto();
			
			p2.setId(102);
			p2.setNome("Maquina de lavar Brasyemp 155");
			p2.setDescricao("Maquina de Lavar Roupa cara");
			p2.setCodigoBarras("JDHDSAD321");
			p2.setPreco(2415.77);
			p2.setCodStatus(true);
			
			listaDeProduto.add(p1);
			listaDeProduto.add(p2);
			
			model.addAttribute("listarDeProdutos", listaDeProduto);
			return "produtos";
			
	}
		@GetMapping("")
		public String novoProduto() {
			
			return "novo-prod";
		}

}
