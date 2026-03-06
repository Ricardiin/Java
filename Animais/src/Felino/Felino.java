package Felino;

public class Felino {
    String especie;
    String cor;
    int idade;
    double peso;

    
    public Felino(String especie, String cor, int idade, double peso) {
        this.especie = especie;
        this.cor = cor;
        this.idade = idade;
        this.peso = peso;
    }

    void correr() {
        System.out.println(especie + " está correndo...");
    }


    void cacar() {
        System.out.println(especie + " está dormindo...");
    }

}