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
	
	
	/*DOCUMENTO CIVIL*/
	@Column(name = "doc_cciv")
	private Long docCciv;

	@Column(name = "doc_cciv_emis", length = 10)
	private String docCcivEmis;

	@Column(name = "doc_cciv_folha", length = 4)
	private String docCcivFolha;

	@Column(name = "doc_cciv_idcto")
	private Long docCcivIdcto;

	@Column(name = "doc_cciv_livro", length = 8)
	private String docCcivLivro;

	@Column(name = "doc_cciv_mat", length = 32)
	private String docCcivMat;

	@Column(name = "doc_cciv_mncto")
	private String docCcivMncto;

	@Column(name = "doc_cciv_ntermo", length = 8)
	private String docCcivNtermo;

	@Column(name = "doc_cciv_ufcto")
	private String docCcivUfcto;

	@Column(name = "doc_cpf", length = 11)
	private String docCpf;

	@Column(name = "doc_falta")
	private Long docFalta;

	@Column(name = "doc_nis", length = 11)
	private String docNis;

	@Column(name = "doc_pport", length = 20)
	private String docPport;

	@Column(name = "doc_rg", length = 20)
	private String docRg;

	@Column(name = "doc_rg_compl", length = 4)
	private String docRgCompl;

	@Column(name = "doc_rg_emissor")
	private String docRgEmissor;

	@Column(name = "doc_rg_exp", length = 10)
	private String docRgExp;

	@Column(name = "doc_rg_uf")
	private Long docRgUf;

	@Column(name = "doc_tp_cciv")
	private Long docTpCciv;

	@Column(name = "doc_tpregistro")
	private Long docTpregistro;
	
	
	/*ENDEREÇO*/

	@Column(name = "end_bairro", length = 50)
	private String endBairro;

	@Column(name = "end_cep", length = 8)
	private String endCep;

	@Column(name = "end_compl", length = 20)
	private String endCompl;

	@Column(name = "end_desc", length = 100)
	private String endDesc;

	@Column(name = "end_nr", length = 10)
	private String endNr;

	@Column(name = "end_uf")
	private Long endUf;

	@Column(name = "end_uf_mun")
	private Long endUfMun;

	@Column(name = "end_zona")
	private Long endZona;

	@Column(name = "flativo", length = 1)
	private String flativo;

	
	/*IDENTIFICAÇÃO*/
	
	@Column(name = "reg_alu_aee")
	private Long regAluAee;

	@Column(name = "reg_filiacao")
	private Long regFiliacao;

	@Column(name = "reg_idinep_aluno")
	private String regIdinepAluno;

	@Column(name = "reg_idlocal")
	private String regIdlocal;

	@Column(name = "reg_mae")
	private String regMae;

	@Column(name = "reg_modo")
	private String regModo;

	@Column(name = "reg_nacional")
	private Long regNacional;

	@Column(name = "reg_nascimento")
	private String regNascimento;

	@Column(name = "reg_nis")
	private Long regNis;

	@Column(name = "reg_nome")
	private String regNome;

	@Column(name = "reg_pai")
	private String regPai;

	@Column(name = "reg_pais")
	private Long regPais;

	@Column(name = "reg_raca")
	private Long regRaca;

	@Column(name = "reg_recurso")
	private String regRecurso;

	@Column(name = "reg_sexo")
	private Long regSexo;

	@Column(name = "reg_situacao")
	private String regSituacao;

	@Column(name = "regDef")
	private String regDef;

	@Column(name = "reg_tpdef")
	private String regTpdef;

	@Column(name = "reg_tpregistro")
	private Long regTpregistro;

	@Column(name = "reg_mun_natal")
	private Long regMunNatal;

	@Column(name = "reg_uf_natal")
	private Long regUfNatal;
	
/*	VINCULAÇÃO*/

	@Column(name = "vinc_al_mat")
	private Long vincAlMat;

	@Column(name = "vinc_etapa")
	private String vincEtapa;

	@Column(name = "vinc_ingresso")
	private Long vincIngresso;

	@Column(name = "vinc_outroesp")
	private Long vincOutroesp;

	@Column(name = "vinc_tpregistro")
	private Long vincTpregistro;

	@Column(name = "vinc_transpub")
	private Long vincTranspub;

	@Column(name = "vinc_transpub_resp")
	private Long vincTranspubResp;

	@Column(name = "vinc_transpub_tp")
	private String vincTranspubTp;

	@Column(name = "vinc_tunif")
	private Long vincTunif;

	// bi-directional many-to-one association to AlunoEscola
	/*
	 * @OneToMany(mappedBy = "aluno", cascade = { CascadeType.ALL }) private
	 * List<AlunoEscola> escolasAluno;
	 */

	
	// bi-directional many-to-one association to AlunoEscola
	/*
	 * @OneToMany(mappedBy = "aluno", cascade = { CascadeType.ALL }) private
	 * List<AlunoTurma> TurmasAluno;
	 */
	
	@Transient
	private String idTurma;

	public Aluno() {
	}

	

	

}