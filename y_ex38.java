package _40_exercicios;

import javax.swing.JOptionPane;

public class y_ex38 {

	public static void main(String[] args) {

		/*************************************************************************************************
		 * 
		 * 38. Faça um algoritmo que receba o ano de nascimento de uma pessoa e o ano
		 * atual, calcule e mostre: a) a idade dessa pessoa em anos; b) a idade dessa
		 * pessoa em meses; c) a idade dessa pessoa em dias; d) a idade dessa pessoa em
		 * semanas.
		 *
		 ***************************************************************************************************/

		int nascimento;
		int anoAtual;
		int a;
		int b;
		int c;
		int d;

		nascimento = Integer.parseInt(JOptionPane.showInputDialog(null, " Qual ano você nasceu? "));
		anoAtual = Integer.parseInt(JOptionPane.showInputDialog(null, " Qual ano que estamos? "));

		a = anoAtual - nascimento;
		b = a * 12;
		c = a * 52;
		d = a * 365;

		JOptionPane.showMessageDialog(null, " a idade dessa pessoa em anos;  " + a + " a idade dessa pessoa em meses; "
				+ b + " a idade dessa pessoa em semanas; " + c + " a idade dessa pessoa em dias; " + d);

	}

}
