package _40_exercicios;

import javax.swing.JOptionPane;

public class ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*************************************************************************************************
		 * 
		 * Entrar com o dia e o mês de uma data e informar quantos dias se passaram
		 * desde o início do ano. Esqueça a questão dos anos bissextos e considere
		 * sempre que um mês possui 30 dias.
		 * 
		 * 
		 ***************************************************************************************************/

		int dia, mes, diasPassados;

		dia = Integer.parseInt(JOptionPane.showInputDialog(" Qual o Dia? "));
		mes = Integer.parseInt(JOptionPane.showInputDialog(" Qual o Mês? "));

		diasPassados = (mes * 30) + dia;

		JOptionPane.showMessageDialog(null, " Passaram: " + diasPassados + " Dias");

	}
}
