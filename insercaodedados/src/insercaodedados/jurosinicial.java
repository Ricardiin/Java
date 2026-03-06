/**
 * 
 */
package insercaodedados;
import java.util.Scanner;

/**
 * 
 */
public class jurosinicial {

	/**
	 * @param args
	 */
		public static void main(String[] args) {

			double base=2;
			double expoente = 2;
			
			double resultado = Math.pow(2, 2);
			Scanner scanner=new Scanner(System.in);

		        System.out.print("Digite a capital: ");
		        double capital = scanner.nextDouble();

		        System.out.print("Digite a taxa ");
		        double taxa = scanner.nextDouble();

		        System.out.print("Tempo ");
		        double tempo = scanner.nextDouble();

		        // fórmula: M = C * (1 + i)^t
		        double montante = capital * Math.pow(1 + taxa, tempo);

		        System.out.println("Montante final (M): " + montante);
		        System.out.println("Total de juros: " + (montante - capital));

		        scanner.close();
	}

}
