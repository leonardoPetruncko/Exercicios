package _40_exercicios;

import javax.swing.JOptionPane;

public class y_ex17 {

	public static void main(String[] args) {

		/*************************************************************************************************
		 * 
		 * Alguns pa�ses medem temperaturas em graus Celsius, e outros em graus
		 * Fahrenheit. Fa�a um algoritmo para ler uma temperatura Celsius e imprimi-Ia
		 * em Fahrenheit (pesquise como fazer este tipo de convers�o).
		 *
		 ***************************************************************************************************/

		int temperaturaC;
		int conta;

		temperaturaC = Integer
				.parseInt(JOptionPane.showInputDialog(null, " Informe a Temperatura do dia em Celsius.  "));

		conta = (9 * temperaturaC + 160) / 5;

		JOptionPane.showMessageDialog(null, " Temperatura em Fahrenheit:  " + conta);

	}
}
