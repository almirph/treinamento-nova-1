package com.example.treinamentonova.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.treinamentonova.domain.TipoSeguro;
import com.example.treinamentonova.repository.TipoSeguroRepository;

@Service
public class TipoSeguroService {
	
	@Autowired
	private TipoSeguroRepository tipoSeguroRepo;
	
	public TipoSeguro find (Integer id) {
        Optional <TipoSeguro> obj = tipoSeguroRepo.findById(id);
        return obj.orElse(null);
    }

	public TipoSeguro insert(TipoSeguro obj) {
		return tipoSeguroRepo.save(obj);
	}
	
	public List<TipoSeguro> findAll() {
		return tipoSeguroRepo.findAll();
	}
}
