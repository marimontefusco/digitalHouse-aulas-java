package Exercicios;

import java.util.Scanner;

public class Ex01Condicional08 {

	public static void main(String[] args) {
		/*EX 8
		 * Construa um sistema para ler uma variável numérica N e imprimi-la 
		 * somente se a mesma for maior que 100, caso contrário imprimi-la 
		 * com o valor zero.
		 */ 

		Scanner entrada = new Scanner(System.in);
		
		//Entrada dos dados
		int n;
		
		System.out.println("Digite um número inteiro: ");
		n = entrada.nextInt();
		
		
		//Processamentos e saída dos dados 		
		if(n > 100) {
			System.out.println("O valor digitado foi: " + n);
		} 
		
		else {
			System.out.println("ZERO");
		}

	}

}
