package br.fiap.empregado;

public class Vendedor extends Empregado{

	
	@Override
	public String toString() {
		return "Vendedor [totalDasVendas=" + totalDasVendas + ", comissao=" + comissao + ", matricula=" + matricula
				+ ", nome=" + nome + ", cpf=" + cpf + "]";
	}

	private double totalDasVendas;
	private double comissao;
	
	
	
	
	
	public Vendedor(String nome, String cpf, String matricula, double totalDasVendas, double comissao) {
		super(nome, cpf, matricula);
		this.totalDasVendas = totalDasVendas;
		this.comissao = comissao;
	}
	
	public double calcularSalario() {
		return 0;
	}
	
	
}
