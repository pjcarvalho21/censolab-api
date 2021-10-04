package com.censolab.api.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "tb_aluno")
public class Aluno implements Serializable {

	private static final long serialVersionUID = -7151247862597898695L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private Long id;
	
	@Column(length = 1)
	private String flativo;
	
	@Column(length =2 )
	private String tipo_registro;
	
	@Column(length = 12)
	private String inep;
	
	@Column(length = 100)
	private String nome;
	
	@Column(length = 11)
	private String nis;
	
	@Column(length =10 )
	private String nascimento;
	
	@Column(length = 1)
	private String cor;
	
	@Column(length = 1)
	private String filiacao;
	
	@Column(length = 100)
	private String mae;
	
	@Column(length = 100)
	private String pai;
	
	@Column(length = 1)
	private String nacionalidade;
	
	@Column(length = 2)
	private String pais;
	
	@Column(length = 2)
	private String uf;
	
	@Column(length = 7)
	private String municipio;
	
	@Column(length = 1)
	private String deficiente;
	
	@Column(length = 1)
	private String cegueira;
	
	@Column(length = 1)
	private String baixa_visao;
	
	@Column(length = 1)
	private String surdez;
	
	@Column(length = 1)
	private String deficiencia_auditiva;
	
	@Column(length = 1)
	private String surdo_cegueira;
	
	@Column(length = 1)
	private String deficiencia_fisica;
	
	@Column(length = 1)
	private String deficiencia_intelectual;
	
	@Column(length = 1)
	private String deficiencia_multipla;
	
	@Column(length = 1)
	private String autismo;
	
	@Column(length = 1)
	private String asperger;
	
	@Column(length = 1)
	private String rett;
	
	@Column(length = 1)
	private String desintegrativo_infancia;
	
	@Column(length = 1)
	private String superdotado;
	
	@Column(length = 1)
	private String auxilio_ledor;
	
	@Column(length = 1)
	private String auxilio_transcricao;
	
	@Column(length = 1)
	private String guia_interprete;
	
	@Column(length = 1)
	private String interprete_libras;
	
	@Column(length = 1)
	private String leitura_labial;
	
	@Column(length = 1)
	private String prova_16;
	
	@Column(length = 1)
	private String prova_20;
	
	@Column(length = 1)
	private String prova_24;
	
	@Column(length = 1)
	private String prova_braile;
	
	@Column(length = 1)
	private String sem_recurso;
	
	@Column(length = 2)
	private String tipo_registro_doc;
	
	@Column(length = 20)
	private String rg;
	
	@Column(length = 4)
	private String rg_complemento;
	
	@Column(length = 2)
	private String rg_emissor;
	
	@Column(length = 2)
	private String rg_uf;
	
	@Column(length = 10)
	private String rg_expedicao;
	
	@Column(length = 1)
	private String certidao_modelo;
	
	@Column(length = 1)
	private String certidao_tipo;
	
	@Column(length = 8)
	private String certidao_termo;
	
	@Column(length = 4)
	private String certidao_folha;
	
	@Column(length = 8)
	private String certidao_livro;
	
	@Column(length = 10)
	private String certidao_emissao;
	
	@Column(length = 2)
	private String certidao_uf_cartorio;
	
	@Column(length = 7)
	private String certidao_mun_cartorio;
	
	@Column(length = 6)
	private String certidao_cod_cartorio;
	
	@Column(length = 32)
	private String certidao_matricula;
	
	@Column(length = 11)
	private String cpf;
	
	@Column(length = 20)
	private String passaporte;
	
	@Column(length = 1)
	private String justificativa_falta_doc;
	
	@Column(length = 1)
	private String zona_residencia;
	
	@Column(length = 8)
	private String cep;
	
	@Column(length = 100)
	private String endereco;
	
	@Column(length = 10)
	private String numero_casa;
	
	@Column(length = 20)
	private String endereco_complemento;
	
	@Column(length = 50)
	private String bairro;
	
	@Column(length = 2)
	private String endereco_uf;
	
	@Column(length = 7)
	private String endereco_municipio;
	
	@Column(length = 2)
	private String tipo_registro_vinc;
	
	@Column(length = 12)
	private String matricula;
	
	@Column(length = 1)
	private String turma_unificada;
	
	@Column(length = 2)
	private String etapa;
	
	@Column(length = 1)
	private String outro_espaco;
	
	@Column(length = 1)
	private String transporte;
	
	@Column(length = 1)
	private String transporte_responsavel;
	
	@Column(length = 11)
	private String tipo_veiculo;
	
	@Column(length = 2)
	private String forma_ingresso;
	
	
}