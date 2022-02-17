package Exercicios;

import java.util.Scanner;

public class Ex01Condicional01 {

	public static void main(String[] args) {
		/* EX 1
		 * João Papo-de-Pescador, homem de bem, comprou um microcomputador 
		 * para controlar o rendimento diário de seu trabalho. Toda vez que 
		 * ele traz um peso de tomate maior que o estabelecido pelo regulamento 
		 * do estado de São Paulo (50 quilos) deve pagar um multa de R$ 4,00 
		 * por quilo excedente. João precisa que você faça um sistema que leia 
		 * a variável P (peso de tomates) e verifique se há excesso. Se houver, 
		 * gravar na variável E (Excesso) e na variável M o valor da multa que 
		 * João deverá pagar. Caso contrário mostrar tais variáveis com o 
		 * conteúdo ZERO.
		 * */
		
		Scanner entrada = new Scanner(System.in);
		
		//Entrada dos dados
		float peso, excesso, multa;
		
		System.out.println("Digite qual o peso dos tomates (kg): ");
		peso = entrada.nextFloat();
		
		
		//Processamentos e saída dos dados 
		if (peso > 50) {
			excesso = peso - 50;
			multa = excesso * 4;
			System.out.printf("\nPeso acima de 50,00kg \nExcesso do peso: %.2fkg \nValor total da multa: R$%.2f", excesso, multa);
		} 
		else {
			System.out.println("Não houve excesso de peso \nValor da multa: 0,00");
		}

	}

}
