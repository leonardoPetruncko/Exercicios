package _40_exercicios;

import javax.swing.JOptionPane;

public class ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*************************************************************************************************
		 * 
		 * Entrar com o dia e o m�s de uma data e informar quantos dias se passaram
		 * desde o in�cio do ano. Esque�a a quest�o dos anos bissextos e considere
		 * sempre que um m�s possui 30 dias.
		 * 
		 * 
		 ***************************************************************************************************/

		int dia, mes, diasPassados;

		dia = Integer.parseInt(JOptionPane.showInputDialog(" Qual o Dia? "));
		mes = Integer.parseInt(JOptionPane.showInputDialog(" Qual o M�s? "));

		diasPassados = (mes * 30) + dia;

		JOptionPane.showMessageDialog(null, " Passaram: " + diasPassados + " Dias");

	}
}
