package AulasFundamentosJava;

import java.util.Scanner;

public class Aula4Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		float [] media = new float[5];
		//////String [] nome = new String[5];
		float n1,n2,n3, somaMedia = 0, mediaGeral;
		int x, aprovados = 0, reprovados = 0, exame = 0;
		
		for(x = 0; x < 5; x++) {
			//System.out.println("\nNotas do aluno: " + (x + 1));
			//nomeAluno[x] = entrada.nextLine();
			
			System.out.println("\nDigite a primeira nota: ");
			n1 = entrada.nextFloat();
			while(n1<0 || n1>10) {
				System.out.println("Esta nota não existe, digite novamente: ");
			}	
			
			System.out.println("\nDigite a segunda nota: ");
			n2 = entrada.nextFloat();
			while(n2<0 || n2>10) {
				System.out.println("Esta nota não existe, digite novamente: ");
			}
			
			System.out.println("\nDigite a terceira nota: ");
			n3 = entrada.nextFloat();
			while(n3<0 || n3>10) {
				System.out.println("Esta nota não existe, digite novamente: ");
			}
			
			//media na posição zero, depois media na posiçao 1, depois media na posicao 2, depois media na posi;cao 4
			media[x] = (n1+n2+n3) / 3;//assim não vao sobrescrever os valores, vai sempre guardar as medias em cada posição do array
		
			if(media[x] >= 7 && media[x] <= 10) {
				System.out.println("Aluno Aprovado!!");
				aprovados++;
			} else if(media[x] >= 5 && media[x] < 7) {
				System.out.println("Aluno de recuperação.");
				exame++;
			} else {
				System.out.println("Aluno Reprovado.");
				reprovados++;
			}
			
			System.out.println("\nMédia: " + media[x]);
			
			somaMedia += media[x];
			//somaMedia = somaMedia + media[x]
			
			///////System.out.println("\nAluno: " + nome[x] + "\nSua média: " + media);
			
		}
		
		//Neste momento, o x vale 5
		mediaGeral = somaMedia / x;
		System.out.println("A Média Geral das turma é: " + mediaGeral +
				"\nTivemos " + aprovados + " aluno(s) aprovado(s)."+
				"\nTivemos " + exame + " aluno(s) em exame."+
				"\nTivemos " + reprovados + " aluno(s) reprovado(s).");
		
	}

}
//media[x] pq é media[0], e x inicalmente tb é 0