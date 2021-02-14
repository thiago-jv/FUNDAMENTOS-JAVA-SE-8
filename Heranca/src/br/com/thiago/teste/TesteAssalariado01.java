package br.com.thiago.teste;

import br.com.thiago.dominio.Assalariado;

public class TesteAssalariado01 {
	

	public static void main(String[] args) {
		Assalariado assalariado = new Assalariado("Roberto", "Silva", "123.456.789-00", 1000.00);
		System.out.println(assalariado.toString());
	}
	
	
}
