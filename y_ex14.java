package _40_exercicios;

import javax.swing.JOptionPane;

public class y_ex14 {

	public static void main(String[] args) {

		/*************************************************************************************************
		 * 
		 * Calcule a �rea de uma pizza que possui um raio R ( pi= 3.14 ).
		 *
		 ***************************************************************************************************/

		int raio;
		double pi, r;

		raio = Integer.parseInt(JOptionPane.showInputDialog(null, " Informe o Raio de uma circunfer�ncia. "));

		pi = 3.14;

		r = pi * (raio * raio);

		JOptionPane.showMessageDialog(null, "a �rea da circunfer�ncia �: " + r);

	}
}
