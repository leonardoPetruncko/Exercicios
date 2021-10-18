package _40_exercicios;

import javax.swing.JOptionPane;

public class y_ex26 {

	public static void main(String[] args) {

		/*************************************************************************************************
		 * 
		 * Faça um algoritmo que receba três números, calcule e mostre a multiplicação
		 * desses números.
		 *
		 ***************************************************************************************************/

		int nu1;
		int nu2;
		int nu3;

		int conta1;

		nu1 = Integer.parseInt(JOptionPane.showInputDialog(null, " Informe um Número"));
		nu2 = Integer.parseInt(JOptionPane.showInputDialog(null, " Informe um Número"));
		nu3 = Integer.parseInt(JOptionPane.showInputDialog(null, " Informe um Número"));

		conta1 = nu1 * nu2 * nu3;
		
		JOptionPane.showMessageDialog(null, " Seus Três números multiplicado:  " + conta1);

	}

}
