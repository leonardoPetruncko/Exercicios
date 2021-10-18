package _40_exercicios;

import javax.swing.JOptionPane;

public class y_ex23 {

	public static void main(String[] args) {

		/*************************************************************************************************
		 * 
		 * Num dia de sol, você deseja medir a altura de um prédio, porém, a trena não é
		 * suficientemente longa. Assumindo que seja possível medir sua sombra e a do
		 * prédio no chão, e que você lembre da sua altura, faça um algoritmo para ler
		 * os dados necessários e calcular a altura do prédio.
		 *
		 ***************************************************************************************************/

		double sPredio;
		double sUsuario;
		double aUsuario;

		double conta1;
		double conta2;

		sPredio = Double.parseDouble(JOptionPane.showInputDialog(null, " Informe tamanho da sombra do Predio. "));
		aUsuario = Double.parseDouble(JOptionPane.showInputDialog(null, " Informe tamanho da sombra do Usuário "));
		sUsuario = Double.parseDouble(JOptionPane.showInputDialog(null, " Informe altura do usuário "));

		conta1 = sPredio / aUsuario;
		conta2 = conta1 * sUsuario;

		JOptionPane.showMessageDialog(null, " Altura do Prédio > " + conta2);

	}

}
