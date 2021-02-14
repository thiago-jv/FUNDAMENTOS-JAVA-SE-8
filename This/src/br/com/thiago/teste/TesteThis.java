package br.com.thiago.teste;

import br.com.thiago.dominio.Carro;

public class TesteThis {

	public static void main(String[] args) {
		
		Carro carro = new Carro();

		carro.modelo = "Fiati";
		System.out.println("Modelo antes do this: " +carro.modelo);

		carro.alterarModelo("Civic");
		System.out.println("Modelo depois com o this: " +carro.modelo);
	}

}
