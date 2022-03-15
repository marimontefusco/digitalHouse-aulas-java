package AulasPooExceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excecao2 {
	
	//Demonstra lançamento de uma exceção quando ocorre uma divisão por ZERO
	public static int quociente(int numerador, int denominador) throws ArithmeticException {
		return numerador / denominador;
	}
		
	public static void main(String[] args) {
			
		Scanner scan = new Scanner(System.in);
			
		boolean continueLoop = true; //determina se mais entradas são necessárias
			
		do {
			try {
				System.out.println("\nDigite o numerador: ");
				int numerador = scan.nextInt();
					
				System.out.println("\nDigite o denominador: ");
				int denominador = scan.nextInt();
					
				int resultado = quociente(numerador, denominador);
				System.out.printf("\nResultado: %d / %d = %d\n", numerador, denominador, resultado);
				continueLoop = false;//pra não ficar em loop infinito
							
			} 
			catch(InputMismatchException e) {
				System.err.printf("\n\nException: %s \n, ", e); //mostrar qual exception esta dando erro 
				scan.nextLine(); //fazer a limpeza do cache
				System.out.println("\nVocê deve digitar um valor do tipo inteiro..."
						+ " Por favor, tente novamente!!!");
			}
			catch (ArithmeticException a) {
				System.err.printf("\n\nException: %s \n", a);
				System.out.println("\nZero é um denominador inválido!"
						+ " Por favor, tente novamente!!!");
			}

		} while(continueLoop);
			
	}

}

//throws -> É uma exceção que vai ser lançada mas nada obriga ela ser tratada
//Vai verificar se na execução do mét quociente existe a exception ArithmeticException

//colocar a possível exceção que pode acontecer caso eu tenha 
//um problema dentro da execução do meu método quociente

//ArithmeticException -> Excecão aritmética -> quando ususário entra com 0 ZERO, onde não pode
//neste caso o denominador não pode ser 0, então ele mostra msg erro pro usuário

//InputMismatchException -> quando ususário entra com um TIPO DE DADO não referente ao que estou esperando

//.err -> é um objeto dentro do system, que mostra uma mensagem de erro e fica em vermelho
	
	