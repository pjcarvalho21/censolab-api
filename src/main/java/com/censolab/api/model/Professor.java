package com.censolab.api.model;

import java.util.Date;

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
@Table(name = "professor")
public class Professor implements java.io.Serializable {

	
	private static final long serialVersionUID = 1991961628592542694L;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	private String flativo;
	private int tipo_registro_id;
	private Integer inep;
	private Integer inep_escola;
	private String nome;
	private String email;
	private Integer nis;

	private Date nascimento;
	private int nexo;
	private int raca;
	private String mae;
	private int nacionalidade;
	private int pais;
	private Integer uf;
	private Integer municipio;
	private String deficiente;
	
	private String def_cegueira;
	private String def_baixa_visao;
	private String def_surdez;
	private String def_auditiva;
	private String def_surdo_cegueira;
	private String def_fisica;
	private String def_intelectual;
	private String def_multipla;
	
	
	
	
	
	private Integer SlAulaAee;
	
	private String ListaDef;

	
	private int _tipo_registro_doc;
	private String cpf;
	private Integer zoza;
	private String cep;
	private String endereco;
	private String numero;
	private String complemento;
	private String bairro;
	private Integer uf_moradia;
	private Integer mun_moradia;

	
	private Integer tipo_registro_var;
	private String escolaridade;

	private String situacao_curso_sup1;
	private String formacao_pedag1;
	private String curso_superior1;
	private String inicio_curso1;
	private String fim_curso1;
	private String tipo_instituicao_sup1;
	private String instituicao_sup1;

	private String situacao_curso_sup2;
	private String formacao_pedag2;
	private String curso_superior2;
	private String inicio_curso2;
	private String fim_curso2;
	private String tipo_instituicao_sup2;
	
	private String situacao_curso_sup3;
	private String formacao_pedag3;
	private String curso_superior3;
	private String inicio_curso3;
	private String fim_curso3;
	private String tipo_instituicao_sup3;
	private String instituicao_sup3;
;

	private String mestrado;
	private Integer especializacao;
	private String doutorado;
	private String nenhum_curso;
	private String outros;
	
	
	
	private int tipo_registro_docen;
	private int funcao;
	private Integer situacao_funcional;
    private Long Disciplina01;
    private Long Disciplina02;
    private Long Disciplina03;
    private Long Disciplina04;
    private Long Disciplina05;
    private Long Disciplina06;
    private Long Disciplina07;
    private Long Disciplina08;
    private Long Disciplina09;
    private Long Disciplina10;
    private Long Disciplina11;
    private Long Disciplina12;
    private Long Disciplina13;


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
