package _40_exercicios;

import javax.swing.JOptionPane;

public class y_ex30 {

	public static void main(String[] args) {

		/*************************************************************************************************
		 * 
		 * Um funcionário recebe um salário fixo mais 4% de comissão sobre as vendas.
		 * Faça um algoritmo que receba o salário fixo de um funcionário e o valor de
		 * suas vendas, calcule e mostre a comissão e o salário final do funcionário.
		 *
		 ***************************************************************************************************/

		int salario;
		int comissao;
		double conta1;
		double conta2;

		salario = Integer.parseInt(JOptionPane.showInputDialog(null, " Salário do Funcionário: R$"));
		comissao = Integer.parseInt(JOptionPane.showInputDialog(null, " Quantas Vendas ele obteve? "));

		conta1 = (salario * 0.4);
		conta2 = salario + conta1;

		JOptionPane.showMessageDialog(null, " O salário do Funcionario é de: R$" + salario + "  Com  " + comissao
				+ "  de Vendas, ele obteve uma comissao de  " + conta1 + "  O Salário total é de: R$" + conta2);

	}

}
