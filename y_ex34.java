package _40_exercicios;

import javax.swing.JOptionPane;

public class y_ex34 {

	public static void main(String[] args) {

		/*************************************************************************************************
		 * 
		 * 34. Fa�a um algoritmo que calcule e mostre a �rea de um quadrado. Sabe-se
		 * que: A = lado * lado;
		 *
		 ***************************************************************************************************/

		int lado;
		int conta1;

		lado = Integer.parseInt(JOptionPane.showInputDialog(null, " Quantos cm o Lado do Quadrado tem? "));

		conta1 = lado * lado;

		JOptionPane.showMessageDialog(null, " �rea do Quadrado �:  " + conta1);

	}

}
