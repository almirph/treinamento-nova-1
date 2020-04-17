package com.example.treinamentonova.domain;

import java.io.Serializable;

import javax.persistence.*;

@Entity
public class Ramo implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer Id;
	
	private String nome;

	public Ramo() {}
	
	public Ramo(String nome) {
		super();
		this.nome = nome;
	}
	
	public Integer getId() { return Id; }

	public void setId(Integer id) { Id = id; };

	public String getNome() { return nome; }

	public void setNome(String nome) { this.nome = nome; };

}
