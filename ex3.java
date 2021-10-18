package _40_exercicios;

import javax.swing.JOptionPane;

public class ex3 {

	public static void main(String[] args) {

		/************************************************************************
		 * 
		 * A padaria Hotpão vende uma certa quantidade de pães franceses e uma
		 * quantidade de broas a cada dia. Cada pãozinho custa R$ 0,12 e a broa custa R$
		 * 1,50. Ao final do dia, o dono quer saber quanto arrecadou com a venda dos
		 * pães e broas (juntos), e quanto deve guardar numa conta de poupança (10% do
		 * total arrecadado). Você foi contratado para fazer os cálculos para o dono.
		 * Com base nestes fatos, faça um algoritmo para ler as quantidades de pães e de
		 * broas, e depois calcular os dados solicitados
		 * 
		 ************************************************************************/

		int pao, broa, lancheTotal;
		double contaPoupanca, vendaTotal, precoPao, precoBroa;

		pao = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos Pães foram vendidos?"));
		broa = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantas broas fora vendidas?"));

		lancheTotal = pao + broa;

		precoPao = 0.12;
		precoBroa = 1.50;

		vendaTotal = (0.12 * pao) + (1.50 * broa);

		contaPoupanca = vendaTotal * 0.10;

		JOptionPane.showMessageDialog(null, "  Lanches vendidos no dia =  " + lancheTotal + "  Lucro do dia:  "
				+ vendaTotal + "  O valor para Depositor na Conta Poupança será de:  " + contaPoupanca);

	}
}
