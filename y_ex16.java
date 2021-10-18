package _40_exercicios;

import javax.swing.JOptionPane;

public class y_ex16 {

	public static void main(String[] args) {

		/*************************************************************************************************
		 * 
		 * A lanchonete Gostosura vende apenas um tipo de sanduíche, cujo recheio inclui
		 * duas fatias de queijo, uma fatia de presunto e uma rodela de hambúrguer.
		 * Sabendo que cada fatia de queijo ou presunto pesa 50 gramas, e que a rodela
		 * de hambúrguer pesa 100 gramas, faça um algoritmo em que o dono forneça a
		 * quantidade de sanduíches a fazer, e a máquina informe as quantidades (em
		 * quilos) de queijo, presunto e carne necessários para compra.
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
