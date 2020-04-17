package com.example.treinamentonova.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.treinamentonova.domain.TipoCapital;
import com.example.treinamentonova.repository.TipoCapitalRepository;

@Service
public class TipoContribuicaoService {
	
	@Autowired
	private TipoCapitalRepository tipoContribuicaoRepo;
	
	public TipoCapital find (Integer id) {
        Optional <TipoCapital> obj = tipoContribuicaoRepo.findById(id);
        return obj.orElse(null);
    }

	public TipoCapital insert(TipoCapital obj) {
		return tipoContribuicaoRepo.save(obj);
	}
	
	public List<TipoCapital> findAll() {
		return tipoContribuicaoRepo.findAll();
	}
}
