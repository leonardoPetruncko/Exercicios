package _40_exercicios;

import javax.swing.JOptionPane;

public class y_ex18 {

	public static void main(String[] args) {

		/*************************************************************************************************
		 * 
		 * A empresa Hipotheticus paga R$10,00 por hora normal trabalhada, e R$15,00 por
		 * hora extra. Faça um algoritmo para calcular e imprimir o salário bruto e o
		 * salário líquido de um determinado funcionário. Considere que o salário
		 * líquido é igual ao salário bruto descontando-se 10% de impostos.
		 *
		 ***************************************************************************************************/

		int horaNormal, horaExtra, conta1, conta2, conta3;
		double imposto, liquido;

		horaNormal = Integer.parseInt(JOptionPane.showInputDialog(null,
				"  Informe quantas horas trabalhou em um periodo Normal (8 horas).   "));

		horaExtra = Integer
				.parseInt(JOptionPane.showInputDialog(null, "  Informe quantas horas extras você fez no mês.  "));

		conta1 = horaNormal * 10;
		conta2 = horaExtra * 15;
		conta3 = conta1 + conta2;
		imposto = (conta1 + conta2) * 0.10;
		liquido = conta3 - imposto;

		JOptionPane.showMessageDialog(null,
				" Você trabalhou:  " + horaNormal + " Horas,  Recebendo:R$" + conta1
						+ " Em horas extra vc totalizou: R$" + conta2 + "  Seu Salário Bruto é de: R$" + conta3
						+ " Seu Salário Liquido é de: R$ " + liquido);
	}

}
