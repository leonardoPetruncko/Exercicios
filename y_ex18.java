package _40_exercicios;

import javax.swing.JOptionPane;

public class y_ex18 {

	public static void main(String[] args) {

		/*************************************************************************************************
		 * 
		 * A empresa Hipotheticus paga R$10,00 por hora normal trabalhada, e R$15,00 por
		 * hora extra. Fa�a um algoritmo para calcular e imprimir o sal�rio bruto e o
		 * sal�rio l�quido de um determinado funcion�rio. Considere que o sal�rio
		 * l�quido � igual ao sal�rio bruto descontando-se 10% de impostos.
		 *
		 ***************************************************************************************************/

		int horaNormal, horaExtra, conta1, conta2, conta3;
		double imposto, liquido;

		horaNormal = Integer.parseInt(JOptionPane.showInputDialog(null,
				"  Informe quantas horas trabalhou em um periodo Normal (8 horas).   "));

		horaExtra = Integer
				.parseInt(JOptionPane.showInputDialog(null, "  Informe quantas horas extras voc� fez no m�s.  "));

		conta1 = horaNormal * 10;
		conta2 = horaExtra * 15;
		conta3 = conta1 + conta2;
		imposto = (conta1 + conta2) * 0.10;
		liquido = conta3 - imposto;

		JOptionPane.showMessageDialog(null,
				" Voc� trabalhou:  " + horaNormal + " Horas,  Recebendo:R$" + conta1
						+ " Em horas extra vc totalizou: R$" + conta2 + "  Seu Sal�rio Bruto � de: R$" + conta3
						+ " Seu Sal�rio Liquido � de: R$ " + liquido);
	}

}
