package _40_exercicios;

import javax.swing.JOptionPane;

public class y_ex12 {

	public static void main(String[] args) {

		/*************************************************************************************************
		 * 
		 * Fa�a um algoritmo para ler o sal�rio de um funcion�rio e aument�-Io em 15%.
		 * Ap�s o aumento, desconte 8% de impostos. Imprima o sal�rio inicial, o sal�rio
		 * com o aumento e o sal�rio final.
		 * 
		 ***************************************************************************************************/

		int salarioInicial;
		double primeiroAumento, imposto, salarioComAumento, salarioFinal;

		salarioInicial = Integer.parseInt(JOptionPane.showInputDialog(null, " Qual o seu Sal�rio? "));

		primeiroAumento = salarioInicial * 0.15;
		imposto = primeiroAumento * 0.8;

		salarioComAumento = salarioInicial + primeiroAumento;
		salarioFinal = salarioComAumento - imposto;

		JOptionPane.showMessageDialog(null,
				"   Seu Sal�rio Incial � de:  " + salarioInicial + "  Seu Sal�rio com aumento de 15% fica:  "
						+ salarioComAumento + "  Com Imposto de 8% o Sal�rio final � de:  " + salarioFinal);

	}
}
