package felino;

public class Felino {
	String especie;
	String cor;
	String nome;
	double peso;
	int idade;
	

	public Felino (String especie, String cor, String nome, int idade, double peso) { 
		this.especie=especie;
		this.cor=cor;
		this.nome=nome;
		this.idade=idade;
		this.peso=peso;
	}

	public Felino() {
		// TODO Auto-generated constructor stub
	}

	void correr() {
		System.out.println("Ele esta correndo");
	}
	void dormindo() {
		System.out.println("Ele esta dormindo");
	}
}
