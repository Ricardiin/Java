package desafio;

import java.util.Scanner;

public class Combustivel {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o preço da Gasolina: ");
        double gasolina = sc.nextDouble();

        System.out.print("Digite o preço do Alcool: ");
        double alcool = sc.nextDouble();


        double limite = gasolina * 0.70;

        if (alcool <= limite) {
            System.out.println("O Alcool é mais vantajoso para abastecer.");
        } else {
            System.out.println("A Gasolina é mais vantajosa para abastecer.");
        }

        sc.close();
    }
}