package Cadastro.model;


public class Cadastro {
	private String nome;
	private int idade;
	
	public Cadastro(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Cadastro:\n	Nome: " + nome + "\nIdade: " + idade;
	}
	
	
}
