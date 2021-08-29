package com.censolab.api.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import com.censolab.api.enumerate.StatusEscola;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "tb_escola")
public class Escola {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idt_id;

	/* IDENTIFICAÇÃO */

	private String idt_tpregistro;

	private String idt_inep;

	//@NotEmpty(message = "NOME: não pode ser vazio!")
	//@Size(max = 100, message = "NOME: não pode conter mais de 100 caracteres")
	private String idtnome;

	private String idt_sitfunc;

	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Temporal(TemporalType.DATE)
	private Date idt_aletivof;
 
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Temporal(TemporalType.DATE)
	private Date idt_aletivoi;

	/*
	 * @DecimalMin(value = "-33.750833", message =
	 * "LATITUDE: Valor não pode ser menor que -33.750833")
	 * 
	 * @DecimalMax(value = "5.27222299", message =
	 * "LATITUDE: Valor não pode ser maior que 5.27222299")
	 */
	private String idt_latitude;

	/*
	 * @DecimalMin(value = "-73.9992222", message =
	 * "LONGITUDE: Valor não pode ser menor que -73.9992222")
	 * 
	 * @DecimalMax(value = "-32.4112800", message =
	 * "LONGITUDE: Valor não pode ser maior que -32.4112800")
	 */
	@Column(length = 20)
	private String idt_longitude;

//	@NotEmpty(message = "ENDEREÇO:não pode ser vazio!")
	@Column(length = 20)
	private String idt_end_desc;

	@Column(length = 20)
	private String idt_end_num;

	@Column(length = 20)
	private String idt_complemento;

	@Column(length = 20)
	private String idt_bairro;

	/*
	 * @NotEmpty(message = "CEP: não pode ser vazio!")
	 * 
	 * @Size(min = 8, message = "CEP: não pode conter menos de 8 caracteres")
	 */
	@Column(length = 20)
	private String idt_cep;

	@Column(length = 20)
	private String idt_ddd;

	// @NotEmpty(message = "UF: não pode ser vazio!")
	@Column(length = 20)
	private String idt_uf;

	// @NotEmpty(message = "MUNICIPIO:não pode ser vazio!")
	@Column(length = 20)
	private String idt_uf_mun;

	// @NotEmpty(message = "DISTRITO:não pode ser vazio!")
	@Column(length = 20)
	private String idt_distrito;

	@Column(length = 20)
	private String idt_tel;

	@Column(length = 20)
	private String idt_tel2;

	@Column(length = 20)
	private String idt_tel3;

	// @Pattern(regexp = ".+@.+\\.[a-z]+", message="EMAIL: Deve conter @ .")
	@Column(length = 20)
	private String idt_email;

	@Column(length = 20)
	private String idt_fax;

	@Column(length = 20)
	private String idt_dep_adm;

	@Column(length = 20)
	private String idt_org_regional;

	@Column(length = 20)
	private String idt_zona;

	@Column(length = 20)
	private String idt_categoria;

	@Column(length = 20)
	private String idt_conv;

	@Column(length = 20)
	private String idt_mant;

	@Column(length = 20)
	private String idt_cnpj_mant;

	@Column(length = 20)
	private String idt_auto_cons;

	@Column(length = 20)
	private String idt_cnpj;

	/*
	 * @ManyToOne
	 * 
	 * @JoinColumn(name = "gestor") private Gestor gestor;
	 * 
	 * @OneToMany(mappedBy = "escola") private List<Turma> turmas = new
	 * ArrayList<Turma>();
	 * 
	 * @ManyToMany(mappedBy = "escolas") private List<Professor> professores = new
	 * ArrayList<Professor>();
	 */

	/*
	 * @OneToMany(mappedBy = "escola", cascade = { CascadeType.ALL }) private
	 * List<AlunoEscola> escolasAluno;
	 */

	private String flativo;

	/* INFRAESTRUTURA */

	private String crtAbstAg;

	private String crtAbstEl;

	private String crtAbstEs;

	private String crtAee;

	private String crtAguaCons;

	private String crtAlimentacao;

	private String crtAtivComp;

	private String crtBndLarga;

	private String crtCodLingIndio;

	//@Size(max = 4, message = "Numéro máximo de 4 caracteres")
	private String crtComputAdm;

	@Column(name = "crt_comput_alu")
	//@Size(max = 4, message = "Numéro máximo de 4 caracteres")
	private String crtComputAlu;

	private String crtDependencias;

	private String crtDestLixo;

	private String crtEducIndigena;

	private String crtEnsfundCiclo;

	private String crtEspacoFds;

	private String crtEspacoTba;

	private String crtEtapa;

	private String crtFormOcup;

	private String crtInternet;

	private String crtLingIndio;

	private String crtLocFunc;

	private String crtLocalDiferenc;

	private String crtMatDidatico;

	private String crt_modalidade;

	private String crtPredcomp;

	//@Size(max = 8, message = "Codigo escola Compartilhada :Numéro máximo de 4 caracteres")
	private String crt_cod_pred1;
	
	//@Size(max = 8, message = "Codigo escola Compartilhada :Numéro máximo de 4 caracteres")
	private String crt_cod_pred2;
	
	//@Size(max = 8, message = "Codigo escola Compartilhada :Numéro máximo de 4 caracteres")
	private String crt_cod_pred3;
	
	//@Size(max = 8, message = "Codigo escola Compartilhada :Numéro máximo de 4 caracteres")
	private String crt_cod_pred4;
	
	//@Size(max = 8, message = "Codigo escola Compartilhada :Numéro máximo de 4 caracteres")
	private String crt_cod_pred5;
	
	//@Size(max = 8, message = "Codigo escola Compartilhada :Numéro máximo de 4 caracteres")
	private String crt_cod_pred6;

	private String crtPropFormAlter;

	private String crtSalas;

	private String crtSalasInad;

	private String crtTipoRegistro;

	//@Size(max = 4, message = "Numéro máximo de 4 caracteres")
	private String crtTotalFunc;

	private String crtComput;

	private String crt_Equipamentos;

	@Enumerated(EnumType.STRING)
	public StatusEscola status;

	public boolean isAtiva() {
		boolean resultado = false;
		this.status = StatusEscola.INATIVA;

		if (this.idt_sitfunc.equals("1")) {
			this.status = StatusEscola.ATIVA;
			resultado = true;
		}
		return resultado;
	}

}
