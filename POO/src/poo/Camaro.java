package poo;

public class Camaro {
	public static void main(String[] args) {
		//Inicia chamando a classe Carro
		Carro camaro = new Carro();
		//criamos um objeto chamado Ferrari usando a classe Carro
		camaro.ano=1968;
		camaro.cor="Ao";
		System.out.println("Carro: Camaro");
		System.out.println("Ano:"+camaro.ano);
		System.out.println("Cor:"+camaro.cor);
		camaro.ligar();
		camaro.acelerar();
		camaro.desligar();
}
}