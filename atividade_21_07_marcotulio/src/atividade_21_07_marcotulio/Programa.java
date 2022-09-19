
package atividade_21_07_marcotulio;

import javax.swing.*;

public class Programa {
	
	public static void main(String []  args) {
		
		Cliente[] lista_clientes = new Cliente[100];
		
		String resposta = "n";
		
		int contador = 0;
		
		do{
			
			long inputId = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do cliente "));
			String inputNome = JOptionPane.showInputDialog("Digite o nome do cliente ");
			String inputCPF = JOptionPane.showInputDialog("Digite o CPF do cliente ");
			String inputCidade = JOptionPane.showInputDialog("Digite a cidade do cliente ");
			String inputEstado = JOptionPane.showInputDialog("Digite o estado do cliente ");
			String inputBairro = JOptionPane.showInputDialog("Digite o bairro do cliente ");
			String inputRua = JOptionPane.showInputDialog("Digite a rua do cliente ");
			String inputNumero = JOptionPane.showInputDialog("Digite o numero do cliente ");
			String inputComplemento = JOptionPane.showInputDialog("Digite, caso houver, o complemento do cliente ");
			resposta = JOptionPane.showInputDialog("Desejar continuar? Digite sim caso afirmativo "); 

			Endereco endereco = new Endereco(inputCidade, inputEstado, inputBairro, inputRua, inputNumero, inputComplemento);
			
			lista_clientes[contador] = new Cliente(inputId, inputNome, inputCPF, endereco);
			
			// lista_clientes[contador] = new Cliente(inputNome, inputCPF, inputCidade, inputEstado, inputBairro, inputRua, inputNumero, inputComplemento);
		
			JOptionPane.showMessageDialog(null, lista_clientes[contador].imprime());
			
			contador++;
			
		}while(resposta.equals("sim"));			
	}	
}