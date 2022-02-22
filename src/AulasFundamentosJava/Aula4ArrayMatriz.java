package AulasFundamentosJava;

import java.util.Scanner;

public class Aula4ArrayMatriz {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//bidimensional, ele sabe q é uma matriz 1dim qntidade de linhas a segunda dimentao é a qntidade de colunas
				//[2][3]
				//2 linhas por 3 colunas
		
		
		int [][] numeros = new int[2][3];
		int linha, coluna, qntPar = 0, somaImpar = 0;		
				
			//tem q rodar linha e colunao ao mesmo tempo, pq é bidim
		//por isso o for vai ser encadeado
		
		for(linha = 0; linha < 2; linha++) {
			for(coluna = 0; coluna < 3; coluna++) {
				System.out.println("Entre com um numero: ");
				numeros[linha][coluna] = entrada.nextInt();
				
				if(numeros[linha][coluna] % 2 == 0) {	
					qntPar++;
				} else {
					somaImpar += numeros[linha][coluna];
				}
				
			}
			
		}
				
				
		

	}

}
