package _40_exercicios;

import javax.swing.JOptionPane;

public class y_ex20 {

	public static void main(String[] args) {

		/*************************************************************************************************
		 * 
		 * Uma confec��o produz X blusas de l� e para isto gasta uma certa quantidade de
		 * novelos. Fa�a um algoritmo para calcular quantos novelos de l� ela gasta por
		 * blusa.
		 *
		 ***************************************************************************************************/

		int blusas, novelo, conta1, conta2, totalDenovelos;

		blusas = Integer.parseInt(JOptionPane.showInputDialog(null, "  Quantas blusas seram feitas hoje?  "));

		novelo = 6;
		conta2 = novelo * blusas;
		conta1 = conta2 / blusas;
		totalDenovelos = conta2;

		JOptionPane.showMessageDialog(null, " Seram usadas: " + conta1 + " De novelos por Blusa, " + totalDenovelos
				+ " Total de novelos que seram usados. ");

	}

}
