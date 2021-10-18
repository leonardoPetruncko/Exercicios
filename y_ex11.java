package _40_exercicios;

import javax.swing.JOptionPane;

public class y_ex11 {

	public static void main(String[] args) {

		/*************************************************************************************************
		 * 
		 * 11. Uma fábrica controla o tempo de trabalho sem acidentes pela quantidade de
		 * dias. Faça um algoritmo para converter este tempo em anos, meses e dias.
		 * Assuma que cada mês possui sempre 30 dias.
		 * 
		 ***************************************************************************************************/

		int diasSemAcidentes, dia, meses, ano, conta1, conta2, conta3;

		diasSemAcidentes = Integer
				.parseInt(JOptionPane.showInputDialog(null, " Quanto tempo que a empresa não sofre um acidente ? "));

		dia = 1;
		meses = 30;
		ano = 365;

		conta1 = diasSemAcidentes / dia;
		conta2 = diasSemAcidentes / meses;
		conta3 = diasSemAcidentes / ano;

		JOptionPane.showMessageDialog(null, " A empresa não sofre um acidentes a exatos " + conta1 + " Dias , " + conta2
				+ " Meses e " + conta3 + " Anos. ");

	}
}
