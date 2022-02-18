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
		int num;
		
		System.out.println("Digite um número inteiro: ");
		num = entrada.nextInt();
		
		
		//Processamentos e saída dos dados 		
		if(num > 100) {
			System.out.println("O valor digitado foi: " + num);
		} 
		else if (num == 0){ 
			System.out.println("O valor digitado foi ZERO!");
		} 
		else if (num < 100){
			System.out.println("O valor digitado foi: " + num);
		}
//		else {
//			System.out.println("ZERO");
//		}
//		//n == (float
	}

}
