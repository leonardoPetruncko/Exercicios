package _40_exercicios;

import javax.swing.JOptionPane;

public class y_ex30 {

	public static void main(String[] args) {

		/*************************************************************************************************
		 * 
		 * Um funcion�rio recebe um sal�rio fixo mais 4% de comiss�o sobre as vendas.
		 * Fa�a um algoritmo que receba o sal�rio fixo de um funcion�rio e o valor de
		 * suas vendas, calcule e mostre a comiss�o e o sal�rio final do funcion�rio.
		 *
		 ***************************************************************************************************/

		int salario;
		int comissao;
		double conta1;
		double conta2;

		salario = Integer.parseInt(JOptionPane.showInputDialog(null, " Sal�rio do Funcion�rio: R$"));
		comissao = Integer.parseInt(JOptionPane.showInputDialog(null, " Quantas Vendas ele obteve? "));

		conta1 = (salario * 0.4);
		conta2 = salario + conta1;

		JOptionPane.showMessageDialog(null, " O sal�rio do Funcionario � de: R$" + salario + "  Com  " + comissao
				+ "  de Vendas, ele obteve uma comissao de  " + conta1 + "  O Sal�rio total � de: R$" + conta2);

	}

}
