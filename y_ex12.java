package _40_exercicios;

import javax.swing.JOptionPane;

public class y_ex12 {

	public static void main(String[] args) {

		/*************************************************************************************************
		 * 
		 * Faça um algoritmo para ler o salário de um funcionário e aumentá-Io em 15%.
		 * Após o aumento, desconte 8% de impostos. Imprima o salário inicial, o salário
		 * com o aumento e o salário final.
		 * 
		 ***************************************************************************************************/

		int salarioInicial;
		double primeiroAumento, imposto, salarioComAumento, salarioFinal;

		salarioInicial = Integer.parseInt(JOptionPane.showInputDialog(null, " Qual o seu Salário? "));

		primeiroAumento = salarioInicial * 0.15;
		imposto = primeiroAumento * 0.8;

		salarioComAumento = salarioInicial + primeiroAumento;
		salarioFinal = salarioComAumento - imposto;

		JOptionPane.showMessageDialog(null,
				"   Seu Salário Incial é de:  " + salarioInicial + "  Seu Salário com aumento de 15% fica:  "
						+ salarioComAumento + "  Com Imposto de 8% o Salário final é de:  " + salarioFinal);

	}
}
