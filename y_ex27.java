package _40_exercicios;

import javax.swing.JOptionPane;

public class y_ex27 {

	public static void main(String[] args) {

		/*************************************************************************************************
		 * 
		 * Fa�a um algoritmo que receba dois n�meros, calcule e mostre a divis�o do
		 * primeiro n�mero pelo segundo. Sabe-se que o segundo n�mero n�o pode ser zero,
		 * portanto n�o � necess�rio se preocupar com valida��es.
		 *
		 ***************************************************************************************************/

		int nu1;
		int nu2;
		int conta1;

		nu1 = Integer.parseInt(JOptionPane.showInputDialog(null, " Informe um N�mero"));
		nu2 = Integer.parseInt(JOptionPane.showInputDialog(null, " Informe um N�mero"));

		conta1 = nu1 / nu2;

		JOptionPane.showMessageDialog(null, " Seu primeiro n�mero dividido pelo segundo fica: " + conta1);

	}

}
