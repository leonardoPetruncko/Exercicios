package _40_exercicios;

import javax.swing.JOptionPane;

public class y_ex23 {

	public static void main(String[] args) {

		/*************************************************************************************************
		 * 
		 * Num dia de sol, voc� deseja medir a altura de um pr�dio, por�m, a trena n�o �
		 * suficientemente longa. Assumindo que seja poss�vel medir sua sombra e a do
		 * pr�dio no ch�o, e que voc� lembre da sua altura, fa�a um algoritmo para ler
		 * os dados necess�rios e calcular a altura do pr�dio.
		 *
		 ***************************************************************************************************/

		double sPredio;
		double sUsuario;
		double aUsuario;

		double conta1;
		double conta2;

		sPredio = Double.parseDouble(JOptionPane.showInputDialog(null, " Informe tamanho da sombra do Predio. "));
		aUsuario = Double.parseDouble(JOptionPane.showInputDialog(null, " Informe tamanho da sombra do Usu�rio "));
		sUsuario = Double.parseDouble(JOptionPane.showInputDialog(null, " Informe altura do usu�rio "));

		conta1 = sPredio / aUsuario;
		conta2 = conta1 * sUsuario;

		JOptionPane.showMessageDialog(null, " Altura do Pr�dio > " + conta2);

	}

}
