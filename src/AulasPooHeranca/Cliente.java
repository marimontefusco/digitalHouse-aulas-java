package AulasPooHeranca;

public class Cliente extends Pessoa {
	public Cliente(String nome, String endereco, String cpf, int telefone) {
		super(nome, endereco, cpf, telefone);
	}

	//ATRIBUTOS
	private String nomeDoServico;
	private int formaPagamento;
	private float custo;
	private float porcentLucro;
	
	
	//CONSTRUTOR
	public Cliente (String nome, String endereco, String cpf, int telefone, String nomeDoServico, 
			int formaPagamento, float custo, float porcentLucro) {
		super(nome, endereco, cpf, telefone);
		
		this.nomeDoServico = nomeDoServico;
		this.formaPagamento = formaPagamento;
		this.custo = custo;
		this.porcentLucro = porcentLucro;		
	}
	
	
	//GET & SET
	public String getNomeDoServico() {
		return nomeDoServico;
	}

	public void setNomeDoServico(String nomeDoServico) {
		this.nomeDoServico = nomeDoServico;
	}

	public int getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(int formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public float getCusto() {
		return custo;
	}

	public void setCusto(float custo) {
		this.custo = custo;
	}

	public float getPorcentLucro() {
		return porcentLucro;
	}

	public void setPorcentLucro(float porcentLucro) {
		this.porcentLucro = porcentLucro;
	}
	
	
	//OUTROS MÉTODOS
	public void imprimirInfos() {
		System.out.println("\nNome do Cliente: " + getNome()
		+ "\nEndereço de entrega: " + getEndereco()
		+ "\nCPF: " + getCpf()
		+ "\nTelefone: " + getTelefone()
		+ "\nQual serviço foi realizado? " + nomeDoServico
		+ "\nForma de pagamento:"
		+ "\nDigite 1 para Cartão de Débito"
		+ "\nDigite 2 para Cartão de Crédito (até 3x)"
		+ "\nDigite 3 para PIX (à Vista): \n" + formaPagamento
		+ "\nValor do custo do serviço: " + custo
		+ "\nPorcentagem do lucro (sem o sinal de %): " + porcentLucro);		
	}
	
	public void calcularPreco() {
		double desconto;
		
		if (formaPagamento == 1 || formaPagamento == 3 ) {
			desconto = 5 / 100;
		} else {
			desconto = 0;
		}
		
		double precoFinal = (custo + (porcentLucro / 100)) - desconto;
		System.out.println("O preço do serviço será de: " + precoFinal);
	}
	
}
