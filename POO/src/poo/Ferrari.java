package poo;

public class Ferrari {

	public static void main(String[] args) {
		//Inicia chamando a classe Carro
		Carro ferrari = new Carro();
		//criamos um objeto chamado Ferrari usando a classe Carro
		ferrari.ano=2022;
		ferrari.cor="Vermelha";
		System.out.println("Carro: Ferrari");
		System.out.println("Ano:"+ferrari.ano);
		System.out.println("Cor:"+ferrari.cor);
		ferrari.ligar();
		ferrari.acelerar();
		ferrari.desligar();
		
	}

}
