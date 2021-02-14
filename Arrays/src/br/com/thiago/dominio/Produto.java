package br.com.thiago.dominio;

public class Produto {

	public String descricao;
    public int quantidade;
	
	public void descrever() {
		System.out.println(descricao + " - " + quantidade + " itens");
	}
	
}
