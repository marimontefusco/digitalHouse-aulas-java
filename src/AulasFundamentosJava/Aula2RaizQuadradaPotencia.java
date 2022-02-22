package PortoSeguro;

import java.util.Scanner;

public class Aula2RaizQuadradaPotencia {

	public static void main(String[] args) {
	
		//Defininição de variáveis e seus tipos:
		double nota1, nota2, nota3;
			//se fosse float, daria erro em Math.sqrt() e Math.pow()
		int x, y;
		
		
		//Entrada de dados com a classe Scanner:
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("\nDigite o valor da nota 2: ");
		nota2 = entrada.nextFloat();
		System.out.println("\nDigite o valor da nota 3: ");
		nota3 = entrada.nextFloat();
		
		
		//Processamento dos dados:
		nota1 = Math.sqrt(nota2); //Math.sqrt(double) -> pede parâmetro double
			//nota1 = raiz quadrada de nota2
		
		nota2 = Math.pow(nota3, 3); //Math.pow(base da potência, expoente da potência) -> pede parâmetros double
			//nota2 = nota3 elevada ao cubo;
		
		
		System.out.println("\nDigite um valor para X: ");
		x = entrada.nextInt();
		
		System.out.println("\nDigite um valor para Y: ");
		y = entrada.nextInt();
		
		x = x % y; //x = resto da divisão de x/y 
		System.out.println("O resto da divisão é " + x);
	}

}

/*
Métodos da Java.lenght():

Math.sqrt(double) -> raiz quadrada, parâmetro double
Math.pow(double a, double b) -> potenciação, parâmetro double
*/
