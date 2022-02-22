package AulasPOO;

public class Operario extends Pessoa {
	private double valorProducao;
	private double comissao;
	
	//Construtor:
	//indicar de onde vem as infos nome, endereco, cpf, telefone e idade 
		public Operario(String nome, String endereco, String cpf, int telefone, 
				int idade, double valorProducao, double comissao) {
			super(nome, endereco, cpf, telefone, idade);
			this.valorProducao = valorProducao;
			this.comissao = comissao;
		}

		//GET e SET
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
		
	
		//Métodos específico da minha classe:
		public void imprimirInfo() {
			System.out.println("\nNome do Operario: " + getNome() + "\nCPF: "
			+ getCpf() + "\nIdade: " + getIdade() + "\nTelefone: " + getTelefone() 
			+ "\nEndereço: " + getEndereco() + ". \nValor monetário dos artigos produzidos: "
			+ valorProducao + "\nPorcentagem(sem o %) da comissão deste artigo: "+ comissao);
		}
		
		public void calcularProducao() {
			double valorTotal = valorProducao + (valorProducao * (comissao/100));
			System.out.println("\nO valor todal a ser recebido pelo operário "
			+ getNome()+ " será de: " + valorTotal);
		}
	
}
//o metodo é proprio de cada classe,entao nao tem problema
//a classe Operario e a classe Colaborador terem o método imprimirInfo().