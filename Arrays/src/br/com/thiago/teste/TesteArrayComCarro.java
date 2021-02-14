package br.com.thiago.teste;

import br.com.thiago.dominio.Carro;

public class TesteArrayComCarro {

	// classe main
	public static void main(String[] args) {
		
		Carro[] carros = new Carro[4];
		
		carros[0] = new Carro();
		carros[0].anoDeFabricacao = 2011;
		
		System.out.println("Ano fabricacao: " + carros[0].anoDeFabricacao);
	}// fim main
}// fim classe