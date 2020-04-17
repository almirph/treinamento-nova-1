package com.example.treinamentonova.dto;

import java.io.Serializable;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.br.CNPJ;

public class DadosClienteDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer Id;
	
	@NotNull(message="Não pode estar vazio")
	private Integer agenciaId;
	
	@NotNull(message="Não pode estar vazio")
	private Integer tipoCapitalId;
	
	@NotNull(message="Não pode estar vazio")
	private Integer tipoSeguroId;
	
	@NotEmpty(message="Não pode estar vazio")
	@CNPJ(message="Cnpj não é válido")
	private String cnpj;
	
	@NotEmpty(message="Não pode estar vazio")
	@Length(min=5, max=120, message="O tamanho deve estar entre 5 e 120 caracteres")
	private String razaoSocial;
	
	@NotEmpty
	@Email
	private String email;
	
	public DadosClienteDTO() {}

	public DadosClienteDTO(Integer agenciaId, Integer tipoCapitalId,
			Integer tipoSeguroId, String cnpj, String razaoSocial, String email) {
		super();
		this.agenciaId = agenciaId;
		this.tipoCapitalId = tipoCapitalId;
		this.tipoSeguroId = tipoSeguroId;
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
		this.email = email;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public Integer getAgenciaId() {
		return agenciaId;
	}

	public void setAgenciaId(Integer agenciaId) {
		this.agenciaId = agenciaId;
	}

	public Integer getTipoCapitalId() {
		return tipoCapitalId;
	}

	public void setTipoCapitalId(Integer tipoCapitalId) {
		this.tipoCapitalId = tipoCapitalId;
	}

	public Integer getTipoSeguroId() {
		return tipoSeguroId;
	}

	public void setTipoSeguroId(Integer tipoSeguroId) {
		this.tipoSeguroId = tipoSeguroId;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	};
	
	
	
}

