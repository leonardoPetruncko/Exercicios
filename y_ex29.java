package _40_exercicios;

import javax.swing.JOptionPane;

public class y_ex29 {

	public static void main(String[] args) {

		/*************************************************************************************************
		 * 
		 * Fa�a um algoritmo que receba o pre�o de um produto, calcule e mostre o novo
		 * pre�o, sabendo-se que este sofreu um desconto de 10%.
		 *
		 ***************************************************************************************************/

		double nu1;
		double conta1;
		double conta2;

		nu1 = Double.parseDouble(JOptionPane.showInputDialog(null, " Pre�o do Salgadinho"));

		conta1 = nu1 * 0.1;
		conta2 = conta1 + nu1;

		JOptionPane.showMessageDialog(null, " O novo Pre�o do Salgadinho fica: " + conta2);

	}

}
