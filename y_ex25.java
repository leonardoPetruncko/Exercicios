package _40_exercicios;

import javax.swing.JOptionPane;

public class y_ex25 {

	public static void main(String[] args) {

		/*************************************************************************************************
		 * 
		 * Calcule o volume de uma caixa d'água cilíndrica.
		 *
		 ***************************************************************************************************/
		
		int raio;
		double pi;
		double r;

		raio = Integer.parseInt(JOptionPane.showInputDialog(null, " Informe o Raio da Caixa d´água cilíndrica."));

		pi = 3.14;

		r = pi * (raio * raio);

		JOptionPane.showMessageDialog(null, "O volume é: " + r);

	}
}
