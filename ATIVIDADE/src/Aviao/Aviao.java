package Aviao;

import java.util.Random;

public class Aviao { // criamos o objeto carro 
	int ano;
	String cor;
	String destino;
	String placa;
	
	
	public Aviao() {
		Random gerador = new Random();
		int assento= gerador.nextInt(10) + 1;
		System.out.println("Assento = "+assento);
	}
	public Aviao (int ano, String cor, String destino, String placa) {
		this.ano=ano;
		this.cor=cor;
		this.destino=destino;
		this.placa = placa;
		
	}
	

	void decolar() {
		System.out.println("O Avião decolou ...");
	}
	void pouso() {
		System.out.println("O Avião pousou...");
	}
	void explodio () {
		System.out.println("O Avião explodiu...");
	}

}
