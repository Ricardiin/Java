/**
 * 
 */
package Dados;
import java.util.Scanner;


/**
 * 
 */
public class Dados {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu Capital Inicial");
        double capital = scanner.nextDouble();
        System.out.println("");

        System.out.println("Digite a taxa de juros");
        double taxa = scanner.nextDouble();
        System.out.println("");

        System.out.println("Digite o tempo");
        double tempo = scanner.nextDouble();
        System.out.println("");

        // Cálculo dos juros simples
        double juros = (capital * (taxa / 100) * tempo);

        // Cálculo do montante em juros compostos
        double montante = capital * Math.pow((1 + (taxa / 100)), tempo);

        String js = String.format("%.2f", juros);
        String jc = String.format("%.2f", montante);

        System.out.println("Seu investimento em Juros Simples é de R$ " + js);
        System.out.println("");
        System.out.println("Seu investimento em Juros Compostos é de R$ " + jc);

        scanner.close();
	}

	
}
