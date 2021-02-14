package br.com.thiago.dominio;

import br.com.thiago.enums.Nipe;

public class Carta {

	private int numero;
	private Nipe nipe;

	public Carta(int numero, Nipe nipe) {
		this.numero = numero;
		this.nipe = nipe;
	}

	public void imprimirCarta() {
		System.out.println("Sou " + numero + " de " + nipe +" . E tenho a cor " + nipe.getCor());
	}
}
