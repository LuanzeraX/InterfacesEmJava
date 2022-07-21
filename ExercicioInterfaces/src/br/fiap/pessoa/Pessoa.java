package br.fiap.pessoa;

public class Pessoa {
	
	protected String nome;
	protected String cpf;
	
	
	
	
	
	
	public Pessoa(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}






	public String getCpf() {
		return cpf;
	}






	@Override
	public String toString() {
		return "Pessoa [Nome: " + nome + ", CPF: " + cpf + "]";
	}
	
	
	
	
	
	

}
