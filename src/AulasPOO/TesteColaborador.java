package AulasPOO;

public class TesteColaborador {

	public static void main(String[] args) {

		//criar o meu objeto:
		Colaborador colab = new Colaborador("Edu", "Rua da Marola, 386", "35466798036",
				948484848, 22, 360, 20000, 15);
		colab.imprimirInfo();
		colab.calcularSalario();
	}

}
