package _40_exercicios;

import javax.swing.JOptionPane;

public class ex5 {

	public static void main(String[] args) {

		/*************************************************************************************************
		 * 
		 * Um motorista deseja colocar no seu tanque X reais de gasolina. Escreva um
		 * algoritmo para ler o preço do litro da gasolina e o valor do pagamento, e
		 * exibir quantos litros ele conseguiu colocar no tanque.
		 * 
		 ***************************************************************************************************/
		


		double precoDoLitroDaGsollina, valorPagamento, conta;

		precoDoLitroDaGsollina = Double.parseDouble(JOptionPane.showInputDialog("Qual é o valor da Gasolina ? "));
		valorPagamento = Double.parseDouble(JOptionPane.showInputDialog(null, " Qual foi o valor do pagamento ? "));

		conta = valorPagamento / precoDoLitroDaGsollina;

		JOptionPane.showMessageDialog(null, " Você conseguiu colocar " + conta + " Litros de Gasolina ");

	}
}
