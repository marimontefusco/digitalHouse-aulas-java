package AulasPooExceptions;

public class Excecao1 {

	public static void main(String[] args) {
		
		String frase = null;
		String novaFrase = null;
		
		try {
			novaFrase = frase.toUpperCase();
		} catch (NullPointerException e) {
			System.out.println("\nA frase inicial está nula, para solucionar tal"
					+ " problema foi lhe atribuido um valor default...");
			frase = "Agora tem algo aqui";
			novaFrase = frase.toUpperCase();
		}
		System.out.println("\nFrase antiga: " + frase);
		System.out.println("\nNova frase: " + novaFrase);
	}
	
}



//try catch -> é um TRATAMENTO DE ERROS/EXCEÇÃO que possivelmente podem ocorrer no sistema.
//usar em todas as situações que podem acontecer com determinado erro

//ex: tentei colocar uma frase em maiúsculo mas essa frase está vazia -> impossível transformá-la 
//em maiúsculo se a frase não existe.
//ex2: Tente conectar nesse banco de dados/nessa url...se esse banco não responder/tiver fora do ar, 
//faz o tratamento e informa pro usuário q o banco de dados não tá acessivel, não pode ser acessado.

//NullPointerException -> exceção que indica que o sistema tentou usar uma referência de um objeto 
//que estava com valor nulo.
