package thiago.basico.teste;

import thiago.basico.modelo.Aluno;
import thiago.basico.modelo.Diretor;
import thiago.basico.modelo.Pessoa;
import thiago.basico.modelo.Secretario;

public class TestandoClassesFilhas {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Thiago Henrique Melo da Silva");
		aluno.setIdade(15);
	//	System.out.println(aluno);
		System.out.println(aluno.pessoaMaiorIdade() + " - " +aluno.msgMaiorIdade());
		System.out.println("Salário do aluno: " + aluno.salario());
		System.out.println();
	
		Diretor diretor = new Diretor();
		diretor.setNome("Carlos Henrique Melo da Silva");
		diretor.setIdade(30);
	//	System.out.println(diretor);
		System.out.println(diretor.pessoaMaiorIdade());
		System.out.println("Salário do diretor: " + diretor.salario());
		System.out.println();
		
		Secretario secretario = new Secretario();
		secretario.setNome("Jessica Castro");
		secretario.setIdade(40);
	//	System.out.println(secretario);
		System.out.println(secretario.pessoaMaiorIdade());
		System.out.println("Salário do secretário: " + secretario.salario());
		System.out.println();
		
		teste(aluno);
		teste(diretor);
		teste(secretario);
		
	}
	
	public static void teste(Pessoa pessoa) {
		System.out.println("Essa pessoa é demais => " 
	                       +pessoa.getNome()+ ""
	                       + " e o salário é de => " +pessoa.salario());
	}
}
