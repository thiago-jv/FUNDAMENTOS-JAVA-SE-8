package br.com.thiago.dominio;

import java.time.LocalDate;

import br.com.thiago.ferramentas.Formatador;

public class Aluno {

	// variável MEDIA_MINIMA_APROVACAO, para facil manutenção
	public static final double MEDIA_MINIMA_APROVACAO = 7.0;

	// atributos da classe
	public int codigo;
	public LocalDate dataMatricula;
	public String nome;

	// array de double iniciado com 4 posições no máximo
	final public double[] NOTAS = new double[4];

	// Quando um construtor não é informado, o java cria um implicito, porem caso seja especificado, o mesmo será o padrão!
	
	// construtores
	public Aluno() { // construtor padrão (sem argumentos)
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
		System.out.printf("Código: #%d", codigo);
		System.out.printf("\nNome: %s", nome); // \n : quebra a linha
		System.out.printf("\nDt. Matricula: %s", Formatador.data(dataMatricula, true));
		System.out.printf("\nNotas: [%.2f][%.2f][%.2f][%.2f]", NOTAS[0], NOTAS[1], NOTAS[2], NOTAS[3]);
		System.out.printf("\nMédia: %.2f", calculaMedia());
		
		String situacao = aprovado() ? "Aprovado" : "Reprovado"; // operador ternário

		System.out.printf("\nSituacao: %s \n", situacao);
	} // fim imprime

	// método calculaMedia()
	public double calculaMedia() {
		double soma = 0, media = 0;
		for (double n : NOTAS) {
			soma += n; // soma = soma + n;
		}
		media = soma / NOTAS.length;

		return media;
	}

	// método aprovado() (7.0) que irá retornar um valor true ou false
	public boolean aprovado() {
		return calculaMedia() >= MEDIA_MINIMA_APROVACAO;
	}

	// criando um método que recebe 4 valores
	public void adicionaNotas(double n1, double n2, double n3, double n4) {
		System.out.println("Usando 4 args!");
		NOTAS[0] = n1;
		NOTAS[1] = n2;
		NOTAS[2] = n3;
		NOTAS[3] = n4;
	}

	// criando um método que sobrescreve o metodo anterior adicionarNotas
	// porem a diferença desse método é que estamos utilizando o varargs
	// ao chamar esse método e for passado 4 valores, o método que recebe 4 valores será chamado
	// porem caso seja passado menos que 4 ou mais que 4, o método que recebe infinitos valores será chamado
	// dessa forma sobrescrevendo
	public void adicionaNotas(double... notas) { // 0 a N notas (varargs)
		System.out.println("Usando varargs!");
		if (notas.length > NOTAS.length) {
			System.out.println("Número incorreto de notas!");
		} else {
			int indice = 0;
			for (double n : notas) {
				NOTAS[indice++] = n;
			} // fim for
		} // fim else
	} // fim adicionaNotas

} // fim classe
