package felino;

public class leao {

	public static void main(String[] args) 
	{
		Felino leao = new Felino();
		leao.idade=5;
		leao.especie="Gato";
		leao.cor="Preto";
		leao.nome="Neguinho";
		leao.peso=50.00;
		
		System.out.println("Nome do gato "+leao.nome);
		System.out.println("Cor do gato "+leao.cor);
		System.out.println("Peso dele é "+leao.peso+"KG");
		System.out.println();
		leao.dormindo();
	}
}
