/**
 * 
 */
package auladeelse;

/**
 * 
 */
public class maiormenor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double valorVenda=100.00;
		double comissaopaga;
		String setor = "Telefonia";
		
		if (setor == "Informatica") {
			comissaopaga = valorVenda * 0.05;
			System.out.println("O valor da venda foi de r$"+valorVenda);
			System.out.println("o nome do setor é "+setor);
			System.out.println("O valord a comissão foi de "+comissaopaga);
		} else if (setor =="Radio")
			System.out.println("o vaor da venda de rs"+valorVenda);
		
	}

}
