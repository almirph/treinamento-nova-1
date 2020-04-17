package com.example.treinamentonova.domain;

import java.io.Serializable;

import javax.persistence.*;

@Entity
public class Cnae implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer Id;
	
	private String nome;
	private String codigo;
	
	public Cnae() {}
	
	public Cnae(String nome, String codigo) {
		super();
		this.nome = nome;
		this.codigo = codigo;
	}
	
	public Integer getId() { return Id; }

	public void setId(Integer id) { Id = id; };

	public String getNome() { return nome; }

	public void setNome(String nome) { this.nome = nome; }

	public String getCodigo() { return codigo; }

	public void setCodigo(String codigo) { this.codigo = codigo; };

	
	
}