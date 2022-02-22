package AulasFundamentosJava;

import java.util.Scanner;

public class Aula3Repeticao2 {

	public static void main(String[] args) {
		//Laço DO WHILE
		
		Scanner entrada = new Scanner(System.in);
		
		int tabuada, x = 1, resultado;
		
		System.out.println("Entre com qual tabuada deseja calcular: ");
		tabuada = entrada.nextInt();
		
		System.out.println("Tabuada do " + tabuada);
		
		do {//executa esse bloco enqnto x <= 10
			resultado = x * tabuada;
			System.out.println("\n"+ tabuada + " X " + x + " = " +resultado);
			x++;
		}
		while(x <= 10); //condição pra continuar rodando o laço		
	}

}
//depois do while eu podeia continuar a excessão ou
//tb abrir um novo bloco de cógo pra ser realizado

//while: primeiro testa a condiçao e daí executa
//do while: primeiro executa e depois testa!