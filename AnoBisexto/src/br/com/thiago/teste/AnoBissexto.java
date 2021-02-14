package br.com.thiago.teste;
import java.util.Scanner;

/*
    Você foi contratado para fazer um programa que descobre se um ano é bissexto ou não.
    O usuário irá informar o valor de um ano e seu programa irá imprimir na tela se é ou não
    um ano bissexto.

    Para saber se um ano é bissexto ou não precisamos de saber algumas regrinhas:

    São bissextos todos os anos múltiplos de 400, por exemplo: 1600, 2000, 2400, ...
    São bissextos todos os múltiplos de 4 e não múltiplos de 100, por exemplo: 1996, 2004, 2008, 2012, ...
    Não são bissextos todos os demais anos.

    1. Crie um arquivo chamado "DescobreAnoBissexto.java" e coloque o seguinte código-fonte denro dele:
 
 */

public class AnoBissexto {

	// classe main
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Ano: ");

		// obtém entrada do tipo int
		int ano = entrada.nextInt();
		
		if (ano % 400 == 0) { // Todos os múltiplos de 400 são bissextos
			System.out.println("O ano \"" + ano + "\" eh um ano bissexto");
		} else if (ano % 4 == 0) {
			if (ano % 100 != 0) { // Múltiplo de 4 e não multiplo de 100 são bissextos
				System.out.println("O ano \"" + ano + "\" eh um ano bissexto");
			} else {
				System.out.println("O ano \"" + ano + "\" nao eh um ano bissexto");
			}
		} else {
			System.out.println("O ano \"" + ano + "\" nao eh um ano bissexto");
		}
		
		entrada.close();
	}// fim main
}// fim classe
