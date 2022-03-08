package AulasPooPolimorfismo;

public class TelefoneTeste {

	public static void main(String[] args) {
		
		//INSTANCIANDO OS OBJETOS:
		Celular celular = new Celular();	
		Fixo fixo = new Fixo();	
		Publico publico = new Publico();
		
		Telefone telefone = null;
		//variável Telefone do tipo Telefone que tem valor inicial null 
		//não é um objeto pq uma classe abstrata não pode ser instanciada 

		int num = (int) (Math.random() * 3.0);
		
		System.out.println("\nO número escolhido foi: " + num);
		
		switch(num) {
		case 0: 
			telefone = celular;
			break;		
		case 1: 
			telefone = fixo;
			break;
		case 2: 
			telefone = publico;
			break;
		default: 
			System.out.println("\nErro inesperado!!!");
		}
		
		if(telefone != null) {
			telefone.disca("92324544");
			telefone.toca(2); //numero de vezes que quero q ele toque
		}
		
	}

}



//Math.random -> sistema randômico: pega nums aleatórios
//* 3.0 -> pra ter resultados pra pegar as primeiras 3 casa e numeros inteiros
