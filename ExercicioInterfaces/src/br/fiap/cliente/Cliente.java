package br.fiap.cliente;

import br.fiap.pessoa.Pessoa;

public class Cliente extends Pessoa{

	private double valorDaDivida;
	
	

	public Cliente(String nome, String cpf, double valorDaDivida) {
		super(nome, cpf);
		this.valorDaDivida = valorDaDivida;
	}



	@Override
	public String toString() {
		return "Cliente:  \nValor da Divida = " + valorDaDivida + "\n" + "Nome = " + nome + "\n" + "CPF = " + cpf + "";
	}



	
	
	
	
	
	
}
