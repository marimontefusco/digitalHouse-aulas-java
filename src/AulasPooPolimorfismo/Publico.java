package AulasPooPolimorfismo;

public class Publico  extends Telefone {
	
	//CONSTRUTOR
	public Publico() {
		super("Telefone público");
	}
	
	
	//MÉTODOS ABSTRATOS -> Implementação
	@Override
	public void toca(int numeroToques) {
		
		for (int i = 0; i < numeroToques; i++) {
			System.out.println("\nTrimtrimtrim...trimtrimtrim");
		}
		
	}
	
	
	@Override
	public void disca(String numero) {

		if(numero.charAt(0) == '9' || numero.charAt(0) == '8') {
			System.out.println("\n\"\\nEste telefone público não faz chamadas para celular!!");
		}
		else {
			System.out.println("\nDiscando: " + numero);
		}
			
	}
	
}

	
//.charAt -> Character At (Position) -> se o primeiro numero for 9 ou 8