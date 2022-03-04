package AulasPooHeranca;

public class Pessoa {
	//ATRIBUTOS da super classe Pessoa
	private String nome;
	private String endereco;
	private String cpf;
	private int telefone;
	private int idade;
	
	//CONSTRUTOR -> classe Funcionario e Operario
	public Pessoa(String nome, String endereco, String cpf, int telefone, int idade) {
		this.nome = nome;
		this.endereco = endereco;
		this.cpf = cpf;
		this.telefone = telefone;
		this.idade = idade;
	}
	
	//CONSTRUTOR -> classe Fornecedor
	public Pessoa(String nome, String endereco, int telefone) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	
	//CONSTRUTOR -> classe Cliente
	public Pessoa(String nome, String endereco, String cpf, int telefone) {
		this.nome = nome;
		this.endereco = endereco;
		this.cpf = cpf;
		this.telefone = telefone;
	}

	//MÉTODOS GET & SET
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	//OUTRO MÉTODO específico da classe Pessoa
	public void validarCpf() {
		if (getCpf().length() != 11) {
			System.out.println("\n----CPF Inválido");
		} else {
			System.out.println("\n----CPF Válido");
		}
	}

}



//Os atributos são do tipo privado e não podem ser instanciados por outra classe
//Por isso, usamos o método construtor da minha própria classe -> passando os 
//parametros pra fazer a inicialização dos meus atributos e manipular esses dados

//classe Pessoa vai ser minha super classe -> a partir dela vou estender outras classes

//.length -> conta a qntidade de caracteres 