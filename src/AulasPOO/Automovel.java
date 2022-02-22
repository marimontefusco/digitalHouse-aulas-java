package AulasPOO;

public class Automovel {
	
	//Declaraçao dos atributos/caracteristicas da classe Automovel
	//modificador tipoDado nomeAtributo
	private String nomeProprietario;
	private String modelo;
	private String placa;
	private int ano;
	
	
	//Criação do método especial CONSTRUTOR: (parametro)
	public Automovel(String nomeProprietario, String modelo, String placa, int ano) {
		//super(); -> não é obrigatorio, só indicativo q essa é minha super classe
		this.nomeProprietario = nomeProprietario;
		this.modelo = modelo; //this é meu proprio atributo -> o segundo é o parametro q vaio inicializar o atributo
		this.placa = placa;
		this.ano = ano;	
	}

	
	//Criação dos métodos da classe:
	public String getNomeProprietario() {
		return nomeProprietario;
	}

	public void setNomeProprietario(String nomeProprietario) {
		this.nomeProprietario = nomeProprietario;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	
	//Criação de um método meu próprio, não get e nao set vai imprimir 
	//todas as infos do meu Automovel
	public void imprimirInfo() {
		System.out.println(nomeProprietario + " possui um(a) " + modelo +
				" com placa " + placa + " e ano: " + ano + ".");
	}
	
}

//get -> método de acesso -> acessar, pegar
//set -> método modificador -> alterar
//private - >> nenhuma outra classe tem acesso à ele, por isso preciso dos métodos get e set
//só condiz à minha classse e não à outras classes
//quem altera qq situaçao do meu atributo private são os métodos da minha classe (pq eles são private)
//garante encapsulamento das informações e segurança tb

//public -> qq classe pode acessar e manipular os dados
//super indica q sao atributos da minha super classe -> ela q cria as heranças da minha classe

//void -> sem retorno, só executa