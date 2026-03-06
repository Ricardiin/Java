/**
 * 
 */
package insercaodedados;
import java.util.Scanner;




public class LeituraTeclado {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		//Scanner: é uma classe da biblioteca padrão do Java e é usada para ler dados de entrada
		//(Como números,textos,etc..)
		
		//scanner:é o nome da variável que estamos criando
		//que vai armazenar o objeto responsável pela leitura.
		
		//newScanner(System.in): Cria um novo objeto que vai ler os dados
		//a partir da entrada padrão do sistema ou seja, o Teclado.
		
		//Lendo um número inteiro
		System.out.println("Digite um número inteiro");
		int numero=scanner.nextInt();

		
		
		//Limpando o buffer antes de ler uma String
		System.out.println("Digite o seu nome");
		String nome=scanner.next();
		
		System.out.println("Número digitado: "+numero);
		System.out.println("Nome digitado: "+nome);
		scanner.close();
		
		//Sempre limpe o buffer com o nextLine() após usar os métodos
		//como nextInt() ou nextDouble()

	}

}
