package AulasPOO;

public class TesteFuncionario {

	public static void main(String[] args) {

		//criando um vetor do tipo classe:
		Funcionario[] lista = new Funcionario[3];
		
		//pegar através d euma entrada do meu sistema
		lista[0] = new Funcionario("Ana Kélvia", 10000);//passa os parametros
		lista[1] = new Funcionario("Lucas Theberge", 11000);
		lista[2] = new Funcionario("Leticia Toffoli", 30000);
		
		//For Each -> a partir da primeira posiçao até a ultima posiçao
		//chama o objeto lista
		//a partir da classe Funcionario
		//lista é qual objeto eu quero rodar
		
		for(Funcionario roda: lista) {
			roda.imprimir();
		}
		
		System.out.println("****************");
		
		for(Funcionario roda: lista) {
			roda.aumentarSalario(10);//parametro é a var percentual 10%
			roda.imprimir();
		}
		
		System.out.println("****************");
		
		
	}

}
