package _40_exercicios;

import javax.swing.JOptionPane;

public class y_ex31 {

	public static void main(String[] args) {

		/*************************************************************************************************
		 * 
		 * 31. Fa�a um algoritmo que receba o peso de uma pessoa, calcule e mostre: a) o
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
				" Se Voc� engordou est� com: " + conta1 + "  Se vc emagreceu est� com: " + conta2);

	}

}
