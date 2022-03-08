package AulasPooPolimorfismo;

public abstract class Telefone {
	
	//ATRIBUTOS
	private String tipo;

	
	//MÉTODOS ABSTRATOS -> Criacão do modelo de implementação
	abstract public void disca(String numero);
	abstract public void toca(int numToques);
	
	
	//CONSTRUTOR
	public Telefone(String tipo) {
		this.tipo = tipo;
	}

	
	//GET & SET
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}



//classe Telefone vai ser minha superClasse e vai ser ABSTRATA 
//Nela só crio o modelo de implementação, não vou implementar aqui, 
//somente nas subclasses que fizerem herança com essa super classe abstrata 
//e forem polimórficas -> elas q vão implementar

//se criar classe abstrata, tem q implementar