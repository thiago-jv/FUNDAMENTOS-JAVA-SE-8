package br.com.thiago.teste;


public class TesteStringBuilder {

	// classe main
	public static void main(String[] args) {
	
		// StringBuild, muito utilizada para fazer concatena��o de String
		// A diferen�a entre String e StringBuilder, � que StringBuilder, n�o costuma
		// deixar lixo nas vari�veis, porem caso a classe String n�o seja bem utilizada, 
		// poder� causar problemas em espa�o de m�moria 
		StringBuilder frase = new StringBuilder("Thiago");

		frase.append(" Desenvolvedor");
		frase.append("!");
		System.out.println(frase);

		frase.insert(5, " Henrique ");
		System.out.println(frase);

		frase.reverse();
		System.out.println(frase);

		char letra = '\u004C';
		System.out.println(letra);

		letra = 76;
		System.out.println(letra);
	
	}// fim main
}// fim classe
