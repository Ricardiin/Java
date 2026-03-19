package desafio;

import java.util.Scanner;

public class exerciciofour {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double remuneracao;
        double custo;
        double carga;

        System.out.print("Digite a remuneração mensal: ");
        remuneracao = teclado.nextDouble();

        System.out.print("Digite o custo operacional mensal: ");
        custo = teclado.nextDouble();

        System.out.print("Digite a carga horária mensal: ");
        carga = teclado.nextDouble();


        double impostos = remuneracao * 0.30;
        double investimentos = remuneracao * 0.20;

        double valorHora = (remuneracao + impostos + custo + investimentos) / carga;


        System.out.println("\n----- RESULTADO -----");
        System.out.println("Impostos: R$ " + impostos);
        System.out.println("Investimentos: R$ " + investimentos);
        System.out.println("Valor da hora do serviço: R$ " + valorHora);

        teclado.close();
    }
}