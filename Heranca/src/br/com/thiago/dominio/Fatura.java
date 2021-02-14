package br.com.thiago.dominio;

import br.com.thiago.util.Formata;

public class Fatura implements Pagavel{
	
	private String descricao;
	private int quantidade;
	private double valorUnitario;
	
	public Fatura() {
	}

	public Fatura(String descricao, int quantidade, double valorUnitario) {
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.valorUnitario = valorUnitario;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	

	public double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	@Override
	public String toString() {
		StringBuilder info = new StringBuilder("Descricao: ").append(descricao)
				                       .append(", Quantidade: ").append(quantidade)
				                       .append(", valorUnitario: ").append(Formata.moeda(valorUnitario));
    return info.toString();
	
	
	}

	@Override
	public double calculaValorPagamento() {
		double total = quantidade * valorUnitario;
		return total;
	}
}
