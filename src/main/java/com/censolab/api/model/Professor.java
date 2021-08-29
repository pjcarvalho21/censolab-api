package com.censolab.api.model;



import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "professor")
public class Professor implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1991961628592542694L;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/* Identificação */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	private String flativo;
	private int idTurma;
	private int idtTpregistro;
	private Integer idtIdinep;
	private String idtIdlocal;
	private String idtNome;
	private String idtEmail;
	private Integer idtNis;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Temporal(TemporalType.DATE)
	private Date idtNascimento;
	private int idtSexo;
	private int idtRaca;
	private String idtNmmae;
	private int idtNac;
	private int idtPais;
	private Integer idtUfnatal;
	private Integer idtCidnatal;
	private Integer idtSlAulaAee;
	private String idtDef;
	private String idtListaDef;

	/* Documento e endereço */
	private int docTpregistro;
	private String docCpf;
	private Integer docZona;
	private String docCep;
	private String docEnd;
	private String docEndNum;
	private String docComplemento;
	private String docBairro;
	private Integer docUf;
	private Integer docUfMun;

	/* Dados variáveis */
	private Integer dvrTpregistro;
	private String dvrEscolaridade;
	private String dvrMest;
	private Integer dvrEsp;
	private String dvrDout;
	private String dvrCurso;

	private String DvrSitCs1;
	private String DvrFormPedg1;
	private String DvrCodCsup1;
	private String DvrInicioCsup1;
	private String DvrFimCsup1;
	private String DvrTipInstCsup1;
	private String DvrCodInstCsup1;

	private String DvrSitCs2;
	private String DvrFormPedg2;
	private String DvrCodCsup2;
	private String DvrInicioCsup2;
	private String DvrFimCsup2;
	private String DvrTipInstCsup2;
	private String DvrCodInstCsup2;

	private String DvrSitCs3;
	private String DvrFormPedg3;
	private String DvrCodCsup3;
	private String DvrInicioCsup3;
	private String DvrFimCsup3;
	private String DvrTipInstCsup3;
	private String DvrCodInstCsup3;

	/* Dados de docência */
	private int ddcTpregistro;
	private int ddcFuncao;
	private Integer ddcDfuncional;
    private Long ddcDisciplina01;
    private Long ddcDisciplina02;
    private Long ddcDisciplina03;
    private Long ddcDisciplina04;
    private Long ddcDisciplina05;
    private Long ddcDisciplina06;
    private Long ddcDisciplina07;
    private Long ddcDisciplina08;
    private Long ddcDisciplina09;
    private Long ddcDisciplina10;
    private Long ddcDisciplina11;
    private Long ddcDisciplina12;
    private Long ddcDisciplina13;

	public Professor() {

	}

	/*
	 * @ManyToMany
	 * 
	 * @JoinTable(name = "ProfessorEscola", joinColumns = { @JoinColumn(name =
	 * "id_Prof") }, inverseJoinColumns = {
	 * 
	 * @JoinColumn(name = "id_Escola") }) private List<Escola> escolas;
	 * 
	 * @ManyToMany(mappedBy="professores") private List<Turma> turmas = new
	 * ArrayList<Turma>();
	 */
	


	
	

}
