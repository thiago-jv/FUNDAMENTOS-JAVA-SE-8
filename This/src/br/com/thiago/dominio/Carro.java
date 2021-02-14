package br.com.thiago.dominio;

public class Carro {

	public String modelo;

	public void alterarModelo(String modelo) {
		if (modelo != null) {
			// dessa forma não estamos utilizado o atributo da classe Carro "modelo".
			// modelo = modelo;

			// dessa forma o atributo modelo da classe, irá receber o modelo recebido via
			// parameto no método.
			this.modelo = modelo;
		}
	}

}
