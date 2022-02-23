package AulasPooHeranca;

import java.text.NumberFormat;

public class Funcionario extends Pessoa {
	//ATRIBUTOS expecíficos da classe  Funcionario
	private int codigoSetor;
	private float salarioBase;
	private float imposto;
	
	//CONSTRUTOR
	public Funcionario (String nome, String endereco, String cpf, int telefone, 
			int idade, int codigoSetor, float salarioBase, float imposto) {
		
		super(nome, endereco, cpf, telefone, idade);
		//atributos da super classe que vou usar na classe Funcionario
		
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;	
	}
	
	//MÉTODOS GET & SET
	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public float getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}

	public float getImposto() {
		return imposto;
	}

	public void setImposto(float imposto) {
		this.imposto = imposto;
	}
	
	//OUTROS MÉTODOS específicos da classe Funcionario
	public void imprimirInfos() {
		System.out.println("\nNome do Funcionário: " + getNome() 
				+ "\nCPF: " + getCpf() 
				+ "\nEndereço: " + getEndereco()
				+ "\nTelefone: " + getTelefone()
				+ "\nIdade: " + getIdade()
				+ "\nCódigo do Setor: " + codigoSetor 
				+ "\nSalário Base: " + salarioBase 
				+ "\nPorcentagem do imposto a ser retido do salário (sem o sinal de %): " + imposto
				);
	}
	
	public void calcularSalario() {
		double salarioLiquido = salarioBase - (salarioBase * (imposto/100));
		System.out.println("\nO salário total a ser recebido pelo funcionário " + getNome()
		+ " será de " + salarioLiquido);
		
	}	
	
}


//tentando aplicar o formatar moeda do salario
//public void calcularSalario(double salarioBase ) {
//	double salarioLiquido = salarioBase - (salarioBase * (imposto/100));
//	return salarioLiquido;
//	
//}	
//
//public String formatarSalario(salarioLiquido) {
//	NumberFormat nf = NumberFormat.getCurrencyInstance();
//	
//	nf.setMinimumFractionDigits(2);
//	
//	String salarioLiqFormatado =  nf.format(salarioLiquido);
//	return salarioLiqFormatado;
//}
//
//public void imprimirSalarioFinal() {
//	System.out.println("\nO salário total a ser recebido pelo funcionário " + getNome()
//	+ " será de " + this.formatarSalario());
//}
