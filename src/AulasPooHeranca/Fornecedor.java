package AulasPooHeranca;

public class Fornecedor extends Pessoa{
	//ATRIBUTOS
	private String razaoSocial;
	private String cnpj;
	private double custoMateriaPrima;
	private double frete;
	private float imposto;
	
		
	//CONSTRUTOR
	public Fornecedor (String nome, String endereco, int telefone, String razaoSocial, String cnpj, double custoMateriaPrima, double frete, float imposto) {
	
		super(nome, endereco, telefone);
		//atributos da super classe que vou usar na classe Funcionario
			
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.custoMateriaPrima = custoMateriaPrima;
		this.frete = frete;
		this.imposto = imposto;
			
	}
	
	//MÉTODOS GET & SET
	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public double getCustoMateriaPrima() {
		return custoMateriaPrima;
	}

	public void setCustoMateriaPrima(double custoMateriaPrima) {
		this.custoMateriaPrima = custoMateriaPrima;
	}

	public double getFrete() {
		return frete;
	}

	public void setFrete(double frete) {
		this.frete = frete;
	}

	public float getImposto() {
		return imposto;
	}

	public void setImposto(float imposto) {
		this.imposto = imposto;
	}

	
	//OUTROS MÉTODOS
	public void imprimirInfos() {
		System.out.println("Nome Fantasia do Fornecedor: " + getNome()
				+ "\nRazão Social: " + razaoSocial
				+ "\nCNPJ: " + cnpj
				+ "\nEndereço: " + getEndereco()
				+ "\nTelefone: " + getTelefone()
				+ "\nCusto da matéria prima: " + custoMateriaPrima
				+ "\nPorcentagem do imposto a ser adicionado na matéria prima (sem o sinal de %): " + imposto
				+ "\nValor do frete: "+ frete);
	}
	

	public void calcularMatPrimFinal() {
		double custoFinalMT = custoMateriaPrima + (custoMateriaPrima + (imposto/100) + frete);
		
		System.out.println("O custo final da matéria prima do fornecedor " + getNome()
		+ " foi de " + custoFinalMT);
	}
	
}
