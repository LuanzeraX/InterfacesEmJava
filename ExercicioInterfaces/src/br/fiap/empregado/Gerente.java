package br.fiap.empregado;

public class Gerente extends Empregado {
	
	private double salario;
	private double bonus;
	
	
	
	
	
	public Gerente(String nome, String cpf, String matricula, double salario, double bonus) {
		super(nome, cpf, matricula);
		this.salario = salario;
		this.bonus = bonus;
	}
	
	public double calcularBonus() {
		return 0;
	}

	@Override
	public String toString() {
		return "Gerente [salario=" + salario + ", bonus=" + bonus + ", matricula=" + matricula + ", nome=" + nome
				+ ", cpf=" + cpf + "]";
	}
	

}
