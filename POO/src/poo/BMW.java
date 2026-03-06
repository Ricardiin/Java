package poo;

public class BMW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Inicia chamando a classe Carro
		Carro BMW = new Carro();
		//criamos um objeto chamado Ferrari usando a classe Carro
		BMW.ano=2024;
		BMW.cor="Azul";
		System.out.println("Carro: Ferrari");
		System.out.println("Ano:"+BMW.ano);
		System.out.println("Cor:"+BMW.cor);
		BMW.ligar();
		BMW.acelerar();
		BMW.desligar();
		
	}

}
