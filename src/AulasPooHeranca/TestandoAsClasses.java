package AulasPooHeranca;

public class TestandoAsClasses {

	public static void main(String[] args) {
		//Teste Classe Funcionario
		Funcionario func = new Funcionario("Joaquina Maria de Jequié", "Rua das Matas, 756",	
				"35678678630", 999999999, 29, 223, 20000, 15);
		func.imprimirInfos();
		func.calcularSalario();
		
		System.out.println("\n\n***********************\n");
		
		
		//Teste Classe Operario
		Operario oper = new Operario("Fernando Pereira", "Rua da Marola, 563", 
				"25335663555", 999999978, 42, 1200, 20);
		
		oper.imprimirInfos();
		oper.calcularProducao();
		
		System.out.println("\n\n***********************\n");
		
		
		//Teste Classe Fornecedor
		Fornecedor forn = new Fornecedor("Parigi Tecidos Finos", "Rua 15 de Dezembro, 1931", 972727272, 
				"P e B Tecidos Finos LTDA", "03.663.663/0001-36", 360.60, 14.90, 10);
		forn.imprimirInfos();
		forn.calcularMatPrimFinal();

		System.out.println("\n\n***********************\n");
	
		
		//Teste Classe Cliente
		Cliente cli = new Cliente("Dayane Cruz", "Rua Tibiriça, 500", "35135135135", 948484848, "Cortina Sob Medida", 1, 300, 20 );
		
		cli.imprimirInfos();
		cli.calcularPreco();
		
		System.out.println("\n\n***********************\n");
		
	}

}
