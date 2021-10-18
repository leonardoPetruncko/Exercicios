package _40_exercicios;

import javax.swing.JOptionPane;

public class y_ex22 {

	public static void main(String[] args) {

		/*************************************************************************************************
		 * 
		 * Pedrinho tem um cofrinho com muitas moedas, e deseja saber quantos reais
		 * conseguiu poupar. Faça um algoritmo para ler a quantidade de cada tipo de
		 * moeda, e imprimir o valor total economizado, em reais. Considere que existam
		 * moedas de 1, 5, 10, 25 e 50 centavos, e ainda moedas de 1 real. Não havendo
		 * moeda de um tipo, a quantidade respectiva é zero.
		 *
		 ***************************************************************************************************/

		double pedrinho1;
		double pedrinho5;
		double pedrinho10;
		double pedrinho25;
		double pedrinho50;
		double pedrinho1R;

		double conta1;
		double conta2;
		double conta3;
		double conta4;
		double conta5;
		double conta6;

		double total;

		pedrinho1 = Integer.parseInt(JOptionPane.showInputDialog(null, " Quantas moedas de 1 Centavo?  "));
		pedrinho5 = Integer.parseInt(JOptionPane.showInputDialog(null, " Quantas moedas de 5 Centavo?  "));
		pedrinho10 = Integer.parseInt(JOptionPane.showInputDialog(null, " Quantas moedas de 10 Centavo?  "));
		pedrinho25 = Integer.parseInt(JOptionPane.showInputDialog(null, " Quantas moedas de 25 Centavo?  "));
		pedrinho50 = Integer.parseInt(JOptionPane.showInputDialog(null, " Quantas moedas de 50 Centavo?  "));
		pedrinho1R = Integer.parseInt(JOptionPane.showInputDialog(null, " Quantas moedas de 1 Real?  "));

		conta1 = pedrinho1 * 0.1;
		conta2 = pedrinho5 * 0.5;
		conta3 = pedrinho10 * 0.10;
		conta4 = pedrinho25 * 0.25;
		conta5 = pedrinho50 * 0.50;
		conta6 = pedrinho1R * 1;

		total = conta1 + conta2 + conta3 + conta4 + conta5 + conta6;

		JOptionPane.showMessageDialog(null, " Total de Moedas: R$" + total);

	}

}
