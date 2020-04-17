package com.example.treinamentonova.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.treinamentonova.domain.DadosCliente;

@Repository
public interface DadosClienteRepository extends JpaRepository<DadosCliente, Integer> {
	
}
