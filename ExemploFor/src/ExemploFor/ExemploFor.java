package ExemploFor;

public class ExemploFor {
	public static void main(String[] args) {
		
		// Inicialização -> int i = 1 (executa apenas no inicio)
		// Condição -> i <=5 (Enquanto for verdadeiro, o loop continua)
		// Incremento -> i++ (Executa ao final de cada iteração)

		
		// Contar de 1 até 5
		System.out.println("");
		System.out.println("***Contagem***");
		System.out.println("");
		for (int i = 1; i <= 5; i++) {
			System.out.println("Numero: " + i);
		}
		System.out.println("");
		System.out.println("*****Regressiva*****");
		System.out.println("");
		for (int j = 10; j >= 1; j--) {
			System.out.println("Contagem: " + j);
		}
		System.out.println("");
		System.out.println("****Nome****");
		System.out.println("");
		String[] nome = {"André", "Bruna", "Carla"};
		
		for (int k = 0; k < nome.length; k++) {
			System.out.println("Nome: " + nome[k]);
		}
	}
}
