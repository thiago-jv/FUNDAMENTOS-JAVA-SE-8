package br.com.thiago.dominio;

public class Contador {

	// com o modificador static, estamos criando um count apenas da classe, mas pode
	// ser modificado
	public static int COUNT = 0;

	// quando utilizamos o modifical final, estamos informando que a variável não
	// irá ser mais modificado.
	// public final static int COUNT = 0;

	public void incrementar() {
		COUNT++;
	}

	public static void imprimirContador() {
		System.out.println("O valor do contador agora é: " + Contador.COUNT);

	}

}
