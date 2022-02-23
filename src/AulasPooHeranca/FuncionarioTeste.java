package AulasPooHeranca;

public class FuncionarioTeste {

	public static void main(String[] args) {

		Funcionario func = new Funcionario("Joaquina Maria de Jequié", "Rua das Matas, 756",	
				"35678678630", 999999999, 29, 223, 20000, 15);
		func.imprimirInfos();
		func.calcularSalario();
	}

}
