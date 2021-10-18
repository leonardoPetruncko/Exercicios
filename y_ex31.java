package _40_exercicios;

import javax.swing.JOptionPane;

public class y_ex31 {

	public static void main(String[] args) {

		/*************************************************************************************************
		 * 
		 * 31. Faça um algoritmo que receba o peso de uma pessoa, calcule e mostre: a) o
		 * novo peso se a pessoa engordar 15% sobre o peso digitado; b) o novo peso se a
		 * pessoa emagrecer 20% sobre o peso digitado.
		 *
		 ***************************************************************************************************/

		double peso;
		double conta1;
		double conta2;

		peso = Double.parseDouble(JOptionPane.showInputDialog(null, " Qual seu Peso? "));

		conta1 = (peso * 0.15) + peso;
		conta2 = peso - (peso * 0.20);

		JOptionPane.showMessageDialog(null,
				" Se Você engordou está com: " + conta1 + "  Se vc emagreceu está com: " + conta2);

	}

}
