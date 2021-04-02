package thiago.basico.modelo;

/*
 * Subclasse
 */

public class Diretor extends Pessoa {

	// modificdor de visibilidade private
	// atributo registroEducacao do tipo String, onde String é uma classe
	private String registroEducacao;

	// modificdor de visibilidade private
	// atributo tempoDirecao do tipo int, onde int é um tipo primitivo
	private int tempoDirecao;

	// modificdor de visibilidade private
	// atributo titulacao do tipo String, onde String é uma classe
	private String titulacao;

	public Diretor() {
	}

	public Diretor(Long id, String nome, int idade, String dataNascimento, String registroGeral, int numeroCpf,
			String nomePai, String registroEducacao, int tempoDirecao, String titulacao) {
		super(id, nome, idade, dataNascimento, registroGeral, numeroCpf, nomePai);
		this.registroEducacao = registroEducacao;
		this.tempoDirecao = tempoDirecao;
		this.titulacao = titulacao;
	}
	
	@Override
	public double salario() {
		return 3900.90;
	}

	public String getRegistroEducacao() {
		return registroEducacao;
	}

	public void setRegistroEducacao(String registroEducacao) {
		this.registroEducacao = registroEducacao;
	}

	public int getTempoDirecao() {
		return tempoDirecao;
	}

	public void setTempoDirecao(int tempoDirecao) {
		this.tempoDirecao = tempoDirecao;
	}

	public String getTitulacao() {
		return titulacao;
	}

	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	@Override
	public String toString() {
		     StringBuilder builder = new StringBuilder(super.toString())
		    		 .append(", Registro Educacao: ").append(registroEducacao)
		    		 .append(", Tempo Direcao: ").append(tempoDirecao)
		    		 .append(", Titulacao").append(titulacao);
	return builder.toString();
	
	}
}
