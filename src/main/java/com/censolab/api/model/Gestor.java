package com.censolab.api.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "tb_gestor")
public class Gestor implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	// @NotEmpty(message="NOME: Campo não pode ser vazio!")
	private String crtNome;

	// @NotEmpty(message="CPF: Campo não pode ser vazio!")
	private String crtCpf;

	private String flativo;

	private int crtCargo;

	private String vinculado;

	// @NotEmpty
	// @Pattern(regexp = ".+@.+\\.[a-z]+", message="EMAIL: Deve conter @ .")
	private String crtEmail;

	public Gestor() {
	}

	public Gestor(String crtCpf, String crtNome, int crtCargo, String crtEmail) {
		this.crtCpf = crtCpf;
		this.crtNome = crtNome;
		this.crtCargo = crtCargo;
		this.crtEmail = crtEmail;

	}

	/*
	 * @OneToMany(mappedBy = "gestor", cascade = { CascadeType.MERGE }) private
	 * List<Escola> escolas = new ArrayList<Escola>();
	 */
	public String getDescricaoCargo() {
		String descricaoCargo;

		if (getCrtCargo() == 1) {
			descricaoCargo = "Diretor";
		} else {
			descricaoCargo = "Outro Cargo";
		}
		return descricaoCargo;
	}

}
