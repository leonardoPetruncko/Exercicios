package _40_exercicios;

import javax.swing.JOptionPane;

public class y_ex39 {

	public static void main(String[] args) {

		/*************************************************************************************************
		 * 
		 * 39. Jo�o recebeu seu sal�rio de R$ 1200,00 e precisa pagar duas contas (C1=R$
		 * 200,00 e C2=R$120,00) que est�o atrasadas. Como as contas est�o atrasadas,
		 * Jo�o ter� de pagar multa de 2% sobre cada conta. Fa�a um algoritmo que
		 * calcule e mostre quanto restar� do sal�rio do Jo�o
		 * 
		 ***************************************************************************************************/

		// Jo�o recebeu seu sal�rio de R$ 1200,00 e precisa pagar duas contas (C1=R$
		// 200,00 e
		// C2=R$120,00) que est�o atrasadas. Como as contas est�o atrasadas, Jo�o ter�
		// de pagar multa de
		// 2% sobre cada conta. Fa�a um algoritmo que calcule e mostre quanto restar� do
		// sal�rio do Jo�o

		int salario;
		double c1;
		double c2;
		double conta1;

		salario = Integer.parseInt(JOptionPane.showInputDialog(null, " jo�o, Qual seu sal�rio? "));

		c1 = (200 * 0.02) + 200;
		c2 = (120 * 0.02) + 200;

		conta1 = salario - (c1 + c2);

		JOptionPane .showMessageDialog(null, " O Novo valor da conta de luz �; " + c1 + " , o Valor da Conta de �gua �; "
				+ c2 + "   Restante do Sal�rio: R$" + conta1);

	}

}
