package br.com.thiago.enums;

public enum Nipe {

	OURO("Vermelho"),
	PAUS("Preto"),
	ESPADA("Preto"),
	COPAS("Vermelho");
	
	private String cor;
	
	Nipe(String cor) {
		this.cor = cor;
	}
	
	public String getCor() {
		return cor;
	}
}
