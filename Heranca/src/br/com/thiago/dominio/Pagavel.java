package br.com.thiago.dominio;

public interface Pagavel {

	// apenas campos static final (constantes)
	/*public static final*/ double TAXA_MAX_DESCONTO = 0.2;
	
	// apenas // métodos public sbastract
	/*public abstract*/ double calculaValorPagamento();
	
}
