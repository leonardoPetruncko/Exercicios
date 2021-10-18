package _40_exercicios;

import javax.swing.JOptionPane;

public class y_ex17 {

	public static void main(String[] args) {

		/*************************************************************************************************
		 * 
		 * Alguns países medem temperaturas em graus Celsius, e outros em graus
		 * Fahrenheit. Faça um algoritmo para ler uma temperatura Celsius e imprimi-Ia
		 * em Fahrenheit (pesquise como fazer este tipo de conversão).
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
