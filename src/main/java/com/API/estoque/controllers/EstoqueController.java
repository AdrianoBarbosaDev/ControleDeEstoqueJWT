package com.API.estoque.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.API.estoque.model.Produto;
import com.API.estoque.repository.EstoqueRepository;

@RestController
@RequestMapping(value = "/estoque")
public class EstoqueController {

//	@Autowired
//	private Produto produto;
	
	@Autowired
	private EstoqueRepository estoqueRepository;
	
	@GetMapping
	public ResponseEntity<List<Produto>> FindAll() {
		return ResponseEntity.ok(estoqueRepository.findAll());
	}
	
	@PostMapping
	public ResponseEntity salvarProduto(@RequestBody Produto produto) {
		estoqueRepository.save(produto);
		return ResponseEntity.ok().build();
	}
}
