package AulasPOO;

public class TesteAutomovel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//instanciando um objeto da classe Automovel
		Automovel auto = new Automovel("Rejane Santos", "Celta", "RSA2J34", 2015);
		
		auto.imprimirInfo();
		System.out.println("\n\n**************************************");
		System.out.println("\n*** Transferência de Proprietário");
		auto.setNomeProprietario("\nEmily Pellini");
		System.out.println("\n\n**************************************");
		auto.imprimirInfo();
	}

}

//REGRA: toda classe tem q ter ao menos 1 CONSTRUTOR