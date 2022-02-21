package Exercicios;

import java.util.Scanner;

public class Ex02Loop06 {

	public static void main(String[] args) {
		/* EX 06 LOOP DO WHILE
		 * Escrever um programa que receba vários números 
		 * inteiros no teclado. E no final imprimir a média dos 
		 * números múltiplos de 3. Para sair digitar 0(zero).
		 *  */
		
		Scanner scan = new Scanner(System.in);
		
		int num, multiplos3 = 0, somaNum = 0, media = 0 ; 
		
		do {
			System.out.println("Por favor, digite um número inteiro, "
					+ "\nOu digite 0 para sair deste programa:");
			num = scan.nextInt();
			 
			if (num % 3 == 0 && num > 0) {
				multiplos3 += 1;
				
				somaNum += num;
				
				media = somaNum / multiplos3;
			}
			
		} while(num != 0);
		
		System.out.println("\nA média dos números múltiplos de 3 é: " + media);
		
	}

}
