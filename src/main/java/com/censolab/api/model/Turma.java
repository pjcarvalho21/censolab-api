package com.censolab.api.model;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import lombok.Data;
import lombok.EqualsAndHashCode;



@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "Turma")
public class Turma implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "Escola_idInep")
	private String escola_idInep;

	@Column(name = "flativo")
	private String flativo;

	@Column(name = "reg_atvd_comp")
	private String regAtvdComp;

	@Column(name = "reg_atvd_aee")
	private String regAtvdAee;

	@Column(name = "reg_dias")
	private String regDias;

	@Column(name = "reg_disciplina")
	private String regDisciplina;
 
	@Column(name = "reg_horarioInicial")
//	@NotEmpty(message = "HORARIO ENTRADA: não pode ser vazio!")
	private String regHorarioInicial;
	
	@Column(name = "reg_horarioFinal")
	//@NotEmpty(message = "HORARIO SAÍDA: não pode ser vazio!")
	private String regHorarioFinal;

	@Column(name = "reg_idinep")
	private String regIdinep;

	@Column(name = "reg_idturmalocal")
	private String regIdturmalocal;

	@Column(name = "reg_maiseduc")
	private String regMaiseduc;

	@Column(name = "reg_modal")
	private String regModal;

	@Column(name = "reg_etapa")
	private String regEtapa;

	@Column(name = "reg_educ_prof")
	private String regEducProf;
	
	//@NotEmpty(message = "NOME: não pode ser vazio!")
	private String reg_nome;

	@Column(name = "reg_semprof")
	private String regSemprof;

	@Column(name = "reg_tpatend")
	//@NotEmpty(message = "ATENDIMENTO: não pode ser vazio!")
	private String regTpatend;

	@Column(name = "reg_tpregistro")
	private Long regTpregistro;
	
	@Transient
	private String nmModalidade;
	
	
	@ManyToMany
	@JoinTable(name = "ProfessorTurma", joinColumns = { @JoinColumn(name = "id_Turma") }, inverseJoinColumns = {
			@JoinColumn(name = "id_Prof") })
	private List<Professor> professores;

	public String getNmModalidade() {
		
		switch (this.regModal) {
		case "1":
			nmModalidade = "Ensino regular";
			break;
		case "2":
			nmModalidade = "Educação Especial";
            break;
		default:
			nmModalidade = "Educação de Jovens e Adultos";
			break;
		}
		 
		
		
		
		return nmModalidade;
	}

	/*
	 * @ManyToOne
	 * 
	 * @JoinColumn(name = "id_escola") private Escola escola = new Escola();
	 */

	// bi-directional many-to-many association to Disciplina
	/*@ManyToMany(cascade = { CascadeType.MERGE })
	@JoinTable(name = "DisciplinaTurma", joinColumns = { @JoinColumn(name = "id_Turma") }, inverseJoinColumns = { @JoinColumn(name = "id_Disc") })
	private List<Disciplina> disciplinas;*/

	

	public Turma() {
	}
	
	/*
	 * public Turma(Escola e) { this.escola = e; }
	 */

	
	

}