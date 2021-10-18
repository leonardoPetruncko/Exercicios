package _40_exercicios;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class y_ex40 {

	public static void main(String[] args) {

		/*************************************************************************************************
		 * 
		 * 40. Faça um algoritmo que receba o valor dos catetos de um triângulo, calcule
		 * e mostre o valor da hipotenusa.
		 * 
		 ***************************************************************************************************/

		DecimalFormat df = new DecimalFormat("##,###");

		double hipo;
		double c1;
		double c2;

		c1 = Integer.parseInt(JOptionPane.showInputDialog(null, " Qual lado do cateto A?"));
		c2 = Integer.parseInt(JOptionPane.showInputDialog(null, " Qual lado do cateto B?"));

		hipo = (c1 * 2) + (c2 * 2);

		JOptionPane.showMessageDialog(null, " Valor da Hipotenusa =  " + hipo);

	}

}
