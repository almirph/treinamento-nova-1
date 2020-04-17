package com.example.treinamentonova.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TipoCapital implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer Id;
	
	private String nome;

	public TipoCapital() {}
	
	public TipoCapital(String nome) {
		super();
		this.nome = nome;
	}
	
	public Integer getId() { return Id; }

	public void setId(Integer id) { Id = id; };

	public String getNome() { return nome; }

	public void setNome(String nome) { this.nome = nome; };
}
