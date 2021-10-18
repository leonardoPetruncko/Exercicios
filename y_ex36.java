package _40_exercicios;

import javax.swing.JOptionPane;

public class y_ex36 {

	public static void main(String[] args) {

		/*************************************************************************************************
		 * 
		 * Faça um algoritmo que receba o valor do salário mínimo e o valor do salário
		 * de um funcionário, calcule e mostre a quantidade de salários mínimos que
		 * ganha esse funcionário.
		 *
		 ***************************************************************************************************/

		int salario;
		int conta1;

		salario = Integer.parseInt(JOptionPane.showInputDialog(null, " Quanto que você ganha? "));

		conta1 = salario / 1200;

		JOptionPane.showMessageDialog(null, " Você ganha: " + conta1 + " salário mínimos ");

	}

}
