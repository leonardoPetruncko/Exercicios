package _40_exercicios;

import javax.swing.JOptionPane;

public class ex9 {

	public static void main(String[] args) {

		/*************************************************************************************************
		 * 
		 * Uma f�brica de camisetas produz os tamanhos pequeno, m�dio e grande, cada uma
		 * sendo vendida respectivamente por 10, 12 e 15 reais. Construa um algoritmo em
		 * que o usu�rio forne�a a quantidade de camisetas pequenas, m�dias e grandes
		 * referentes a uma venda, e a m�quina informe quanto ser� o valor arrecadado.
		 * 
		 ***************************************************************************************************/

		int camisetaP, camisetaM, camisetaG, totalCamisetas, p, m, g, totalVendas;

		camisetaP = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantas camisetas P foram vendidas?"));
		camisetaM = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantas camisetas M foram vendidas?"));
		camisetaG = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantas camisetas G foram vendidas?"));

		totalCamisetas = camisetaP + camisetaM + camisetaG;

		p = 10;
		m = 12;
		g = 15;

		totalVendas = (camisetaP * p) + (camisetaM * m) + (camisetaG * g);

		JOptionPane.showMessageDialog(null,
				"  Total de camisetas Vendidas:  " + totalCamisetas + "  Total de Lucro adquirido:  " + totalVendas);

	}
}
