package AulasPooHeranca;

public class Operario extends Pessoa {
	//ATRIBUTOS específicos da classe Operario
	private double valorProducao;
	private double comissao;
	
	//COSTRUTOR
	public Operario (String nome, String endereco, String cpf, int telefone, 
			int idade, double valorProducao, double comissao) {
		
		super(nome, endereco, cpf, telefone, idade);
		//atributos da super classe que vou usar na classe Operario
		
		this.valorProducao = valorProducao;
		this.comissao = comissao;
		
	}	
	
	//MÉTODOS GET & SET
	public double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	//OUTROS MÉTODOS
	public void imprimirInfos() {
		System.out.println("\nNome do Operário: " + getNome() 
				+ "\nCPF: " + getCpf() 
				+ "\nEndereço: " + getEndereco()
				+ "\nTelefone: " + getTelefone()
				+ "\nIdade: " + getIdade()
				+ "\nValor monetário dos artigos produzidos: " + valorProducao
				+ "\nPorcentagem da comissão deste artigo (sem o sinal de %): " + comissao );
	}

	public void calcularProducao() {
		double valorTotal = valorProducao + (valorProducao * (comissao / 100));
		System.out.println("\nO valor total a ser recebido pelo operário " + getNome()
		+ " será de " + valorTotal );
	}
			
}



//O método é próprio de cada classe,então não tem problema
//a classe Operario e a classe Fucioario terem o método imprimirInfos().