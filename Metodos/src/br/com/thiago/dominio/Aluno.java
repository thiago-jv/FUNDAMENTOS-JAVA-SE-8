package br.com.thiago.dominio;

import java.time.LocalDate;

import br.com.thiago.ferramentas.Formatador;

public class Aluno {

	// vari�vel MEDIA_MINIMA_APROVACAO, para facil manuten��o
	public static final double MEDIA_MINIMA_APROVACAO = 7.0;

	// atributos da classe
	public int codigo;
	public LocalDate dataMatricula;
	public String nome;

	// array de double iniciado com 4 posi��es no m�ximo
	final public double[] NOTAS = new double[4];

	// Quando um construtor n�o � informado, o java cria um implicito, porem caso seja especificado, o mesmo ser� o padr�o!
	
	// construtores
	public Aluno() { // construtor padr�o (sem argumentos)
		this.nome = "-- sem nome ainda --";
	}

	// sobrecarga de contrutor
	public Aluno(int codigo, String nome, LocalDate dataMatricula) {
		this.codigo = codigo;
		this.nome = nome;
		this.dataMatricula = dataMatricula;
	}

	// sobrecarga de contrutor
	public Aluno(int codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
		this.dataMatricula = LocalDate.now(); // data de hoje
	}

	public void imprime() {
		System.out.printf("C�digo: #%d", codigo);
		System.out.printf("\nNome: %s", nome); // \n : quebra a linha
		System.out.printf("\nDt. Matricula: %s", Formatador.data(dataMatricula, true));
		System.out.printf("\nNotas: [%.2f][%.2f][%.2f][%.2f]", NOTAS[0], NOTAS[1], NOTAS[2], NOTAS[3]);
		System.out.printf("\nM�dia: %.2f", calculaMedia());
		
		String situacao = aprovado() ? "Aprovado" : "Reprovado"; // operador tern�rio

		System.out.printf("\nSituacao: %s \n", situacao);
	} // fim imprime

	// m�todo calculaMedia()
	public double calculaMedia() {
		double soma = 0, media = 0;
		for (double n : NOTAS) {
			soma += n; // soma = soma + n;
		}
		media = soma / NOTAS.length;

		return media;
	}

	// m�todo aprovado() (7.0) que ir� retornar um valor true ou false
	public boolean aprovado() {
		return calculaMedia() >= MEDIA_MINIMA_APROVACAO;
	}

	// criando um m�todo que recebe 4 valores
	public void adicionaNotas(double n1, double n2, double n3, double n4) {
		System.out.println("Usando 4 args!");
		NOTAS[0] = n1;
		NOTAS[1] = n2;
		NOTAS[2] = n3;
		NOTAS[3] = n4;
	}

	// criando um m�todo que sobrescreve o metodo anterior adicionarNotas
	// porem a diferen�a desse m�todo � que estamos utilizando o varargs
	// ao chamar esse m�todo e for passado 4 valores, o m�todo que recebe 4 valores ser� chamado
	// porem caso seja passado menos que 4 ou mais que 4, o m�todo que recebe infinitos valores ser� chamado
	// dessa forma sobrescrevendo
	public void adicionaNotas(double... notas) { // 0 a N notas (varargs)
		System.out.println("Usando varargs!");
		if (notas.length > NOTAS.length) {
			System.out.println("N�mero incorreto de notas!");
		} else {
			int indice = 0;
			for (double n : notas) {
				NOTAS[indice++] = n;
			} // fim for
		} // fim else
	} // fim adicionaNotas

} // fim classe
