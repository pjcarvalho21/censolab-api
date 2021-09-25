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
	private Long id;

	@Column(length = 2)
	private String tipo_registro;

	@Column(length = 8)
	private String inep_escola;

	@Column(length = 10)
	private String inep;

	@Column(length = 80)
	private String nome;

	@Column(length = 1)
	private String flativo;
	@Column(length = 4)
	private String Horario_Inicio;
	@Column(length = 4)
	private String Horario_fim;
	@Column(length = 6)
	private String dias;
	@Column(length = 1)
	private String tipo_atendimento;
	@Column(length = 1)
	private String mais_educa;

	@Column(length = 5)
	private String codigo_atividade1;

	@Column(length = 5)
	private String codigo_atividade2;

	@Column(length = 5)
	private String codigo_atividade3;

	@Column(length = 5)
	private String codigo_atividade4;

	@Column(length = 5)
	private String codigo_atividade5;

	@Column(length = 5)
	private String codigo_atividade6;

	@Column(length = 10)
	private String ativdade_aee;

	@Column(length = 1)
	private String modalidade;
	@Column(length = 2)
	private String etapa;

	@Column(length = 8)
	private String educacao_profissional;

	@Column(length = 25)
	private String disciplina;

	@Column(length = 1)
	private String sem_profissional;

	/*
	 * @ManyToMany
	 * 
	 * @JoinTable(name = "ProfessorTurma", joinColumns = { @JoinColumn(name =
	 * "id_Turma") }, inverseJoinColumns = {
	 * 
	 * @JoinColumn(name = "id_Prof") }) private List<Professor> professores;
	 */

	/*
	 * public String getNmModalidade() {
	 * 
	 * switch (this.Modal) { case "1": nmModalidade = "Ensino ular"; break; case
	 * "2": nmModalidade = "Educação Especial"; break; default: nmModalidade =
	 * "Educação de Jovens e Adultos"; break; }
	 * 
	 * 
	 * 
	 * 
	 * return nmModalidade; }
	 */

	/*
	 * @ManyToOne
	 * 
	 * @JoinColumn(name = "id_escola") private Escola escola = new Escola();
	 */

	// bi-directional many-to-many association to Disciplina
	/*
	 * @ManyToMany(cascade = { CascadeType.MERGE })
	 * 
	 * @JoinTable(name = "DisciplinaTurma", joinColumns = { @JoinColumn(name =
	 * "id_Turma") }, inverseJoinColumns = { @JoinColumn(name = "id_Disc") })
	 * private List<Disciplina> disciplinas;
	 */

}