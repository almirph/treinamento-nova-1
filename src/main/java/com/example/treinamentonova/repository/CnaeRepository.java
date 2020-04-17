package com.example.treinamentonova.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.treinamentonova.domain.Cnae;

@Repository
public interface CnaeRepository extends JpaRepository<Cnae, Integer> {
	
}
