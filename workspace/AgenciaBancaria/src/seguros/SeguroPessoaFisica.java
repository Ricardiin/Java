package seguros;
import contas.Conta;

public class SeguroPessoaFisica extends Conta{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SeguroPessoaFisica cc3= new SeguroPessoaFisica();
		//cc3.clientes="Oliver Queen";
		cc3.setClientes("Oliver Queen");
		//cc3.saldo=9000;
		cc3.setSaldo(9000);
		//System.out.println("Cliente: "+cc3.clientes);
		System.out.println("Cliente: "+cc3.getClientes());

		cc3.exibirSaldo();
	}

}
