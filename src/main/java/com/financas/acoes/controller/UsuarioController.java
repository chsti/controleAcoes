package com.financas.acoes.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.financas.acoes.model.Usuario;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioController {
	
	@GetMapping
	public ResponseEntity<Usuario> findAll(){
		Usuario u = new Usuario(1L, "Carlos", "cbl_carlos@yahoo.com.br", "1234");
		return ResponseEntity.ok().body(u);
	}

}
