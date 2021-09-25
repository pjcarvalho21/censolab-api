package com.censolab.api.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

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
	
	private String tipo_registro;
	private String inep;
	private String nome;
	private String nis;
	private String nascimento;
	private String cor;
	private String filiacao;
	private String mae;
	private String pai;
	private String nacionalidade;
	private String pais;
	private String uf;
	private String municipio;
	private String deficiente;
	private String cegueira;
	private String baixa_visao;
	private String surdez;
	private String deficiencia_auditiva;
	private String surdo_cegueira;
	private String deficiencia_fisica;
	private String deficiencia_intelectual;
	private String deficiencia_multipla;
	private String autismo;
	private String asperger;
	private String rett;
	private String desintegrativo_infancia;
	private String superdotado;
	
	private String recurso;
	private String auxilio_ledor;
	private String auxilio_transcricao;
	private String guia_interprete;
	private String interprete_libras;
	private String leitura_labial;
	private String prova_16;
	private String prova_20;
	private String prova_24;
	private String prova_braile;
	private String sem_recurso;
	private String tipo_registro_doc;
	private String rg;
	private String rg_complemento;
	private String rg_emissor;
	private String rg_uf;
	private String rg_expedicao;
	private String certidao_modelo;
	private String certidao_tipo;
	private String certidao_termo;
	private String certidao_folha;
	private String certidao_livro;
	private String certidao_emissao;
	private String certidao_uf_cartorio;
	private String certidao_mun_cartorio;
	private String certidao_cod_cartorio;
	private String certidao_matricula;
	private String cpf;
	private String passaporte;
	private String justificativa_falta_doc;
	private String zona_residencia;
	private String cep;
	private String endereco;
	private String numero_casa;
	private String endereco_complemento;
	private String bairro;
	private String endereco_uf;
	private String endereco_municipio;
	
	private String tipo_registro_vinc;
	private String matricula;
	private String turma_unificada;
	private String etapa;
	private String outro_espaco;
	private String transporte;
	private String transporte_responsavel;
	private String tipo_veiculo;
	private String forma_ingresso;
	
	
}