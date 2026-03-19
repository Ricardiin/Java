package desafio;

import java.util.Random;
import java.util.Scanner;

public class Jogo {

	public static void main(String[] args) {
		Scanner jogo = new Scanner(System.in);
		Random aleatorio = new Random();
		
		int jogador, computador;
		
		System.out.println("Escolha Entre:");
		System.out.println("");
		System.out.println("1 - Pedra✊");
		System.out.println("2 - Papel✋ ");
		System.out.println("3 - Tesoura✌️ ");
		
		jogador = jogo.nextInt();
		
		computador = aleatorio.nextInt(3)+1;
		
		System.out.println("O computador escolheu "+computador);
		{
		if (jogador == computador) {
		System.out.println("Empate!");
		} else if (
		(jogador == 1 && computador == 3) ||
		(jogador == 2 && computador == 1) ||
		(jogador == 3 && computador == 2)
		) {
		System.out.println("Você ganhou!");
		} else {
		System.out.println("Você perdeu!");
		}		        
		jogo.close();
		}
	}
}
