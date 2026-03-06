package poo;

public class Latam {
	public static void main(String[] args) {
		//Inicia chamando a classe Carro
		Aviao latam = new Aviao();
		//criamos um objeto chamado Ferrari usando a classe Carro
		latam.ano=1991;
		latam.cor="Branco";
		System.out.println("Empresa: LATAM");
		System.out.println("Ano:"+latam.ano);
		System.out.println("Cor:"+latam.cor);
		latam.decolar();
	}

}
