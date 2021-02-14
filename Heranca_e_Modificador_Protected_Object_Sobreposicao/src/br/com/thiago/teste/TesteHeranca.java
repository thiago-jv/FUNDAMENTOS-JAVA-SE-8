package br.com.thiago.teste;

import br.com.thiago.dominio.Tecnico;

public class TesteHeranca {

	// classe main
	public static void main(String[] args) {

		Tecnico tecnico = new Tecnico();
		tecnico.setNome("Thiago");
		tecnico.setCpf("88371468253");
		tecnico.seApresentar();

	}// fim main
}// fim classe
