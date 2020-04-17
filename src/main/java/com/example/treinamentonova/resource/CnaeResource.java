package com.example.treinamentonova.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.treinamentonova.domain.Cnae;
import com.example.treinamentonova.service.CnaeService;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/cnae")
public class CnaeResource {
	
	@Autowired
	private CnaeService service;

	@RequestMapping(method=RequestMethod.GET) 
	public ResponseEntity<List <Cnae>> findAll() {
		List<Cnae> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
}
