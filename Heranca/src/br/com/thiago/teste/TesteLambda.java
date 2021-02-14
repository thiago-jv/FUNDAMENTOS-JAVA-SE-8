package br.com.thiago.teste;

import java.util.ArrayList;

import br.com.thiago.dados.BdMemoria;
import br.com.thiago.dominio.Assalariado;
import br.com.thiago.dominio.Funcionario;

public class TesteLambda {

	public static void main(String[] args) {
		ArrayList<Funcionario> funcionarios = BdMemoria.getFucionarios();
		System.out.println("Listar: ");
		funcionarios.stream()
		.filter(f -> f.getNome().contains("r"))
		.forEach(f -> System.out.println(f));
		
		
		ArrayList<Assalariado> ass = new ArrayList<>();
		ass.add(new Assalariado("A", "A", "0", 10000.00));
		ass.add(new Assalariado("B", "A", "0", 20000.00));
		ass.add(new Assalariado("C", "A", "0", 30000.00));
		ass.add(new Assalariado("D", "A", "0", 40000.00));
	
		double salarios = ass.stream()
				.mapToDouble(f -> f.calculaValorPagamento())
				.sum();
		System.out.println("Salários: " +salarios);
		
	}
}
