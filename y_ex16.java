package _40_exercicios;

import javax.swing.JOptionPane;

public class y_ex16 {

	public static void main(String[] args) {

		/*************************************************************************************************
		 * 
		 * A lanchonete Gostosura vende apenas um tipo de sandu�che, cujo recheio inclui
		 * duas fatias de queijo, uma fatia de presunto e uma rodela de hamb�rguer.
		 * Sabendo que cada fatia de queijo ou presunto pesa 50 gramas, e que a rodela
		 * de hamb�rguer pesa 100 gramas, fa�a um algoritmo em que o dono forne�a a
		 * quantidade de sandu�ches a fazer, e a m�quina informe as quantidades (em
		 * quilos) de queijo, presunto e carne necess�rios para compra.
		 *
		 ***************************************************************************************************/

		int qtsanduba;
		double queijo, presunto, hambueguer, conta1, conta2, conta3;

		qtsanduba = Integer
				.parseInt(JOptionPane.showInputDialog(null, "  Informe a quantidade de sanduiches do dia.  "));

		queijo = 0.1;
		presunto = 0.5;
		hambueguer = 0.1;

		conta1 = qtsanduba * queijo;
		conta2 = qtsanduba * presunto;
		conta3 = qtsanduba * hambueguer;

		JOptionPane.showMessageDialog(null,
				"  Para fazer essa quantidade de lanches:  " + qtsanduba + "  Vai precisar de  " + conta1
						+ "  KG de Queijo,   " + conta2 + "  KG de Presunto e de Hamburguer  " + conta3 + "  KG");

	}
}
