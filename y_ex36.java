package _40_exercicios;

import javax.swing.JOptionPane;

public class y_ex36 {

	public static void main(String[] args) {

		/*************************************************************************************************
		 * 
		 * Fa�a um algoritmo que receba o valor do sal�rio m�nimo e o valor do sal�rio
		 * de um funcion�rio, calcule e mostre a quantidade de sal�rios m�nimos que
		 * ganha esse funcion�rio.
		 *
		 ***************************************************************************************************/

		int salario;
		int conta1;

		salario = Integer.parseInt(JOptionPane.showInputDialog(null, " Quanto que voc� ganha? "));

		conta1 = salario / 1200;

		JOptionPane.showMessageDialog(null, " Voc� ganha: " + conta1 + " sal�rio m�nimos ");

	}

}
