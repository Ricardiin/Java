package poo;

public class uno {

	public static void main(String[] args) {
		//Inicia chamando a classe Carro
		Carro uno = new Carro();
		//criamos um objeto chamado Ferrari usando a classe Carro
		uno.ano=1991;
		uno.cor="Branco";
		System.out.println("Carro: Uno");
		System.out.println("Ano:"+uno.ano);
		System.out.println("Cor:"+uno.cor);
		uno.ligar();
	}

}
