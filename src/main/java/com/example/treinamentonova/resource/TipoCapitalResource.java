package com.example.treinamentonova.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.treinamentonova.domain.TipoCapital;
import com.example.treinamentonova.service.TipoContribuicaoService;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/tipos-contribuicao")
public class TipoCapitalResource {
	
	@Autowired
	private TipoContribuicaoService service;

	@RequestMapping(method=RequestMethod.GET) 
	public ResponseEntity<List <TipoCapital>> findAll() {
		List<TipoCapital> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

}
