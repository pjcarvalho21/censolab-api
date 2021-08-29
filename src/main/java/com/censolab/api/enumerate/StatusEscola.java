package com.censolab.api.enumerate;



public enum StatusEscola {

	ATIVA("Ativa"),
	INATIVA("Inativa");
	
	private String descricao;
	
	StatusEscola(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
}
