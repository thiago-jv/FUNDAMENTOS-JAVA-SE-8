package br.com.thiago.dominio;

public class Funcionario {
	
    public int codigo;
    public String nome;
    public String cpf;
    public String setor;
    public double salario;
    
    public void imprime() {
        System.out.println("Código: #" + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("CPF.: " + cpf);
        System.out.println("Setor: " + setor);
        System.out.printf("Salário: R$%.2f\n", salario);
    }
    
}//fim classe
