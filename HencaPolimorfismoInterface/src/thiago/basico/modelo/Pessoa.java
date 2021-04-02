package thiago.basico.modelo;

/*
 * Superclasse
 */

public abstract class Pessoa {

	// modificador de visibilidade private
	// atributo id do tipo Long, onde Long é uma classe
	protected Long id;

	// modificador de visibilidade private
	// atributo nome do tipo String, onde String é uma classe
	protected String nome;

	// modificador de visibilidade private
	// atributo idade do tipo int, onde int é um tipo primitivo
	protected int idade;

	// modificador de visibilidade private
	// atributo dataNascimento do tipo String, onde String é uma classe
	protected String dataNascimento;

	// modificador de visibilidade private
	// atributo registroGeral do tipo String, onde String é uma classe
	protected String registroGeral;

	// modificador de visibilidade private
	// atributo numeroCpf do tipo primitivo int
	protected int numeroCpf;

	// modificador de visibilidade private
	// atributo nomePai do tipo String, onde String é uma classe
	protected String nomePai;

	public Pessoa() {
	}

	public Pessoa(Long id, String nome, int idade, String dataNascimento, String registroGeral, int numeroCpf,
			String nomePai) {
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.dataNascimento = dataNascimento;
		this.registroGeral = registroGeral;
		this.numeroCpf = numeroCpf;
		this.nomePai = nomePai;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getRegistroGeral() {
		return registroGeral;
	}

	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}

	public int getNumeroCpf() {
		return numeroCpf;
	}

	public void setNumeroCpf(int numeroCpf) {
		this.numeroCpf = numeroCpf;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}
	
	public boolean pessoaMaiorIdade() {
		return idade >= 18;
	}
	
	/*
	 * Método abstrato pe que fica na classe pai e é obrigatório nas classes filhas
	 */
	public abstract double salario();

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento
				+ ", registroGeral=" + registroGeral + ", numeroCpf=" + numeroCpf + ", nomePai=" + nomePai + "]";
	}

	
}
