package AulasPooPolimorfismo;

public class Celular extends Telefone {
	
	//CONSTRUTOR
	public Celular() {
		super("Telefone Celular");
		//super(String tipo) -> this.tipo = "Telefone Celular"
		//passando o parametro 'tipo' direto, pq só existe 1 parametro pra passar
	}
		
	
	//MÉTODOS ABSTRATOS -> Implementação
	@Override	//estou sobrescrevendo o método toca da superClasse e tornando-o num mét. polimórfico				
	public void toca(int codigoToque) { 
		//implementando o toca -> mesmo tipo de parametro int porém outro nome
		
		switch(codigoToque) {
		case 1:
			System.out.println("\nShalamar...shalamar");
			break;
		case 2:
			System.out.println("\nTananinana...tananinana...");
			break;
		default:
			System.out.println("\nTa...tanana...tanananana");
		}
		
	}
	
	@Override 
	public void disca(String numero) {
		System.out.println("\nO número " + numero + "é um celular...");
		
	}
	
}



//@Override -> indico que estou sobrescrevendo um método da minha superClasse, 
//pq a classe toca dessa subclasse Celular está sobrescrevendo a classe toca da superClasse Telefone,
//então pra falar que ela é uma sobrescrita e já torná-la polimórfica, preciso colocar @Override

