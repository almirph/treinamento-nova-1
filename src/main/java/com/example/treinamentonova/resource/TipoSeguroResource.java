package com.example.treinamentonova.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.treinamentonova.domain.TipoSeguro;
import com.example.treinamentonova.service.TipoSeguroService;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/tipos-seguro")
public class TipoSeguroResource {
	
	@Autowired
	private TipoSeguroService service;

	@RequestMapping(method=RequestMethod.GET) 
	public ResponseEntity<List <TipoSeguro>> findAll() {
		List<TipoSeguro> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

}
