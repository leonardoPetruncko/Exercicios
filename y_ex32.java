package _40_exercicios;

import javax.swing.JOptionPane;

public class y_ex32 {

	public static void main(String[] args) {

		/*************************************************************************************************
		 * 
		 * 32. Faça um algoritmo que receba o peso de uma pessoa em quilos, calcule e
		 * mostre esse peso em gramas.
		 *
		 ***************************************************************************************************/

		double peso;
		double conta1;

		peso = Double.parseDouble(JOptionPane.showInputDialog(null, " Qual seu Peso? "));

		conta1 = peso * 1000;

		JOptionPane.showMessageDialog(null, " Seu peso em gramas é:  " + conta1 + "g");

	}

}
