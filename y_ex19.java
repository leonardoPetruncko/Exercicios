package _40_exercicios;

import javax.swing.JOptionPane;

public class y_ex19 {

	public static void main(String[] args) {

		/*************************************************************************************************
		 * 
		 * A granja Frangotech possui um controle automatizado de cada frango da sua
		 * produ��o. No p� direito do frango h� um anel com um chip de identifica��o; no
		 * p� esquerdo s�o dois an�is para indicar o tipo de alimento que ele deve
		 * consumir. Sabendo que o anel com chip custa R$4,00 e o anel de alimento custa
		 * R$3,50, fa�a um algoritmo para calcular o gasto total da granja para marcar
		 * todos os seus frangos.
		 *
		 ***************************************************************************************************/

		int quantidadeDeFrangos;
		double frangoChip, frangoComida, gastoTotal, conta1, conta2, conta3, conta4;

		quantidadeDeFrangos = Integer
				.parseInt(JOptionPane.showInputDialog(null, "  Informe quantos Frangos sua Fazenda possui.   "));

		frangoChip = 4;
		frangoComida = 7;

		conta1 = frangoChip * quantidadeDeFrangos;
		conta2 = frangoComida * quantidadeDeFrangos;

		conta3 = conta1 / frangoChip;
		conta4 = (conta2 / frangoComida) * 2;

		gastoTotal = (frangoChip + frangoComida) * quantidadeDeFrangos;

		JOptionPane.showMessageDialog(null,
				" Sua fazenda ter� que compra: " + conta3 + " Chips. De anel Alimento: " + conta4
						+ ".  O total gasto ser� de R$" + gastoTotal + "  Pre�o dos Chips: R$ " + conta1
						+ "  Pre�o do Anel Alimento: R$" + conta2);

	}

}
