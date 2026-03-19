package desafio;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número da tabuada que deseja: ");
        int numero = sc.nextInt();

        System.out.println("");
        System.out.println("Tabuada do " +numero+ " ");

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero+ " * " +i+ " = " + (numero * i));
        }

        sc.close();
    }
}