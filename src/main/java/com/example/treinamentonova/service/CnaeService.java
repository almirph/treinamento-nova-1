package com.example.treinamentonova.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.treinamentonova.domain.Cnae;
import com.example.treinamentonova.repository.CnaeRepository;

@Service
public class CnaeService {
	
	@Autowired
	private CnaeRepository cnaeRepo;
	
	public Cnae find (Integer id) {
        Optional <Cnae> obj = cnaeRepo.findById(id);
        return obj.orElse(null);
    }

	public Cnae insert(Cnae obj) {
		return cnaeRepo.save(obj);
	}
	
	public List<Cnae> findAll() {
		return cnaeRepo.findAll();
	}
}
