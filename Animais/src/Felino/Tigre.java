package Felino;

public class Tigre {
    public static void main(String[] args) {

    Felino tigre = new Felino("tigre", "Branco", 15, 190.00);


    System.out.println("Espécie: " + tigre.especie);
    System.out.println("Cor: " + tigre.cor);
    System.out.println("Idade: " + tigre.idade);
    System.out.println("Peso: " + tigre.peso);
    tigre.cacar();

}

}