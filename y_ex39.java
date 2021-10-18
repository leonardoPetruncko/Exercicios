package _40_exercicios;

import javax.swing.JOptionPane;

public class y_ex39 {

	public static void main(String[] args) {

		/*************************************************************************************************
		 * 
		 * 39. João recebeu seu salário de R$ 1200,00 e precisa pagar duas contas (C1=R$
		 * 200,00 e C2=R$120,00) que estão atrasadas. Como as contas estão atrasadas,
		 * João terá de pagar multa de 2% sobre cada conta. Faça um algoritmo que
		 * calcule e mostre quanto restará do salário do João
		 * 
		 ***************************************************************************************************/

		// João recebeu seu salário de R$ 1200,00 e precisa pagar duas contas (C1=R$
		// 200,00 e
		// C2=R$120,00) que estão atrasadas. Como as contas estão atrasadas, João terá
		// de pagar multa de
		// 2% sobre cada conta. Faça um algoritmo que calcule e mostre quanto restará do
		// salário do João

		int salario;
		double c1;
		double c2;
		double conta1;

		salario = Integer.parseInt(JOptionPane.showInputDialog(null, " joão, Qual seu salário? "));

		c1 = (200 * 0.02) + 200;
		c2 = (120 * 0.02) + 200;

		conta1 = salario - (c1 + c2);

		JOptionPane .showMessageDialog(null, " O Novo valor da conta de luz é; " + c1 + " , o Valor da Conta de Água é; "
				+ c2 + "   Restante do Salário: R$" + conta1);

	}

}
