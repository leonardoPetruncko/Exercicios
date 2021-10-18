package _40_exercicios;

import javax.swing.JOptionPane;

public class y_ex28 {

	public static void main(String[] args) {

		/*************************************************************************************************
		 * 
		 * Faça um algoritmo que receba duas notas, calcule e mostre a média ponderada
		 * dessas notas, considerando peso 2 para a primeira nota e peso 3 para a
		 * segunda nota.
		 *
		 ***************************************************************************************************/

		int nu1;
		int nu2;
		int conta1;

		nu1 = Integer.parseInt(JOptionPane.showInputDialog(null, " Informe o Primeiro Número"));
		nu2 = Integer.parseInt(JOptionPane.showInputDialog(null, " Informe o Segundo Número"));

		conta1 = (nu1 * 2) + (nu2 * 3) / 3 + 2;

		JOptionPane.showMessageDialog(null, " Seu Número fica: " + conta1);

	}

}
