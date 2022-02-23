package AulasPooHeranca;

public class OperarioTeste {

	public static void main(String[] args) {
		
		Operario oper = new Operario("Fernando Pereira", "Rua da Marola, 563", 
				"25335663555", 999999978, 42, 1200, 20);
		
		oper.imprimirInfos();
		oper.calcularProducao();
		
		
	}

}
