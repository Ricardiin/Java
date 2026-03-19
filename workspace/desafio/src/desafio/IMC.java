package desafio;

import java.util.Scanner;

public class IMC {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu peso (kg): ");
        double peso = entrada.nextDouble();

        System.out.print("Digite sua altura (m): ");
        double altura = entrada.nextDouble();

        double imc = peso / (altura * altura);
        

        System.out.printf("Seu IMC é: %.2f%n", imc);

        if (imc < 18.5) {
            System.out.println("Classificação: Abaixo do peso");
        } 
        else if (imc < 25) {
            System.out.println("Classificação: Peso normal");
        } 
        else if (imc < 30) {
            System.out.println("Classificação: Sobrepeso");
        } 
        else {
            System.out.println("Classificação: Obesidade");
        }
        
        

        entrada.close();
    }
}
