package _40_exercicios;

import javax.swing.JOptionPane;

public class y_ex37 {

	public static void main(String[] args) {

		/*************************************************************************************************
		 * 
		 * 37. Fa�a um algoritmo que calcule e mostre a tabuada de um n�mero digitado
		 * pelo usu�rio.
		 *
		 ***************************************************************************************************/

		int tabuada;
		int resultado;
		int i;

		tabuada = Integer.parseInt(JOptionPane.showInputDialog(null, "  Qual Tabuada vc deseja?  "));

		i = 1;
		while (i <= 10) {
			resultado = tabuada * i;

			JOptionPane.showMessageDialog(null, tabuada + "X" + i + " = " + resultado);
			i++;
		}

	}

}
