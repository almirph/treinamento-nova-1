package com.example.treinamentonova.domain;

import java.io.Serializable;

import javax.persistence.*;

@Entity
public class Agencia implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer Id;
	
	private String nome;
	private String numero;
	
	public Agencia() {}
	
	public Agencia(String nome, String numero) {
		super();
		this.nome = nome;
		this.numero = numero;
	}
	
	public Integer getId() { return Id; }

	public void setId(Integer id) { Id = id; };

	public String getNome() { return nome; }

	public void setNome(String nome) { this.nome = nome; }

	public String getNumero() { return numero; }

	public void setNumero(String numero) { this.numero = numero; }
	
}