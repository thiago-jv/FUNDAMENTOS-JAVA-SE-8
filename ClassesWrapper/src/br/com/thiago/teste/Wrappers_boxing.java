package br.com.thiago.teste;

import br.com.thiago.dominio.Televisor;

public class Wrappers_boxing {

	// Estamos aproveitando a classe Televisor para fazer nosso teste
	public static void main(String[] args) {
		Televisor tv = new Televisor();

		// Não deveria mudar o volume e canal
		tv.mudarVolume(20);
		tv.mudarCanal(130);

		// Deveria mudar o volume e canal
		tv.mudarVolume(300);
		tv.mudarCanal(10);
	}

}
