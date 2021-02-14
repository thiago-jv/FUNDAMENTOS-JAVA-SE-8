package br.com.thiago.dominio;

public class Carro {

	public String fabricante;
	public String modelo;
	public String cor;
	public int anoDeFabricacao; 
	public boolean biCombustivel;
	
	public void ligar() {
		if (modelo != null) {
			System.out.println("Ligando o carro: " + modelo);
		}
	}
	
}