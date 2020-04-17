package com.example.treinamentonova;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.treinamentonova.domain.Agencia;
import com.example.treinamentonova.domain.Cnae;
import com.example.treinamentonova.domain.Ramo;
import com.example.treinamentonova.domain.TipoCapital;
import com.example.treinamentonova.domain.TipoSeguro;
import com.example.treinamentonova.repository.AgenciaRepository;
import com.example.treinamentonova.repository.CnaeRepository;
import com.example.treinamentonova.repository.RamoRepository;
import com.example.treinamentonova.repository.TipoCapitalRepository;
import com.example.treinamentonova.repository.TipoSeguroRepository;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class TreinamentoNovaApplication implements CommandLineRunner {
	
	@Autowired
	private RamoRepository ramoRepo; 
	
	@Autowired
	private TipoSeguroRepository tipoSeguroRepo; 
	
	@Autowired
	private CnaeRepository cnaeRepo; 
	
	@Autowired 
	private TipoCapitalRepository tipoCapitalRepo;
	
	@Autowired 
	private AgenciaRepository agenciaRepo;

	public static void main(String[] args) {
		SpringApplication.run(TreinamentoNovaApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		Ramo ramo1 = new Ramo("Acidentes Pessoais");
		Ramo ramo2 = new Ramo("Vida em Grupo");
		ramoRepo.saveAll(Arrays.asList(ramo1, ramo2));
		
		TipoSeguro tipoSeguro1 = new TipoSeguro("Seguro Novo");	
		tipoSeguroRepo.saveAll(Arrays.asList(tipoSeguro1));
		
		TipoCapital tipoCapital1 = new TipoCapital("Não Contributário");
		tipoCapitalRepo.saveAll(Arrays.asList(tipoCapital1));
		
		Cnae cnae1 = new Cnae("Fabrição de tecidos especiais, inclusive artefatos", "1354500"); 
		Cnae cnae2 = new Cnae("Estúdios cinematográficos", "5911101"); 
		Cnae cnae3 = new Cnae("Fabricação de vinhos", "1112700"); 
		Cnae cnae4 = new Cnae("Sociedades de capitalização", "6450600"); 
		Cnae cnae5 = new Cnae("Educação Superior - Pós-graduação e extrensão", "8533300"); 
		
		cnaeRepo.saveAll(Arrays.asList(cnae1, cnae2, cnae3, cnae4, cnae5));
		
		Agencia agencia1 = new Agencia("SANTANA DE PARNAIBA", "1596");
		Agencia agencia2 = new Agencia("IPUEIRAS", "2139");
		Agencia agencia3 = new Agencia("CAMPOS GOYTACAZES", "5");
		Agencia agencia4 = new Agencia("CAMACARI", "1238");
		Agencia agencia5 = new Agencia("VOTORANTIM", "995");
		
		agenciaRepo.saveAll(Arrays.asList(agencia1, agencia2, agencia3, agencia4, agencia5));
	}
}
