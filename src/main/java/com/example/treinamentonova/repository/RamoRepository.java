package com.example.treinamentonova.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.treinamentonova.domain.Ramo;

@Repository
public interface RamoRepository extends JpaRepository<Ramo, Integer> {
	
}
