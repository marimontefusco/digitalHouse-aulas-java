package Exercicios;

import java.util.Scanner;

public class Ex02Loop03 {

	public static void main(String[] args) {
		/* Ex 03 LOOP WHILE
		 * Solicitar a idade de várias pessoas e imprimir: Total de pessoas
		 *  com menos de 21 anos. Total de pessoas com mais de 50 anos. 
		 *  O programa termina quando idade for =-99. (WHILE)
		 */

		Scanner scan = new Scanner(System.in);
		
		int idade = 0, menos21 = 0, mais50 = 0;
		
		while(idade != -99 ) {		
			System.out.println("Por favor, digite sua idade, "
					+ "\nAtenção: Caso queira finalizar o programa, digite: -99");
			idade = scan.nextInt();
			
			if (idade < 21) {
				menos21++;
			} 
			else if (idade > 50) {
				mais50++;
			}
			
		}
		
		System.out.println("\n\nQuantidade de pessoas abaixo dos 21 anos: "+ menos21
				+"\nQuantidade de pessoas acima dos 50 anos: " + mais50);
	
	}

}
