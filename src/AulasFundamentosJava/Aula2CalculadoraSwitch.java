package AulasFundamentosJava;

import java.util.Scanner;

public class Aula2CalculadoraSwitch {

	public static void main(String[] args) {
	
		//Defininição de variáveis e seus tipos:
		float n1, n2;
		double resultado = 0;
		int opcao;
	
		//Entrada de dados com a classe Scanner:
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("\nEntre com o primeiro número: ");
		n1 = entrada.nextFloat();
		
		System.out.println("\nEntre com o segundo número: ");
		n2 = entrada.nextFloat();
		
		System.out.println("\nOpção 1 para Soma");
		System.out.println("\nOpção 2 para Diferença");
		System.out.println("\nOpção 3 para Multiplicação");
		System.out.println("\nOpção 4 paraDivisão");
		System.out.println("\nDigite sua opção: ");
		opcao = entrada.nextInt();

		
		//Processamento dos dados:
		switch(opcao) 
		{
			case 1:
				resultado = n1 + n2;
				break;
			case 2:
				resultado = n1 - n2;
				break;
			case 3:
				resultado = n1 * n2;
				break;
			case 4:
				if(n2 == 0) {
					System.out.println("Não é possível fazer divisão por zero...");//
				}
				else {
					resultado = n1 / n2;
				}
				break;
			default: //excessão:
				System.out.println("Opção inválida");
			 
		}
		System.out.printf("\nResultado da operação: %8.2f" , resultado);
		
	}

}


/*
 resultado = 0 -> pq senão dá erro, diz q variável não foi inicializada 
 
 Podemos colocar if/else dentro do switch case e vice-versa
 
 Switch case -> não pega intervalo de valores. Pega valores inteiros (int) ou strings 
 mas não pega valores fracionários (float)
 	Se eu tiver intervalo de tempo ou valores fracionários, é melhor usar o if/else
 */
