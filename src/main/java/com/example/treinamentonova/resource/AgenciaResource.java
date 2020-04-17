package com.example.treinamentonova.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.treinamentonova.domain.Agencia;
import com.example.treinamentonova.service.AgenciaService;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/agencias")
public class AgenciaResource {
	
	@Autowired
	private AgenciaService service;

	@RequestMapping(method=RequestMethod.GET) 
	public ResponseEntity<List <Agencia>> findAll() {
		List<Agencia> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
}
