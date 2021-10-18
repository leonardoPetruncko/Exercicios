package _40_exercicios;

import javax.swing.JOptionPane;

public class y_ex13 {

	public static void main(String[] args) {

		/*************************************************************************************************
		 * 
		 * Ler um número inteiro (assuma até três dígitos) e imprimir a saída da
		 * seguinte forma: CENTENA = x | DEZENA = x | UNIDADE = x
		 *
		 ***************************************************************************************************/

		int numeroTres, conta1cen, conta2dez, conta3uni;

		numeroTres = Integer.parseInt(JOptionPane.showInputDialog(null, " Escreva um Número de Três Digitos"));

		conta1cen = (numeroTres % 100) % 10;
		conta2dez = (numeroTres % 100) / 10;
		conta3uni = (numeroTres / 100);

		JOptionPane.showMessageDialog(null,
				"Unidade = " + conta1cen + " Dezena = " + conta2dez + " Unidade = " + conta3uni);

	}
}
