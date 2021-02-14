package br.com.thiago.dominio;

import br.com.thiago.enums.SituacaoConta;

public class ContaPagar {

	private Pessoa pessoa;
	private SituacaoConta situacaoConta = SituacaoConta.PENDENTE;

	public ContaPagar() {
	}

	public ContaPagar(Pessoa pessoa, SituacaoConta situacaoConta) {
		this.situacaoConta = situacaoConta;
		this.pessoa = pessoa;
	}

	public SituacaoConta getSituacaoConta() {
		return situacaoConta;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public void pagar(SituacaoConta conta, Pessoa pessoa) {
		if (conta == SituacaoConta.PAGA || conta == SituacaoConta.CANCELADA) {
			System.out.println(
					"Voc� informou uma conta: " + conta + "\nUma conta s� deve ser paga se a situa��o atual for "
							+ SituacaoConta.PENDENTE + ", porem foi informado " + conta);
		} else {
			this.situacaoConta = SituacaoConta.PAGA;
		}
	}

	public void cancelar(SituacaoConta conta, Pessoa pessoa) {
		if (conta == SituacaoConta.PAGA || conta == SituacaoConta.CANCELADA) {
			System.out.println("N�o se pode cancelar uma conta que j� foi " + SituacaoConta.PAGA + " ou "
					+ SituacaoConta.CANCELADA);
		} else {
			this.situacaoConta = conta;
		}
	}

	public void imprimir() {
		System.out.println("Pessoa: " + pessoa.getNome() + "\nStatus Conta: " + situacaoConta);
	}
}
