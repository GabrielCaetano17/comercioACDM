package com.itb.inf2am.comercioACDM.model;

public class Produto {

	private String id;
	private String nome;
	private String descricao;
	private String codigoBarras;
	private double preco;
	private boolean codStatus;
	
	
	public void setId(int i) {
		// TODO Auto-generated method stub
		
	}

	public void setNome(String string) {
		// TODO Auto-generated method stub
		
	}

	public void setDescricao(String string) {
		// TODO Auto-generated method stub
		
	}

	public void setCodigoBarras(String string) {
		// TODO Auto-generated method stub
		
	}

	public void setPreco(double d) {
		// TODO Auto-generated method stub
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public String getCodigoBarras() {
		return codigoBarras;
	}

	public double getPreco() {
		return preco;
	}
	
	public boolean isCodStatus() {
		return codStatus;
	}
	public void setCodStatus(boolean codStatus) {
		this.codStatus = codStatus;
	}
}

