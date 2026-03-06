package ExemploFor2;

import java.util.Scanner;

public class ExemploFor2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		// try é usado para delimitar um bloco de código 
		// que pode gerar exceõesm durante a execução
		try {
			System.out.println("Digite um numero inteiro positivo: ");
			int n = scanner.nextInt();

			if (n <= 0) {
				System.out.println("Por favor, insira um número maior que zero.");
				return;
			}

			// Loop for para imprimir números de 1 até n
			System.out.println("Contando de 1 até " + n + ":");
			for (int i = 1; i <= n; i++) {
				System.out.println(i);
			}

		} catch (Exception n) {
			System.out.println("Entrada inválida. Digite apenas números inteiros.");
			//
			//
			//
		} finally {
			scanner.close();
		}
	}
}
