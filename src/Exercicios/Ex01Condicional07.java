package Exercicios;

import java.util.Scanner;

public class Ex01Condicional07 {

	public static void main(String[] args) {
		/* EX 7
		 * Receber valores de base e altura de um triângulo e
		 * verificar se são valores válidos (positivos maiores que 
		 * zero). Em caso afirmativo, calcular a área do triângulo.
		 */

		Scanner entrada = new Scanner(System.in);
		
		//Entrada dos dados
		float b, h, area;
		
		System.out.printf("Qual a base do triângulo?\n");
		b = entrada.nextFloat();
		System.out.printf("E qual a altura do triângulo?\n");
		h = entrada.nextFloat();
		
		
		//Processamentos e saída dos dados 
		area = b * h;
		
		if (b > 0 && h > 0) {	
				System.out.printf("A área deste triângulo é %.2f. ", area);
		}	
		else if (b == 0 || h == 0) {
			System.out.println("\nBase e altura não podem ter valor ZERO. "
					+ "\nPor favor, tente novamente com valores maiores que zero. ");
		}
		else {
			System.out.println("\nValor inválido. \nPor favor, tente novamente.");
		}

	}

}
