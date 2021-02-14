package br.com.thiago.teste;

import java.util.ArrayList;

import br.com.thiago.dados.BdMemoria;
import br.com.thiago.dominio.Funcionario;
import br.com.thiago.util.Formata;

public class TesteFuncionario01 {

	public static void main(String[] args) {
		ArrayList<Funcionario> funcionarios = BdMemoria.getFucionarios();
		
		for (Funcionario funcionario : funcionarios) {
			System.out.println(funcionario);
			System.out.println("Salário: " +Formata.moeda(funcionario.calculaValorPagamento()));
			System.out.println();
		}
		
	}
}
