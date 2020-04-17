package com.example.treinamentonova.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import com.example.treinamentonova.domain.DadosCliente;
import com.example.treinamentonova.dto.DadosClienteDTO;
import com.example.treinamentonova.service.DadosClienteService;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/dados-cliente")
public class DadosClienteResource {
	
	@Autowired
	private DadosClienteService service;

	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<Void> insert(@Valid @RequestBody DadosClienteDTO objDto) {
		DadosCliente obj = service.fromDTO(objDto);
		obj = service.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
	@RequestMapping(value = "/lista", method=RequestMethod.GET) 
	public ResponseEntity<List <DadosCliente>> findAll() {
		List<DadosCliente> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
}