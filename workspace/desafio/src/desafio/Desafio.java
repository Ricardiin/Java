package desafio;

import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {

        double total, desconto, valorcomdesconto, valorpago, troco;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor total: ");
        total = teclado.nextDouble();

        desconto=5;
   
        valorcomdesconto = total - (total * desconto / 100);

        System.out.println("");

        System.out.println("Digite o valor pago: ");
        valorpago = teclado.nextDouble();


        troco = valorpago - valorcomdesconto;
        
        System.out.println("-----------------");
        System.out.println("Preço TOTAL: "+total);
        System.out.println("Valor do Desconto: "+valorcomdesconto);
        System.out.println("Troco: " + troco+"R$");
        System.out.println("-----------------");

        teclado.close();
    }
}