package com.censolab.api.model;

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
	private Long id;
	
	@Column(length = 1)
	private String flativo;
	
	@Column(length = 2)
	private String tipo_registro_id;
	
	@Column(length = 8)
	private String inep;
	
	@Column(length = 12)
	private String inep_escola;
	
	@Column(length = 100)
	private String nome;
	
	@Column(length = 100)
	private String email;
	
	@Column(length = 11)
	private String nis;

	@Column(length = 10)
	private String nascimento;
	
	@Column(length = 1)
	private String sexo;
	
	@Column(length = 1)
	private String raca;
	
	@Column(length = 100)
	private String mae;
	
	@Column(length = 1)
	private String nacionalidade;
	
	@Column(length = 3)
	private String pais;
	
	@Column(length = 2)
	private String uf;
	
	@Column(length = 7)
	private String municipio;
	
	@Column(length = 1)
	private String deficiente;
	
	@Column(length = 1)
	private String def_cegueira;
	
	@Column(length = 1)
	private String def_baixa_visao;
	
	@Column(length = 1)
	private String def_surdez;
	
	@Column(length = 1)
	private String def_auditiva;
	
	@Column(length = 1)
	private String def_surdo_cegueira;
	
	@Column(length = 1)
	private String def_fisica;
	
	@Column(length = 1)
	private String def_intelectual;
	
	@Column(length = 1)
	private String def_multipla;
	
	@Column(length =2 )
	private int _tipo_registro_doc;
	
	@Column(length = 11)
	private String cpf;
	
	@Column(length = 1)
	private String zona;
	
	@Column(length = 8)
	private String cep;
	
	@Column(length =100)
	private String endereco;
	
	@Column(length = 10)
	private String numero;
	
	@Column(length = 20)
	private String complemento;
	
	@Column(length = 50)
	private String bairro;
	
	@Column(length = 2)
	private String uf_moradia;
	
	@Column(length = 7)
	private String mun_moradia;

	@Column(length = 2)
	private String tipo_registro_var;
	
	@Column(length = 1)
	private String escolaridade;

	
	@Column(length = 1)
	private String situacao_curso_sup1;
	
	@Column(length = 1)
	private String formacao_pedag1;
	
	@Column(length = 6)
	private String curso_superior1;
	
	@Column(length = 4)
	private String inicio_curso1;
	
	@Column(length = 4)
	private String fim_curso1;
	
	@Column(length = 1)
	private String tipo_instituicao_sup1;
	
	@Column(length = 7)
	private String instituicao_sup1;

	
	
	@Column(length = 1)
	private String situacao_curso_sup2;
	
	@Column(length = 1)
	private String formacao_pedag2;
	
	@Column(length = 6)
	private String curso_superior2;
	
	@Column(length = 4)
	private String inicio_curso2;
	
	@Column(length = 4)
	private String fim_curso2;
	
	@Column(length = 1)
	private String tipo_instituicao_sup2;
	
	@Column(length = 7)
	private String instituicao_sup2;
	
	
	
	@Column(length = 1)
	private String situacao_curso_sup3;
	
	@Column(length = 1)
	private String formacao_pedag3;
	
	@Column(length = 6)
	private String curso_superior3;
	
	@Column(length = 4)
	private String inicio_curso3;
	
	@Column(length = 4)
	private String fim_curso3;
	
	@Column(length = 1)
	private String tipo_instituicao_sup3;
	
	@Column(length = 7)
	private String instituicao_sup3;

	
	@Column(length = 1)
	private String mestrado;
	
	@Column(length = 1)
	private String especializacao;
	
	@Column(length = 1)
	private String doutorado;
	
	@Column(length = 1)
	private String nenhum_curso;
	
	@Column(length = 16)
	private String outros;
	
	
	@Column(length = 2)
	private String tipo_registro_docencia;
	
	@Column(length = 1)
	private String funcao;
	
	@Column(length = 1)
	private String situacao_funcional;
    
	@Column(length = 2)
	private String Disciplina01;
    
	@Column(length = 2)
	private String Disciplina02;
    
	@Column(length = 2)
	private String Disciplina03;
    
	@Column(length = 2)
	private String Disciplina04;
    
	@Column(length = 2)
	private String Disciplina05;
    
	@Column(length = 2)
	private String Disciplina06;
    
	@Column(length = 2)
	private String Disciplina07;
    
	@Column(length = 2)
	private String Disciplina08;
    
	@Column(length = 2)
	private String Disciplina09;
    
	@Column(length = 2)
	private String Disciplina10;
    
	@Column(length = 2)
	private String Disciplina11;
    
	@Column(length = 2)
	private String Disciplina12;
    
	@Column(length = 2)
	private String Disciplina13;


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
