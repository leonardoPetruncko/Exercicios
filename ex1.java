package _40_exercicios;

import javax.swing.JOptionPane;

public class ex1 {

	public static void main(String[] args) {

		/************************************************************************
		 * 
		 * A imobili�ria Im�bilis vende apenas terrenos retangulares. Fa�a um algoritmo
		 * para ler as dimens�es de um terreno e depois exibir a �rea do terreno.
		 * 
		 ************************************************************************/
		int area, b, a;

		b = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o Lado do terreno de frente em Metros "));
		a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o Comprimento do Terreno em Metros"));

		area = b * a;

		JOptionPane.showMessageDialog(null, " Sua �rea � " + area);

	}
}
