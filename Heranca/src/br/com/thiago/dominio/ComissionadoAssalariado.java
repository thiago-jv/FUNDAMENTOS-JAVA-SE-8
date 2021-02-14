package br.com.thiago.dominio;

import br.com.thiago.util.Formata;

public class ComissionadoAssalariado extends Comissionado {

	private double salarioMensal;

	public ComissionadoAssalariado() {
	}

	public ComissionadoAssalariado(String nome, String sobreNome, String cpf, double vendaBruta,
			double porcentagemComissao, double salarioMensal) {
		super(nome, sobreNome, cpf, vendaBruta, porcentagemComissao);
		this.salarioMensal = salarioMensal;
	}

	public double getSalarioMensal() {
		return salarioMensal;
	}

	public void setSalarioMensal(double salarioMensal) {
		this.salarioMensal = salarioMensal;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder(super.toString()).append(", Salario mensa: l")
				.append(Formata.moeda(salarioMensal));
		return builder.toString();
	}

	@Override
	public double calculaValorPagamento() {
		double subTotal = super.calculaValorPagamento();
		double total = subTotal + salarioMensal;
		return total;
	}
}
