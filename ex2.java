package _40_exercicios;

import javax.swing.JOptionPane;

public class ex2 {

	public static void main(String[] args) {

		/************************************************************************
		 * 
		 * Fa�a um algoritmo para calcular quantas ferraduras s�o necess�rias para
		 * equipar todos os cavalos comprados para um haras.
		 * 
		 ************************************************************************/

		int ferraduras, cavalos, conta;

		cavalos = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos cavalos vc comprou? "));

		ferraduras = 4;
		conta = cavalos * ferraduras;

		JOptionPane.showMessageDialog(null, " Vc vai precisa de " + conta + " Ferraduras");
		
	}
}
