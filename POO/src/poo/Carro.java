package poo;

import java.util.Random;

public class Carro { // criamos o objeto carro 
	//Criamos os Atributos
	int ano;
	String cor;
	
	// criando um construtor
	public Carro() {
		Random gerador = new Random();
		int Chassi= gerador.nextInt(1000);
		System.out.println("Chassi = "+Chassi);
	}
	public Carro (int ano, String cor) {
		this.ano=ano;
		this.cor=cor;
	}
	
	// Criamos os métodos - as ações
	void ligar() {
		System.out.println("engine ON ...");
	}
	void desligar() {
		System.out.println("engine OFF...");
	}
	void acelerar () {
		System.out.println("VRUMMMMMMM...");
	}
}
