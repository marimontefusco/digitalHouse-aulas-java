package AulasPooPolimorfismo;

public class Fixo extends Telefone{
	
	//CONSTRUTOR
	public Fixo() {
		super("Telefone fixo"); //super(String tipo) -> this.tipo = "Telefone Fixo"
	}
	
	
	//MÉTODOS ABSTRATOS -> implementação
	@Override
	public void toca(int numToques) {
		
		for (int i = 0; i < numToques; i++) {
			System.out.println("\nTrimmmmm...trimmmmm");
		}
		
	}
	
	
	@Override
	public void disca(String numero) {
		System.out.println("\nDiscando: " + numero);
	}
	
}



//for -> quero q a partir da quantidade de toques,
//ele toque várias vezes
