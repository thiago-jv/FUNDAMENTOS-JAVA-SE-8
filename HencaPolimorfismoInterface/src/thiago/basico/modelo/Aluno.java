package thiago.basico.modelo;

import java.util.Date;

/*
 * Subclasse
 */

public class Aluno extends Pessoa {

	// modificador de visibilidade private
	// atributo do dataMatricula do tipo Date, onde Date é uma classe
	private Date dataMatricula;

	// modificador de visibilidade private
	// atributo nomeEscola do tipo String, onde String é uma classe
	private String nomeEscola;

	// modificador de visibilidade private
	// atributo serieMatricuado do tipo String, onde String é uma classe
	private String serieMatriculado;

	// modificador de visibilidade private
	// atributo disciplina do tipo String, onde String é uma classe
	private String disciplinas;

	public Aluno() {
	}

	public Aluno(Long id, String nome, int idade, String dataNascimento, String registroGeral, int numeroCpf,
			String nomePai, Date dataMatricula, String nomeEscola, String serieMatriculado, String disciplinas) {
		super(id, nome, idade, dataNascimento, registroGeral, numeroCpf, nomePai);
		this.dataMatricula = dataMatricula;
		this.nomeEscola = nomeEscola;
		this.serieMatriculado = serieMatriculado;
		this.disciplinas = disciplinas;
	}

	/*
	 * Sobrescrista de método
	 */
	@Override
	public boolean pessoaMaiorIdade() {
		return idade >= 21;
	}
	
	/*
	 * Válidade a mensagem de retorno
	 */
	public String msgMaiorIdade() {
		return this.pessoaMaiorIdade() ? "Maior de idade" : "Menor de idade";
	}
	
	@Override
	public double salario() {
		return 1500.90;
	}
	
	public Date getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(Date dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getSerieMatriculado() {
		return serieMatriculado;
	}

	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}

	public String getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(String disciplinas) {
		this.disciplinas = disciplinas;
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
		    		 .append(", Data Matricula: ").append(dataMatricula)
		    		 .append(", Nome Escola: ").append(nomeEscola)
		    		 .append(", Serie Matriculado").append(serieMatriculado)
		    		 .append(", Disciplinas").append(disciplinas);
	return builder.toString();
	
	}
	
}
