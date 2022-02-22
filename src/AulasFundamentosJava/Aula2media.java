package AulasFundamentosJava;

import java.util.Scanner;

public class Aula2media {

	public static void main(String[] args) {
		//Sistema para média de notas e mensagem automática de aprovação,reprovação, exame
		

		//Defininição de variáveis e seus tipos:
		String aluno;
		float nota1, nota2, nota3, media;
	
		
		//Entrada de dados com a classe Scanner:
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Olá Aluno! \nPor favor, digite seu nome: ");
		aluno = entrada.nextLine(); //Entrada de dados do tipo String
		
		System.out.println("\nDigite sua primeira nota: ");
		nota1 = entrada.nextFloat(); //Entrada de dados do tipo float ou double
		
		System.out.println("\nDigite sua segunda nota: ");
		nota2 = entrada.nextFloat();
		
		System.out.println("\nDigite sua terceita nota: ");
		nota3 = entrada.nextFloat();
		
		
		//Processamento dos dados: 
		media = (nota1 + nota2 + nota3) / 3;
		
		
		//Saída dos dados:
		if(media >= 7 && media <= 10) {
			System.out.printf("\nAluno aprovado!! \n Parabéns %s! Sua média foi: %2.2f", aluno, media);
			//System.out.println("\nAluno aprovado!! \n Parabéns " + aluno + ", sua média foi: " + media);
		} 
		else if(media >= 5 && media < 7) {	
			System.out.printf("\nAluno de exame. \n Sua média foi: %2.2f", media);
			//System.out.println("\nAluno de exame. \n Sua média foi: " + media);
		} 
		else if (media >= 0 && media < 5){
			System.out.printf("\nAluno reprovado. \nSua média foi: %2.2f", media);
			//System.out.println("\nAluno reprovado. \nSua média foi: " + media);
		}
		else {
			System.out.println("\nMédia inválida");
		}
	}
}
