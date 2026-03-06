package felino;

public class Gato {

	public static void main(String[] args) 
	{
		Felino Gato = new Felino();
		Gato.idade=5;
		Gato.especie="Vira lata";
		Gato.cor="Preto";
		Gato.nome="Neguinho";
		Gato.peso=10.0;
		
		System.out.println("*** Informaçoes ***");
		System.out.println("");
		System.out.println("Especie dele é "+Gato.especie);
		System.out.println("Nome do gato "+Gato.nome);
		System.out.println("Cor do gato "+Gato.cor);
		System.out.println("Peso do gato é "+Gato.peso+"Kg");
		System.out.println();
		Gato.dormindo();
	}
}
