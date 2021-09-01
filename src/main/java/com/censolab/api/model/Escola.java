package com.censolab.api.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.censolab.api.enumerate.StatusEscola;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "tb_escola")
public class Escola implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(length = 10)
	@Enumerated(EnumType.STRING)
	public StatusEscola status;

	@Column(length = 1)
	private String flativo;

	@Column(length = 10)
	private String tipo_registro;

	@Column(length = 10)
	private String inep;

	@Column(length = 10)
	private String situacao_funcional;

	@Column(length = 10)
	private Date ano_letivo_inicio;

	@Column(length = 10)
	private Date ano_letivo_fim;

	@Column(length = 10)
	private String nome;

	@Column(length = 10)
	private String latitude;

	@Column(length = 10)
	private String longitude;

	@Column(length = 10)
	private String cep;

	@Column(length = 10)
	private String endereco;

	@Column(length = 10)
	private String endereco_numero;

	@Column(length = 10)
	private String complemento;

	@Column(length = 10)
	private String bairro;

	@Column(length = 10)
	private String uf;

	@Column(length = 10)
	private String municipio;

	@Column(length = 10)
	private String distrito;

	@Column(length = 10)
	private String ddd;

	@Column(length = 10)
	private String telefone1;

	@Column(length = 10)
	private String telefone2;

	@Column(length = 10)
	private String telefone3;

	@Column(length = 10)
	private String fax;

	@Column(length = 10)
	private String email;

	@Column(length = 10)
	private String orgao_regional;

	@Column(length = 10)
	private String dependencia_adm;

	@Column(length = 10)
	private String local_zona;

	@Column(length = 10)
	private String categoria;

	@Column(length = 10)
	private String convenio;

	@Column(length = 10)
	private String mantenedor;

	@Column(length = 10)
	private String mantenedor_cnpj;

	@Column(length = 10)
	private String cnpj;

	@Column(length = 10)
	private String autorizacao;

	@Column(length = 10)
	private String local_funcionamnto;

	@Column(length = 10)
	private String forma_ocupacao;
	
	@Column(length = 10)
	private String predio_compartilhado;

	@Column(length = 10)
	private String codigo_predio1;

	@Column(length = 10)
	private String codigo_predio2;

	@Column(length = 10)
	private String codigo_predio3;

	@Column(length = 10)
	private String codigo_predio4;
	
	@Column(length = 10)
	private String codigo_predio5;
	
	@Column(length = 10)
	private String codigo_predio6;

	@Column(length = 10)
	private String agua_consumida;
	
	@Column(length = 10)
	private String abastec_agua;

	@Column(length = 10)
	private String abastec_eletrico;

	@Column(length = 10)
	private String abastec_esgoto;

	@Column(length = 10)
	private String destino_lixo;

	@Column(length = 10)
	private String dependencias;

	@Column(length = 10)
	private String n_salas;

	@Column(length = 10)
	private String salas_improviso;

	@Column(length = 10)
	private String equipamentos;

	@Column(length = 10)
	private String computadores_adm;

	@Column(length = 10)
	private String computadores_aluno;

	@Column(length = 10)
	private String internet;

	@Column(length = 10)
	private String banda_larga;

	@Column(length = 10)
	private String n_funcionarios;
	
	@Column(length = 10)
	private String alimentacao;

	@Column(length = 10)
	private String aee;

	@Column(length = 10)
	private String atividade_comp;

	@Column(length = 10)
	private String modalidade;

	@Column(length = 10)
	private String etapa;

	@Column(length = 10)
	private String ensido_ciclo;

	@Column(length = 10)
	private String localizacao_dif;

	@Column(length = 10)
	private String material_didatico;

	@Column(length = 10)
	private String educacao_indio;

	@Column(length = 10)
	private String lingua_indio;

	@Column(length = 10)
	private String codigo_lingua_indio;

	@Column(length = 10)
	private String espaco_br_alfa;

	@Column(length = 10)
	private String espaco_fds;

	@Column(length = 10)
	private String formacao_alternancia;

}
