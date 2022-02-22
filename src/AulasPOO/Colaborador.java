package AulasPOO;

//Colaborador é uma herança da minha superclasse pessoa -> extends
public class Colaborador extends Pessoa {
	 
	//Atributos do meu Colaborador -> esses atributos são do Colaborador, não da Pessoa
	private int codigoSetor;
	private float salarioBase;
	private float imposto;
	
	//indicar de onde vem as infos nome, endereco, cpf, telefone e idade 
	public Colaborador(String nome, String endereco, String cpf, int telefone, 
			int idade, int codigoSetor, float salarioBase, float imposto) {
		
		//indicar de onde vem as infos nome, endereco, cpf, telefone e idade 
		//td o q for da superclasse tem q ser colocado dentro como parametro: 
		super(nome, endereco, cpf, telefone, idade);
		
		//inicializar os próprios atributos dessa minha subclasse
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;		
	}
	
	
	//Métodos Get e SET
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
	
	//Métodos específico da minha classe:
	public void imprimirInfo() {
		System.out.println("\nNome do Colaborador: " + getNome() + "\nCPF: "
		+ getCpf() + "\nIdade: " + getIdade() + "\nTelefone: " + getTelefone() 
		+ "\nEndereço: " + getEndereco() + "\nCódigo do Setor: " + codigoSetor 
		+ "\nSalário base: " + salarioBase+ "\nValor em porcentagem (sem o %)"
		+ " de imposto a ser retido do salário.");
	}
	
	public void calcularSalario() {
		double salarioLiquido = salarioBase - (salarioBase * (imposto/100));
	System.out.println("Salário total a ser recebido pelo Colaborador: " + getNome() 
			+ " é igual a: "+ salarioLiquido);
	}
	
	
}
