package AleatorizarLetras;

import java.util.Random;

public class AleatorizarLetras {
    public static void main(String[] args) {
        Random random = new Random();
        StringBuilder letras = new StringBuilder();
        String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        // Gera 5 letras aleatórias
        for (int i = 0; i < 10; i++) {
            // Sorteia um índice de 0 até o tamanho do alfabeto - 1
            int index = random.nextInt(alfabeto.length());
            // Pega a letra correspondente e adiciona ao StringBuilder
            letras.append(alfabeto.charAt(index));
        }

        System.out.println("5 Letras Aleatórias: " + letras.toString());
    }
}
