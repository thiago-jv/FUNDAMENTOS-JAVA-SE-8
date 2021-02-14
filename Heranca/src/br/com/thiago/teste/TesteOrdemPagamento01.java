package br.com.thiago.teste;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;

import br.com.thiago.dados.BdMemoria;
import br.com.thiago.dominio.Fatura;
import br.com.thiago.dominio.Funcionario;
import br.com.thiago.dominio.Pagavel;
import br.com.thiago.util.Formata;

public class TesteOrdemPagamento01 {

	static File arquivo = new File("c:/temp/rel/rel_ordem_pagamento.txt");
	static PrintStream video = System.out;
	
	public static void main(String[] args) {

		try {
			System.setOut(new PrintStream(arquivo));// muda a saída default para o arquivo
		
		
		ArrayList<Funcionario> funcionarios = BdMemoria.getFucionarios();
		ArrayList<Fatura> faturas = BdMemoria.getFaturas();
		
		
		ArrayList<Pagavel> pagamentos = new ArrayList<>();
		pagamentos.addAll(funcionarios);
		pagamentos.addAll(faturas);
		
		for (Pagavel p : pagamentos) {
			System.out.println(p);
			System.out.println("Valor Pagamento: " +Formata.moeda(p.calculaValorPagamento()));
			System.out.println();
		}
		
		System.out.println(video); // volta para o vídeo
		System.out.println("Arquivo gravado com sucesso!");
		
		} catch (FileNotFoundException e) {
			System.out.println("Error ao gerar o arquivo " + e.getMessage());
		}
		
	}
}
