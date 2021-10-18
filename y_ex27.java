package _40_exercicios;

import javax.swing.JOptionPane;

public class y_ex27 {

	public static void main(String[] args) {

		/*************************************************************************************************
		 * 
		 * Faça um algoritmo que receba dois números, calcule e mostre a divisão do
		 * primeiro número pelo segundo. Sabe-se que o segundo número não pode ser zero,
		 * portanto não é necessário se preocupar com validações.
		 *
		 ***************************************************************************************************/

		int nu1;
		int nu2;
		int conta1;

		nu1 = Integer.parseInt(JOptionPane.showInputDialog(null, " Informe um Número"));
		nu2 = Integer.parseInt(JOptionPane.showInputDialog(null, " Informe um Número"));

		conta1 = nu1 / nu2;

		JOptionPane.showMessageDialog(null, " Seu primeiro número dividido pelo segundo fica: " + conta1);

	}

}
