package _40_exercicios;

import javax.swing.JOptionPane;

public class y_ex24 {

	public static void main(String[] args) {

		/*************************************************************************************************
		 * 
		 * Um tonel de refresco � feito com 8 partes de �gua mineral e 2 partes de suco
		 * de maracuj�. Fa�a um algoritmo para calcular quantos litros de �gua e de suco
		 * s�o necess�rios para se fazer X litros de refresco (informados pelo usu�rio).
		 *
		 ***************************************************************************************************/

		int litro;
		int copodeagua;
		int maracuja;
		int conta1;
		int conta2;

		litro = Integer.parseInt(JOptionPane.showInputDialog(null, " Quantos litros de Suco voc� deseja? "));

		copodeagua = 8;
		maracuja = 2;

		conta1 = litro * copodeagua;
		conta2 = litro * maracuja;

		JOptionPane.showMessageDialog(null,
				" Voc� vai precisar de " + conta1 + " Copos de �gua,  " + conta2 + "  Partes de Maracuja.");

	}

}
