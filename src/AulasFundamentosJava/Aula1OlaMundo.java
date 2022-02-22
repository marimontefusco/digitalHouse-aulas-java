package AulasFundamentosJava;

import java.util.Scanner;

public class Aula1OlaMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Defininição de variáveis e seus tipos:
		String nome; 
		int idade = 26;
		float altura;
		
		//Scanner: Lê a entrada de dados do usuário
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Olá Mundo!!");
		
		System.out.println("\nEntre com o seu nome: ");
		nome = leia.nextLine();
		//pegando a entrada digitada pelo usuário - String
		
		System.out.println("Entre com a sua altura: ");
		altura = leia.nextFloat();
		//pegando a entrada digitada pelo usuário - Float
		
		
		System.out.println("\nSeu nome é " + nome + 
				", você tem " + idade + " anos e " + altura + " de altura!" );
		
		System.out.printf("\nMeu nome é %s, eu tenho %d anos e" + "%2.2f de altura", nome, idade, altura);
	
	}

}

//Entrada de dados:
//Scanner -> pega o valor que vai ser digitado pelo usuário

//Criando um obj do tipo Scanner 
	//new -> instanciando esse obj
	//System.in -> entrada de sistema

//Saída de dados:
//System.out.println("") -> imprimir no console
//classe.objeto.metodo()

//.nextLine() -> valida q a entrada vai ser tipo String
//.nextFloat() -> valida q a entrada vai ser tipo Float
//.nextInt() -> -> valida q a entrada vai ser tipo Int

//Printf -> arredondando o valor altura: %2.2f 