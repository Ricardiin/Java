package contas;

public class Conta {
	//Atributos - Variaveis
	protected String clientes;
	protected double saldo;
	protected String CNPJ;
	
	//Criando um construtor

	public Conta() {
		System.out.println("Agência 0261");
		//cada conta criada vai pertencer a essa agência
		
	}
	//métodos
	protected void exibirSaldo() {
		System.out.println("Saldo: R$ "+saldo);
	}
	public void agencia() {
		System.out.println("Agencia 6542");
	}
}
