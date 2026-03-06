package poo;

import java.util.Random;

public class Aviao { // criamos o objeto carro 
	//Criamos os Atributos
	int ano;
	String cor;
	String destino;
	
	// criando um construtor
	public Aviao() {
		Random gerador = new Random();
		int assento= gerador.nextInt(10);
		System.out.println("Assento = "+assento);
	}
	public Aviao (int ano, String cor, String destino) {
		this.ano=ano;
		this.cor=cor;
		this.destino=destino;
		
	}
	
	// Criamos os métodos - as ações
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
