package com.example.treinamentonova.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.treinamentonova.domain.Ramo;
import com.example.treinamentonova.service.RamoService;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/ramos")
public class RamoResource {
	
	@Autowired
	private RamoService service;

	@RequestMapping(method=RequestMethod.GET) 
	public ResponseEntity<List <Ramo>> findAll() {
		List<Ramo> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

}
