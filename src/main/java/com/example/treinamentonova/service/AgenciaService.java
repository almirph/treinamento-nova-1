package com.example.treinamentonova.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.treinamentonova.domain.Agencia;
import com.example.treinamentonova.repository.AgenciaRepository;

@Service
public class AgenciaService {
	
	@Autowired
	private AgenciaRepository agenciaRepo;
	
	public Agencia find (Integer id) {
        Optional <Agencia> obj = agenciaRepo.findById(id);
        return obj.orElse(null);
    }

	public Agencia insert(Agencia obj) {
		return agenciaRepo.save(obj);
	}
	
	public List<Agencia> findAll() {
		return agenciaRepo.findAll();
	}
}
