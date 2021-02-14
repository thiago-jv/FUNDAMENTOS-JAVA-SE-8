package br.com.thiago.teste;

import br.com.thiago.dominio.Carta;
import br.com.thiago.enums.Nipe;
import br.com.thiago.enums.OperacaoAritimetica;

public class TesteEnum {

	// classe main
	public static void main(String[] args) {
		
		Carta quatroPaus = new Carta(4, Nipe.PAUS);
		quatroPaus.imprimirCarta();
		
		OperacaoAritimetica o1 = OperacaoAritimetica.ADICAO;
		
		int resultado1 = o1.operacao(5, 3);
		System.out.println("O resultado é: " + resultado1);
		
		for(OperacaoAritimetica oa : OperacaoAritimetica.values()) {
			System.out.println(oa + "->" +oa.operacao(4, 2));
		}

	}// fim main
}// fim classe
