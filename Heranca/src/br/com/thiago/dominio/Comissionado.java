package br.com.thiago.dominio;

public class Comissionado extends Funcionario {

	private double vendaBruta;
	private double porcentagemComissao;

	public Comissionado() {
	}

	public Comissionado(String nome, String sobreNome, String cpf, double vendaBruta, double porcentagemComissao) {
		super(nome, sobreNome, cpf);
		this.vendaBruta = vendaBruta;
		this.porcentagemComissao = porcentagemComissao;
	}

	public double getVendaBruta() {
		return vendaBruta;
	}

	public void setVendaBruta(double vendaBruta) {
		this.vendaBruta = vendaBruta;
	}

	public double getPorcentagemComissao() {
		return porcentagemComissao;
	}

	public void setPorcentagemComissao(double porcentagemComissao) {
		this.porcentagemComissao = porcentagemComissao;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder(super.toString()).append(", Venda bruta ").append(vendaBruta)
				.append(", % comissão ").append(porcentagemComissao);
		return builder.toString();
	}

	@Override
	public double calculaValorPagamento() {
		double total = vendaBruta * (porcentagemComissao / 100);
		return total;
	}

}
