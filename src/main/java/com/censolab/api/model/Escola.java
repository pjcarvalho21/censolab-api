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

	@Column(length = 2)
	private String tipo_registro;

	@Column(length = 8)
	private String inep;

	@Column(length = 1)
	private String situacao_funcional;

	@Column(length = 10)
	private Date ano_letivo_inicio;

	@Column(length = 10)
	private Date ano_letivo_fim;

	@Column(length = 100)
	private String nome;

	@Column(length = 20)
	private String latitude;

	@Column(length = 20)
	private String longitude;

	@Column(length = 8)
	private String cep;

	@Column(length = 100)
	private String endereco;

	@Column(length = 10)
	private String endereco_numero;

	@Column(length = 20)
	private String complemento;

	@Column(length = 50)
	private String bairro;

	@Column(length = 2)
	private String uf;

	@Column(length = 7)
	private String municipio;

	@Column(length = 2)
	private String distrito;

	@Column(length = 2)
	private String ddd;

	@Column(length = 9)
	private String telefone1;

	@Column(length = 8)
	private String telefone2;

	@Column(length = 9)
	private String telefone3;

	@Column(length = 8)
	private String fax;

	@Column(length = 50)
	private String email;

	@Column(length = 5)
	private String orgao_regional;

	@Column(length = 1)
	private String dependencia_adm;

	@Column(length = 1)
	private String local_zona;

	@Column(length = 1)
	private String categoria;

	@Column(length = 1)
	private String convenio;

	@Column(length = 1)
	private String mantenedor;

	@Column(length = 14)
	private String mantenedor_cnpj;

	@Column(length = 14)
	private String cnpj;

	@Column(length = 1)
	private String autorizacao;

	@Column(length = 10)
	private String local_funcionamnto;

	@Column(length = 1)
	private String forma_ocupacao;
	
	@Column(length = 1)
	private String predio_compartilhado;

	@Column(length = 8)
	private String codigo_predio1;

	@Column(length = 8)
	private String codigo_predio2;

	@Column(length = 8)
	private String codigo_predio3;

	@Column(length = 8)
	private String codigo_predio4;
	
	@Column(length = 8)
	private String codigo_predio5;
	
	@Column(length = 8)
	private String codigo_predio6;

	@Column(length = 10)
	private String agua_consumida;
	
	@Column(length = 5)
	private String abastec_agua;

	@Column(length = 4)
	private String abastec_eletrico;

	@Column(length = 3)
	private String abastec_esgoto;

	@Column(length = 6)
	private String destino_lixo;

	@Column(length = 35)
	private String dependencias;

	@Column(length = 4)
	private String n_salas;

	@Column(length = 4)
	private String salas_improviso;

	@Column(length = 12)
	private String equipamentos;

	@Column(length = 4)
	private String computadores_adm;

	@Column(length = 4)
	private String computadores_aluno;

	@Column(length = 1)
	private String internet;

	@Column(length = 1)
	private String banda_larga;

	@Column(length = 4)
	private String n_funcionarios;
	
	@Column(length = 1)
	private String alimentacao;

	@Column(length = 1)
	private String aee;

	@Column(length = 1)
	private String atividade_comp;

	@Column(length = 3)
	private String modalidade;

	@Column(length = 21)
	private String etapa;

	@Column(length = 1)
	private String ensido_ciclo;

	@Column(length = 1)
	private String localizacao_dif;

	@Column(length = 3)
	private String material_didatico;

	@Column(length = 1)
	private String educacao_indio;

	@Column(length = 2)
	private String lingua_indio;

	@Column(length = 5)
	private String codigo_lingua_indio;

	@Column(length = 1)
	private String espaco_br_alfa;

	@Column(length = 1)
	private String espaco_fds;

	@Column(length = 1)
	private String formacao_alternancia;

}
