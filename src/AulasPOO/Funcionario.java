package AulasPOO;

import java.text.NumberFormat;

public class Funcionario {
	//Criação dos atributos
	private String nome;
	private double salario;
	
	//Construtor: mesmo nome da classe
	public Funcionario(String nome, double salario) {
		this.setNome(nome);
		this.setSalario(salario);
		//this.nome = nome
		//this.salario = salario
		//ao inves de chamar o atributo como o ex acima, dessa vez estou 
		//chamando o parâmetro através do setNome(modificador)-> vai inserir um dado dentro do meu atributo
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	//Criacáo d eum método meu:
	public void aumentarSalario(double percentualAumento) {
		salario *= 1 + percentualAumento / 100; //formula pra encontrar o salario já acrescido do percentual de aumento
	}
	
	public String formatarMoeda(){
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		//coloca a moeda do país
		//nf é uma variavel, nao é um objeto pq nao foi instanciado
		//getCurrencyInstance() -> metodo q pega a moeda do seu pais
		
		nf.setMinimumFractionDigits(2);
		//indica a qntidade de casas depois da virgula
		
		//criar var String
		String formatoMoeda =  nf.format(salario);
		return formatoMoeda;
		//formata um valor para uma formatação monetária ->> salario, o atributo salario
		//0.000,00
	}
	
	public void imprimir() {
		System.out.println(nome + " \t\t\t "+ "Salário: " + this.formatarMoeda());
	}
	//chamando um método da minha própria classe
	//this pq to me referindo a um metodo da minha propria classe
	
	
}
