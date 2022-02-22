package AulasFundamentosJava;

import java.util.Scanner;

public class Aula3Repeticao1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		//Laço de Repetição - for
		float n1,n2,n3,media,somaMedia = 0, mediaGeral;
		
		for(int x = 1; x <= 5; x++) {
			System.out.println("Notas do aluno" + x + " : ");
			
			System.out.println("\nEntre com a primeira nota: ");
			n1 = entrada.nextFloat();
			while(n1 < 0 || n1 > 10) {//enqnto não digitar um valor certo, não vai sair do loop
				System.out.println("\nVocê digitou um valor fora de 0 e 10.\nEntre com a primeira nota: ");
				n1 = entrada.nextFloat();
			}
			
			System.out.println("\nEntre com a segunda nota: ");
			n2 = entrada.nextFloat();
			while(n2 < 0 || n2 > 10) {
				System.out.println("\nVocê digitou um valor fora de 0 e 10.\nEntre com a segunda nota: ");
				n2 = entrada.nextFloat();
			}
			
			System.out.println("\nEntre com a terceira nota: ");
			n3 = entrada.nextFloat();
			while(n3 < 0 || n3 > 10) {
				System.out.println("\nVocê digitou um valor fora de 0 e 10.\nEntre com a terceira nota: ");
				n3 = entrada.nextFloat();
			}
			
			media = (n1+ n2 + n3) / 3;
			
			somaMedia = somaMedia + media;//somaMedia = 0 + 7.5
			//somaMedia += media; somaMedia /= media
			
			System.out.println("\nAgora vamos pro próximo aluno!");
		}
		
		mediaGeral = somaMedia / 5;
		System.out.printf("\nMédia geral da turam: %.2f", mediaGeral);
	}
	
	
	
	
	

}
