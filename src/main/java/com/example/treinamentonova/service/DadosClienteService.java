package com.example.treinamentonova.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.treinamentonova.domain.DadosCliente;
import com.example.treinamentonova.dto.DadosClienteDTO;
import com.example.treinamentonova.repository.AgenciaRepository;
import com.example.treinamentonova.repository.DadosClienteRepository;
import com.example.treinamentonova.repository.RamoRepository;
import com.example.treinamentonova.repository.TipoCapitalRepository;
import com.example.treinamentonova.repository.TipoSeguroRepository;

import ErrorHandller.NotFoundId;

@Service
public class DadosClienteService {
	
	@Autowired
	private DadosClienteRepository dadosClienteRepo;
	
	@Autowired
	private AgenciaRepository agenciaRepo;
	
	@Autowired
	private RamoRepository ramoRepo;
	
	@Autowired
	private TipoCapitalRepository tipoCapitalRepo;
	
	@Autowired
	private TipoSeguroRepository tipoSeguroRepo;

	public List<DadosCliente> findAll() {
		return dadosClienteRepo.findAll();
	}
	
	public DadosCliente fromDTO(DadosClienteDTO objDto) {
        return new DadosCliente(objDto.getAgenciaId(), objDto.getTipoCapitalId(), objDto.getTipoSeguroId(), objDto.getCnpj(), objDto.getRazaoSocial());
    }
	
    @Transactional
    public DadosCliente insert(DadosCliente obj) {
    	verificaIds(obj);
        obj.setId(null);
        dadosClienteRepo.save(obj);
        return obj;
    }
    
    public void verificaIds(DadosCliente obj) {
    	agenciaRepo.findById(obj.getAgenciaId()).orElseThrow(() -> new NotFoundId(obj.getAgenciaId(), "Agência"));
    	tipoCapitalRepo.findById(obj.getTipoCapitalId()).orElseThrow(() -> new NotFoundId(obj.getTipoCapitalId(), "Tipo Contribuição"));
    	tipoSeguroRepo.findById(obj.getTipoSeguroId()).orElseThrow(() -> new NotFoundId(obj.getTipoSeguroId(), "Tipo Seguro"));
    }

}
