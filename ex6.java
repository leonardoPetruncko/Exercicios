package _40_exercicios;

import javax.swing.JOptionPane;

public class ex6 {

	public static void main(String[] args) {

		/*************************************************************************************************
		 * 
		 * O restaurante a quilo Bem-Bão cobra R$12,00 por cada quilo de refeição.
		 * Escreva um algoritmo que leia o peso do prato montado pelo cliente (em
		 * quilos) e imprima o valor a pagar. Assuma que a balança já desconte o peso do
		 * prato.
		 * 
		 ***************************************************************************************************/

		double pesoDoPrato, valorAPagar;
		int quiloPrato;

		quiloPrato = 12;

		pesoDoPrato = Double.parseDouble(JOptionPane.showInputDialog("Qual é o peso do Prato ? "));

		valorAPagar = pesoDoPrato * quiloPrato;

		JOptionPane.showMessageDialog(null, " Valor a pagar é:  " + valorAPagar);

	}

}
