package br.com.thiago.teste;

import br.com.thiago.dominio.ContaPagar;
import br.com.thiago.dominio.Pessoa;
import br.com.thiago.enums.SituacaoConta;

public class TesteConta {

	public static void main(String[] args) {

		ContaPagar contaPagar = new ContaPagar();
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Joao");
		contaPagar.setPessoa(pessoa);
		
		//Que tipo de conta deseja pagar?
		//contaPagar.pagar(SituacaoConta.PENDENTE, pessoa);
		
		// Que tipo de conta deseja cancelar?
		contaPagar.cancelar(SituacaoConta.PAGA, pessoa);
		
		contaPagar.imprimir();
		

		

	}

}
