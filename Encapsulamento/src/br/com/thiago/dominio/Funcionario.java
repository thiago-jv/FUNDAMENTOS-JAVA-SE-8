package br.com.thiago.dominio;

public class Funcionario {

	public static final double SALARIO_MINIMO = 1200.00;
	static int ultimoCodigo = 0;

	// Para ser considerado encapsulamento, os atributos devem ser privados

	private int codigo; // auto incrental
	private String nome; // pode ser alterado
	private String cpf; // não pode ser alterado
	private double salario; // so pode aumentar

	public Funcionario(String nome, String cpf, double salario) {
		this.codigo = ++ultimoCodigo;
		this.nome = nome;
		this.cpf = cpf;
		if (salario < SALARIO_MINIMO) {
			this.salario = SALARIO_MINIMO;
		} else {
			this.salario = salario;
		}
	}

	public void imprime() {
		System.out.printf("Funcionaro: # %d \n", codigo);
		System.out.printf("Nome: %s \n", nome);
		System.out.printf("CPF: %s \n", cpf);
		System.out.printf("Salário R$ %.2f \n", salario);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	// criamos esse metodo no lugar do set diretamente, devido a essa regra
	public void aumentaSalario(double valorAumento) {
		if (valorAumento > 0) {
			this.salario += valorAumento;
		}
	}

	public int getCodigo() {
		return codigo;
	}

}
