package _40_exercicios;

import java.util.Scanner;

public class y_ex15 {

	public static void main(String[] args) {

		/*************************************************************************************************
		 * 
		 * Tr�s amigos, Carlos, Andr� e Felipe. decidiram rachar igualmente a conta de
		 * um bar. Fa�a um algoritmo para ler o valor total da conta e imprimir quanto
		 * cada um deve pagar, mas fa�a com que Carlos e Andr� n�o paguem centavos. Ex:
		 * uma conta de R$101,53 resulta em R$33,00 para Carlos, R$33,00 para Andr� e
		 * R$35,53 para Felipe.
		 *
		 ***************************************************************************************************/

		double total, conta3;
		int conta1, conta2;

		try (Scanner leia = new Scanner(System.in)) {
			System.out.println("Total a pagar: ");
			total = leia.nextDouble();
		}

		System.out.println("Valor da conta: " + total);

		conta1 = (int) total / 3;
		conta2 = (int) total / 3;
		conta3 = total / 3;

		System.out.println("######## Quanto cada um tem que pagar?? ######\n ");

		System.out.println("Carlos: " + conta1);
		System.out.println("Andr�: " + conta2);
		System.out.println("Felipe: " + conta3);

	}

}
