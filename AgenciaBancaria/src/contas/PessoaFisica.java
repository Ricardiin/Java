package contas;

public class PessoaFisica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta cc1 = new Conta();
		cc1.clientes = "Diana Prince";
		cc1.saldo=10000;
		System.out.println("Cliente: "+cc1.clientes);
		cc1.exibirSaldo();
		System.out.println("-----------------------------------");
		Conta cc2 = new Conta();
		cc2.clientes = "Bárbara Gordon";
		cc2.saldo=8000;
		System.out.println("Cliente: "+cc2.clientes);
		cc2.exibirSaldo();
	}

}
