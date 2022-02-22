package AulasFundamentosJava;

import java.util.Scanner;

public class Aula2CorrecaoDecisao {

	public static void main(String[] args) {
		//Sistema que lê um número inteiro e mostra uma msg indicando 
		//se o número é par ou ímpar, e se é positivo ou negativo

		
		//Defininição de variáveis e seus tipos:
		int numero;
		
		
		//Entrada de dados com a classe Scanner:
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro: ");
		numero = entrada.nextInt();
		
		
		//Processamento dos dados:
		if (numero % 2 == 0) {
			if(numero >= 0) {
				System.out.println("\nO número é par e positivo");
			} else {
				System.out.println("O número é par e negativo");
			}
		} 
		else if (numero % 2 != 0) {
			if(numero >= 0) {
				System.out.println("\nO número é ímpar e positivo");
			} else {
				System.out.println("O número é ímpar e negativo");
			}
	
		} 
		else {
			System.out.println("\nEste número não é válido. \nPor favor, digite novamente.");
		}
					
	}

}

/*
numero par/2 -> resto = 0
numero impar/2 -> resto = 1 -> resto != 0
*/
