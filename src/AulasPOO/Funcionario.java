package AulasPOO;

import java.text.NumberFormat;

public class Funcionario {
	//ATRIBUTOS da classe Funcionario
	private String nome;
	private double salario;
	
	
	//CONSTRUTOR -> mesmo nome da classe
	public Funcionario(String nome, double salario) {
		this.setNome(nome);
		this.setSalario(salario);
		//this.nome = nome
		//this.salario = salario
		//ao inves de chamar o atributo como o ex acima, dessa vez estou 
		//chamando o parâmetro através do setNome(modificador)-> vai inserir um dado dentro do meu atributo
	}

	
	//Métodos GET & SET
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
	
	
	//Método próprio -> aumentar salário com percentual
	public void aumentarSalario(double percentualAumento) {
		salario *= 1 + percentualAumento / 100; 
		//fórmula pra encontrar o salario já acrescido do percentual de aumento
	}
	
	
	//Método próprio -> formatar salário
	public String formatarMoeda(){
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		//nf é uma variável, nao é um objeto pq não foi instanciado
		
		nf.setMinimumFractionDigits(2);
		
		String formatoMoeda =  nf.format(salario);
		return formatoMoeda;
		//
	}
	
	
	//Método próprio -> imprimir resultado
	public void imprimir() {
		System.out.println(nome + " \t\t\t "+ "Salário: " + this.formatarMoeda());
	}
	
	
}

//formatarMoeda() -> formata um valor para tipo monetário -> 000.000,00
//getCurrencyInstance() -> método q pega a moeda do seu pais
//setMinimumFractionDigits(2) -> formata casas decimais após a vírgula para (2)

// this.formatarMoeda() -> chamando um método da minha própria classe
//this pq to me referindo à um método da minha própria classe
