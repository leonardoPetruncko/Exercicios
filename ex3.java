package _40_exercicios;

import javax.swing.JOptionPane;

public class ex3 {

	public static void main(String[] args) {

		/************************************************************************
		 * 
		 * A padaria Hotp�o vende uma certa quantidade de p�es franceses e uma
		 * quantidade de broas a cada dia. Cada p�ozinho custa R$ 0,12 e a broa custa R$
		 * 1,50. Ao final do dia, o dono quer saber quanto arrecadou com a venda dos
		 * p�es e broas (juntos), e quanto deve guardar numa conta de poupan�a (10% do
		 * total arrecadado). Voc� foi contratado para fazer os c�lculos para o dono.
		 * Com base nestes fatos, fa�a um algoritmo para ler as quantidades de p�es e de
		 * broas, e depois calcular os dados solicitados
		 * 
		 ************************************************************************/

		int pao, broa, lancheTotal;
		double contaPoupanca, vendaTotal, precoPao, precoBroa;

		pao = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos P�es foram vendidos?"));
		broa = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantas broas fora vendidas?"));

		lancheTotal = pao + broa;

		precoPao = 0.12;
		precoBroa = 1.50;

		vendaTotal = (0.12 * pao) + (1.50 * broa);

		contaPoupanca = vendaTotal * 0.10;

		JOptionPane.showMessageDialog(null, "  Lanches vendidos no dia =  " + lancheTotal + "  Lucro do dia:  "
				+ vendaTotal + "  O valor para Depositor na Conta Poupan�a ser� de:  " + contaPoupanca);

	}
}
