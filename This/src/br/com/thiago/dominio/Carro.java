package br.com.thiago.dominio;

public class Carro {

	public String modelo;

	public void alterarModelo(String modelo) {
		if (modelo != null) {
			// dessa forma n�o estamos utilizado o atributo da classe Carro "modelo".
			// modelo = modelo;

			// dessa forma o atributo modelo da classe, ir� receber o modelo recebido via
			// parameto no m�todo.
			this.modelo = modelo;
		}
	}

}
