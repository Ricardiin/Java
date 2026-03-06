package Felino;

public class Leao {

    public static void main(String[] args) {

        Felino leao = new Felino("Leao", "Branco", 15, 140.00);

        System.out.println("Espécie: " + leao.especie);
        System.out.println("Cor: " + leao.cor);
        System.out.println("Idade: " + leao.idade);
        System.out.println("Peso: " + leao.peso +"Kg");
        leao.correr();
    }
}