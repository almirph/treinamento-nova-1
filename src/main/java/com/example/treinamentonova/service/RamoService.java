package com.example.treinamentonova.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.treinamentonova.domain.Ramo;
import com.example.treinamentonova.repository.RamoRepository;

@Service
public class RamoService {
	
	@Autowired
	private RamoRepository ramoRepo;
	
	public Ramo find (Integer id) {
        Optional <Ramo> obj = ramoRepo.findById(id);
        return obj.orElse(null);
    }

	public Ramo insert(Ramo obj) {
		return ramoRepo.save(obj);
	}
	
	public List<Ramo> findAll() {
		return ramoRepo.findAll();
	}
}
