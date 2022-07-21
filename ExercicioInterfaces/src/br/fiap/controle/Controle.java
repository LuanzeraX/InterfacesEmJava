package br.fiap.controle;

import java.util.ArrayList;

import br.fiap.cliente.Cliente;
import br.fiap.empregado.Gerente;
import br.fiap.empregado.Vendedor;
import br.fiap.pessoa.Pessoa;

import static javax.swing.JOptionPane.*;

import static java.lang.Integer.*;

import static java.lang.Double.*;


public class Controle {
	
	private ArrayList<Pessoa> lista = new ArrayList<Pessoa>();
	
	// menu principal da aplicação
	public void MenuPrincipal() {
		int opcao = 0;
		String menu = "Escolha uma opção:\n";
		menu += "1. Cadastrar Empregado\n";
		menu += "2. Cadastrar Cliente\n";
		menu += "3. Pesquisar\n";
		menu += "4. Listar Empregados\n";
		menu += "5. Listar Clientes\n";
		menu += "6. Remover\n";
		menu += "7. Finalizar\n";
		
		
			do {
				try {
				opcao = parseInt(showInputDialog(menu));
				if (opcao < 1 || opcao > 7) {
					showMessageDialog(null, "opção inválida");
				} else {
					switch(opcao) {
					case 1:
						cadastrarEmpregado();
						break;
					case 2:
						cadastrarCliente();
						break;
					case 3:
						pesquisar();
						break;
					case 4:
						listarEmpregado();
						break;
					case 5:
						listarCliente();
						break;
					case 6:
						remover();
						break;
					}
				}
				
				
				
				}
				catch(NumberFormatException e) {
					showMessageDialog(null, "Você deve informar uma opção númerica!");
				}
				} while(opcao != 7);
				
			}
	



	//metodo para cadastrar empregado
	
	private void cadastrarEmpregado() {
		String nome, cpf, matricula;
		double salario,bonus;
		double totalDasVendas, comissao;
		
		
		int opcao = 0;
		String menu = "Escolha uma operação:\n";
		menu+="1. Gerente\n";
		menu+="2. Vendedor\n";
		menu+="3. Voltar\n";
		
		do {
			try {
			opcao=parseInt(showInputDialog(menu));
			if(opcao < 1 || opcao > 3) {
				showMessageDialog(null, "Opção inválida");
			}else
				if(opcao ==1 || opcao == 2){
				nome = showInputDialog("Nome:");
				cpf = showInputDialog("CPF:");
				matricula = showInputDialog("Matrícula:");
				if(opcao ==1) {
					salario = parseDouble(showInputDialog("Salario:"));
					bonus = parseDouble(showInputDialog("Bonus:"));
					lista.add(new Gerente(nome, cpf, matricula, salario, bonus));
				} else {
					totalDasVendas = parseDouble(showInputDialog("Total das Vendas:"));
					comissao = parseDouble(showInputDialog("comissão:"));
					lista.add(new Vendedor(nome, cpf, matricula, totalDasVendas, comissao));
				}
					
			}
			
			}catch(NumberFormatException e) {
				showMessageDialog(null, "Você deve informar uma opção númerica!");
				
			}
		}while(opcao != 3);
		
	}
	
	//METODO CADASTRAR CLIENTE
	private void cadastrarCliente() {
		String nome, cpf;
		double valorDaDivida;
		
		nome = showInputDialog("Nome: ");
		cpf = showInputDialog("CPF: ");
		valorDaDivida = parseDouble(showInputDialog("Valor da Divida: "));
		lista.add(new Cliente(nome, cpf, valorDaDivida));
		
		
	}

	
	//listar os empregados armazenados na lista
	private void listarEmpregado() {
		String Gerente = " ";
		String Vendedor = " ";
		
		for (Pessoa pessoa : lista) {
			if(pessoa instanceof Gerente) { //verifica para quem está apontando = aparece o resultado do TOSTRING() = PESSOA.TOSTRING
				Gerente += pessoa + "\n";
			} else if(pessoa instanceof Vendedor) {
				Vendedor += pessoa + "\n";
			}
		}
		
		showMessageDialog(null, Gerente + "\n" + Vendedor);
		
		

			
		}

	//metodo para listar os clientes armazenados na lista 
	private void listarCliente() {
		String Cliente = " ";
		
		for(Pessoa pessoa : lista) {
			if (pessoa instanceof Cliente) {
				Cliente += pessoa + "\n";
			}
		}
		
		
		showMessageDialog(null, Cliente);
	
	
}
	
	
	//metodo para pesquisar e exibir os dados de uma pessoa (empregado ou cliente)
	private void pesquisar() {
		String aux = "";
		int indice = pesquisarAux();
		if(indice <= -1) {
			showMessageDialog(null, "Não Encontrado");
		} else {
			if(lista.get(indice) instanceof Cliente) {
				aux += "Cliente:\n";
			} else {
				aux += "Empregado:\n";
			}
			aux += lista.get(indice);
			showMessageDialog(null, aux);
		}
		

		
	}
	
	private int pesquisarAux() {
		int indice = -1;
		String cpf = showInputDialog("CPF para pesquisa:");
		
		for(int i=0; i < lista.size();i++) {
			if(lista.get(i).getCpf().equals(cpf)) {
				indice = i;
				
			}
		}
		
		
		return indice;
	}
	
	//metodo para remover uma pessoa pelo seu cpf
	private void remover() {
		int resposta;
		int indice = pesquisarAux();
		if(indice == -1) {
			showMessageDialog(null, "Não encontrado");
		} else {
			resposta = showConfirmDialog(null, "Confirma a exclusão?");
			if(resposta == 0) {
				lista.remove(indice);
			}
		}
	}

	
	
	
	
	
	
	
	
		
		
	}
	
			

		
		
	























