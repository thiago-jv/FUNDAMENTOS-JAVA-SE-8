package br.com.thiago.dominio;

import br.com.thiago.util.Formata;

public class Horista extends Funcionario {
	
	private double valorHora;
	private double horasTrabalhadas;
	
	public Horista() {
	}
	
	public Horista(String nome, String sobreNome, String cpf, double valorHora, double horasTrabalhadas) {
		super(nome, sobreNome, cpf);
		this.valorHora = valorHora;
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public double getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(double horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}
	
	// polimorfismo
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder(super.toString())
				                                 .append(", valorHora: ").append(Formata.moeda(valorHora))
				                                 .append(", horasTrabalhadas: ").append(horasTrabalhadas);
	    return builder.toString();
	}

	@Override
	public double calculaValorPagamento() {
		return 0;
	}
	

}
