package br.com.thiago.teste;

public class TesteHackDo {

	public static void main(String[] args) {
		String letras = "ABCDEFGHIJLMNOPQRSTUVXZ";
		String senha = "OLAZ";
		String hack;
		int contador = 0;
		do {
			hack = "";
            for(int i = 0; i < senha.length(); i++) {
            	hack += letras.charAt((int) (Math.random() * letras.length()));
            }// fim for
            contador++;
            System.out.printf("Tentativa: %d - Hack: %s \n", contador, hack);
		} while (!hack.equals(senha));
	}
}
