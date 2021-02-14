package br.com.thiago.teste;

import br.com.thiago.dominio.Assalariado;

public class TesteIgualdade {

	public static void main(String[] args) {
		Assalariado a1 = new Assalariado("Igor", "Ribeiro", "000.000.000-00", 1000.0);
		Assalariado a2 = new Assalariado("Igor", "Ribeiro", "000.000.000-00", 1000.0);
		
		if(a1.equals(a2)) {
			System.out.println("Iguais");
		} else {
			System.out.println("Diferentes");
		}
	}
	
}
