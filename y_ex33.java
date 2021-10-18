package _40_exercicios;

import javax.swing.JOptionPane;

public class y_ex33 {

	public static void main(String[] args) {

		/*************************************************************************************************
		 * 
		 * 33. Faça um algoritmo que calcule e mostre a área de um trapézio. Sabe-se
		 * que: A = (base maior + base menor)* altura)/2 ;
		 *
		 ***************************************************************************************************/

		int basemaior;
		int basemenor;
		int altura;
		int conta1;

		basemaior = Integer.parseInt(JOptionPane.showInputDialog(null, " Qual a Base Maior"));
		basemenor = Integer.parseInt(JOptionPane.showInputDialog(null, " Qual a Base Menor? "));
		altura = Integer.parseInt(JOptionPane.showInputDialog(null, " Qual a Altura? "));

		conta1 = ((basemaior + basemenor) * altura) / 2;

		JOptionPane .showMessageDialog(null, " Área do Trapezio é " + conta1);

	}

}
