package AulasPOO;

public class Pessoa {
	//Atributos da classe pessoa
	private String nome;
	private String endereco;
	private String cpf;
	private int telefone;
	private int idade;
	
	
	//Construtor:
	public Pessoa (String nome, String endereco, String cpf, int telefone, int idade) {
		//atributo = parametro
		this.nome = nome;
		this.endereco = endereco;
		this.cpf = cpf;
		this.telefone = telefone;
		this.idade = idade;
	}

	
	//Métodos GET & SET:
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
	
	
	//Métodos específico da classe Pessoa:
	public void validaCpf() {
		//validando CPF pela qntidade de caracteres ele tem
		if (getCpf().length() != 11) {
			System.out.println("\n----CPF Inválido");
		} 
		else {
			System.out.println("\n----CPF Válido");
		}
	}
	
	
	
}

//length -> conta qntidade de caracteres do cpf
//minha classe pessoa vai ser minha super classe -> a partir dela vou estender outras classes
