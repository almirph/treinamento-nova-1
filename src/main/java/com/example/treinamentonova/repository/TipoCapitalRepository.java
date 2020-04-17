package com.example.treinamentonova.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.treinamentonova.domain.TipoCapital;

@Repository
public interface TipoCapitalRepository extends JpaRepository<TipoCapital, Integer> {
	
}
