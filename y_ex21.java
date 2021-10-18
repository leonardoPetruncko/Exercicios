package _40_exercicios;

import javax.swing.JOptionPane;

public class y_ex21 {

	public static void main(String[] args) {

		/*************************************************************************************************
		 * 
		 * A fábrica de refrigerantes Meia-Cola vende seu produto em três formatos: lata
		 * de 350 ml, garrafa de 600 ml e garrafa de 2 litros. Se um comerciante compra
		 * uma determinada quantidade de cada formato, faça um algoritmo para calcular
		 * quantos litros de refrigerante ele comprou.
		 *
		 ***************************************************************************************************/

		double refrilata, garrafa600, garrafa2000, conta1, conta2, conta3, litrosTotal;

		refrilata = Integer.parseInt(JOptionPane.showInputDialog(null, "  Quantas Latas de 350ml Deseja?  "));
		garrafa600 = Integer.parseInt(JOptionPane.showInputDialog(null, "  Quantas Garrafas de 600ml Deseja?  "));
		garrafa2000 = Integer.parseInt(JOptionPane.showInputDialog(null, "  Quantas Garrafas de 2 Litros Deseja?  "));

		conta1 = refrilata * 0.35;
		conta2 = garrafa600 * 0.6;
		conta3 = garrafa2000 * 2;

		litrosTotal = conta1 + conta2 + conta3;

		JOptionPane.showMessageDialog(null, " Vc comprou " + litrosTotal + " Litros de Refrigerante ");

	}

}
