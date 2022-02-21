package Exercicios;

import java.util.Scanner;

public class Ex02Loop05 {

	public static void main(String[] args) {
		/* EX 05 LOOP DO WHILE
		 * Crie um programa que leia um número do teclado até que 
		 * encontre um número igual a zero. 
		 * No final, mostre a soma dos números digitados.
		 * */

		Scanner scan = new Scanner(System.in);
		
		int num, somaNum = 0;
		
		do {
			System.out.println("Por favor, digite um número, "
					+ "\nOu digite 0 para sair deste programa:");
			num = scan.nextInt();
			
			somaNum = somaNum + num;
			
		} while (num != 0);
		
		System.out.println("\nA soma dos números digitados é " + somaNum + ".");
		
	}

}
