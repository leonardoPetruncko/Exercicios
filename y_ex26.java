package _40_exercicios;

import javax.swing.JOptionPane;

public class y_ex26 {

	public static void main(String[] args) {

		/*************************************************************************************************
		 * 
		 * Fa�a um algoritmo que receba tr�s n�meros, calcule e mostre a multiplica��o
		 * desses n�meros.
		 *
		 ***************************************************************************************************/

		int nu1;
		int nu2;
		int nu3;

		int conta1;

		nu1 = Integer.parseInt(JOptionPane.showInputDialog(null, " Informe um N�mero"));
		nu2 = Integer.parseInt(JOptionPane.showInputDialog(null, " Informe um N�mero"));
		nu3 = Integer.parseInt(JOptionPane.showInputDialog(null, " Informe um N�mero"));

		conta1 = nu1 * nu2 * nu3;
		
		JOptionPane.showMessageDialog(null, " Seus Tr�s n�meros multiplicado:  " + conta1);

	}

}
