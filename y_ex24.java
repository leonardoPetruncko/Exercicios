package _40_exercicios;

import javax.swing.JOptionPane;

public class y_ex24 {

	public static void main(String[] args) {

		/*************************************************************************************************
		 * 
		 * Um tonel de refresco é feito com 8 partes de água mineral e 2 partes de suco
		 * de maracujá. Faça um algoritmo para calcular quantos litros de água e de suco
		 * são necessários para se fazer X litros de refresco (informados pelo usuário).
		 *
		 ***************************************************************************************************/

		int litro;
		int copodeagua;
		int maracuja;
		int conta1;
		int conta2;

		litro = Integer.parseInt(JOptionPane.showInputDialog(null, " Quantos litros de Suco você deseja? "));

		copodeagua = 8;
		maracuja = 2;

		conta1 = litro * copodeagua;
		conta2 = litro * maracuja;

		JOptionPane.showMessageDialog(null,
				" Você vai precisar de " + conta1 + " Copos de água,  " + conta2 + "  Partes de Maracuja.");

	}

}
