package _40_exercicios;

import javax.swing.JOptionPane;

public class ex1 {

	public static void main(String[] args) {

		/************************************************************************
		 * 
		 * A imobiliária Imóbilis vende apenas terrenos retangulares. Faça um algoritmo
		 * para ler as dimensões de um terreno e depois exibir a área do terreno.
		 * 
		 ************************************************************************/
		int area, b, a;

		b = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o Lado do terreno de frente em Metros "));
		a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o Comprimento do Terreno em Metros"));

		area = b * a;

		JOptionPane.showMessageDialog(null, " Sua área é " + area);

	}
}
