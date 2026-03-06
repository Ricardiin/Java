package Nota;
import java.util.Scanner;

public class nota {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nomeHospede;
        int diarias;
        int tipoQuarto;
        int opcaoExtra;
        
        double valorDiaria = 0;
        double valorExtras = 0;
        double total;

        System.out.println("----* Hotel HeartHome *----");

        System.out.print("Informe o nome do hóspede: ");
        nomeHospede = scanner.nextLine();

        System.out.print("Existe quarto disponível? (1-Sim / 2-Não): ");
        int disponibilidade = scanner.nextInt();

        if (disponibilidade == 1) {

            System.out.println("\nTipos de quarto:");
            System.out.println("1 - Standard - R$150,00");
            System.out.println("2 - Superior - R$180,00");
            System.out.println("3 - Familia - R$200,00");
            System.out.println("4 - Luxo - R$250,00");
            System.out.println("5 - Master - R$450,00");

            System.out.print("Escolha o tipo de quarto: ");
            int tipoQuarto = scanner.nextInt();

            double valorDiaria = 0;

            switch (tipoQuarto) {
                case 1: valorDiaria = 150; break;
                case 2: valorDiaria = 180; break;
                case 3: valorDiaria = 200; break;
                case 4: valorDiaria = 250; break;
                case 5: valorDiaria = 450; break;
                default:
                    System.out.println("Opção inválida!");
                    return;
            }

            // //  
            
            System.out.println("\nServiços extras:");
            System.out.println("1 - Serviço de Beleza - R$180,00");
            System.out.println("2 - Aluguel de Carro - R$80,00");
            System.out.println("3 - Mesa VIP Restaurante - R$220,00");
            System.out.println("0 - Nenhum");

            // //
            
            System.out.print("Escolha um serviço: ");
            int servico = scanner.nextInt();

            double valorServico = 0;

            switch (servico) {
                case 1: valorServico = 180; break;
                case 2: valorServico = 80; break;
                case 3: valorServico = 220; break;
                case 0: valorServico = 0; break;
                default:
                    System.out.println("Serviço inválido!");
                    return;
            }

            total = (valorDiaria * diarias) + valorExtras;

            System.out.println("\n===== RESERVA CONFIRMADA =====");
            System.out.println("Hóspede: " + nomeHospede);
            System.out.println("Quantidade de diárias: " + diarias);
            System.out.println("Valor total das diárias: R$ " + (valorDiaria * diarias));
            System.out.println("Valor dos serviços extras: R$ " + valorExtras);
            System.out.println("VALOR TOTAL A PAGAR: R$ " + total);

        } else {
            System.out.println("Desculpe, não há quartos disponíveis no momento.");
        }
            // //
            
        

        scanner.close();
    }
}