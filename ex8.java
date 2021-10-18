package _40_exercicios;

import javax.swing.JOptionPane;

public class ex8 {

	public static void main(String[] args) {

		/*************************************************************************************************
		 * 
		 * Faça um algoritmo para ler três notas de um aluno em uma disciplina e
		 * imprimir a sua média ponderada (as notas tem pesos respectivos de 1, 2 e 3).
		 * 
		 ***************************************************************************************************/

		int media;
		int a, b, c, d;

		d = 3;

		a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a nota da prova 1"));
		b = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a nota da prova 2"));
		c = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a nota da prova 3"));

		media = (a + b + c) / d;

		JOptionPane.showMessageDialog(null, " Sua nota é " + media);

	}
}
