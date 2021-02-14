package br.com.thiago.dominio;

public abstract class Funcionario implements Pagavel{// só pode ser herdada, nunca instanciada

	private String nome;
	private String sobreNome;
	private String cpf;

	public Funcionario() {
	}

	public Funcionario(String nome, String sobreNome, String cpf) {
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	// Obriga ser sobrescrito nas classes filhas
	public abstract double calculaValorPagamento();
	

	@Override
	public String toString() {
		StringBuilder info = new StringBuilder("Nome: ").append(nome)
				                       .append(", Sobrenome: ").append(sobreNome)
				                       .append(", CPF: ").append(cpf);
    return info.toString();
  }
	
	@Override
		public boolean equals(Object obj) {
			if(obj != null && obj instanceof Funcionario) {
				Funcionario f = (Funcionario) obj;// cast para Funcionario
				if(     this.nome.equals(f.getNome()) 
						&& this.sobreNome.equals(f.getSobreNome()) 
					    && this.cpf.equals(f.getCpf())) {
					return true;
				}
			}
			return false;
		}
	
}
