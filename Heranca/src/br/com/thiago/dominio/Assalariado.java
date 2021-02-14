package br.com.thiago.dominio;

import br.com.thiago.util.Formata;

public class Assalariado extends Funcionario {

	private double salarioSemanal;

	public Assalariado(String nome, String sobreNome, String cpf, double salarioSemanal) {
		super(nome, sobreNome, cpf);
		this.salarioSemanal = salarioSemanal;
	}

	public double getSalarioSemanal() {
		return salarioSemanal;
	}

	public void setSalarioSemanal(double salarioSemanal) {
		this.salarioSemanal = salarioSemanal;
	}
	
	// polimorfismo
	@Override
	public String toString() {
		StringBuilder info = new StringBuilder(super.toString())
				                       .append(", Salário: ").append(Formata.moeda(salarioSemanal));
    return info.toString();
    
	}

	@Override
	public double calculaValorPagamento() {
		double total = salarioSemanal * 4.5;
		return total;
	}
	
}
