package com.example.treinamentonova.domain;

import java.io.Serializable;

import javax.persistence.*;

@Entity
public class DadosCliente implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer Id;
	
	private Integer agenciaId;
	private Integer tipoCapitalId;
	private Integer tipoSeguroId;
	private String cnpj;
	private String razaoSocial;
	private String email;
	
	public DadosCliente() {}

	public DadosCliente(Integer agenciaId, Integer tipoCapitalId,
			Integer tipoSeguroId, String cnpj, String razaoSocial) {
		super();
		this.agenciaId = agenciaId;
		this.tipoCapitalId = tipoCapitalId;
		this.tipoSeguroId = tipoSeguroId;
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
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
