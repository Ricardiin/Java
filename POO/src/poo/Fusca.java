package poo;

public class Fusca {
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	//Inicia chamando a classe Carro
	Carro fusca = new Carro();
	//criamos um objeto chamado Ferrari usando a classe Carro
	fusca.ano=1968;
	fusca.cor="Ao";
	System.out.println("Carro: Fusca");
	System.out.println("Ano:"+fusca.ano);
	System.out.println("Cor:"+fusca.cor);
	fusca.ligar();
	fusca.acelerar();
	fusca.desligar();
}

}
