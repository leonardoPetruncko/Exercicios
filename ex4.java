package _40_exercicios;

import javax.swing.JOptionPane;

public class ex4 {

	public static void main(String[] args) {
	
		/*************************************************************************************************
		 * 
		 * Escreva um algoritmo para ler o nome e a idade de uma pessoa, e exibir quantos dias de vida ela 
		 * possui. Considere sempre anos completos, e que um ano possui 365 dias. Ex uma pessoa com 
		 * 19 anos possui 6935 dias de vida; veja um exemplo de saída MARIA, VOCÊ JÁ VIVEU 6935 DIAS
		 *  
		***************************************************************************************************/
			String nome;		
			int idade;
			int conta;
			
			nome = JOptionPane.showInputDialog(" Qual seu Nome ");
			idade=Integer.parseInt(JOptionPane.showInputDialog( " Qual sua Idade " ));
			
			conta = idade * 365;
			
		JOptionPane.showMessageDialog(null, nome + ",  Você já viveu  =  " + conta +  " Dias "  );
		
	}
}
