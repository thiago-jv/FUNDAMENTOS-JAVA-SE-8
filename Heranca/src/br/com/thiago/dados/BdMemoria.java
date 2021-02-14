package br.com.thiago.dados;

import java.util.ArrayList;

import br.com.thiago.dominio.Assalariado;
import br.com.thiago.dominio.Comissionado;
import br.com.thiago.dominio.ComissionadoAssalariado;
import br.com.thiago.dominio.Fatura;
import br.com.thiago.dominio.Funcionario;
import br.com.thiago.dominio.Horista;

public class BdMemoria {

	private static ArrayList<Funcionario> funcionarios;

	public static ArrayList<Funcionario> getFucionarios() {
		funcionarios = new ArrayList<>();
		funcionarios.add(new Assalariado("Thiago", "Henrique", "123.456.789.00", 7_000.00));
		funcionarios.add(new Comissionado("Jessica", "Castro", "123.456.789.00", 60_000.00, 10));
		funcionarios.add(new Horista("Rita", "Melo", "123.456.789.00", 100, 120));
		funcionarios.add(new ComissionadoAssalariado("Carlos", "Henrique", "123.456.789.00", 35_000.00, 10, 3_000.00));
	return funcionarios;
	}
	
	public static ArrayList<Fatura> getFaturas(){
		ArrayList<Fatura> faturas = new ArrayList<>();
		faturas.add(new Fatura("Cadeira de Escritório", 10, 120.00));
		faturas.add(new Fatura("Mesa de escritório", 20, 1.300));
		faturas.add(new Fatura("Monitor de escritório", 3, 1.500));
		return faturas;
	}
}
