package _40_exercicios;

import javax.swing.JOptionPane;

public class y_ex35 {

	public static void main(String[] args) {

		/*************************************************************************************************
		 * 
		 * 35. Fa�a um algoritmo que calcule e mostre a �rea de um losango. Sabe-se que:
		 * A = (diagonal_maior diagonal_menor)/2;
		 *
		 ***************************************************************************************************/

		int diagonalMaior;
		int diagonalMenor;
		int conta1;

		diagonalMaior = Integer.parseInt(JOptionPane.showInputDialog(null, " Quantos cm o Diagonal maior tem? "));
		diagonalMenor = Integer.parseInt(JOptionPane.showInputDialog(null, " Quantos cm o Diagonal menor tem? "));

		conta1 = (diagonalMaior * diagonalMenor) / 2;

		JOptionPane.showMessageDialog(null, " �rea do Losango �:  " + conta1);

	}

}
