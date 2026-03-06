package Aviao;

import Aviao.Latam;

public class Latam {
	public static void main(String[] args) {
		
		Aviao latam = new Aviao();
		latam.ano=1991;
		latam.cor="Branco";
		latam.destino="Brasil";
		latam.placa="LA-GR-HP";
		System.out.println("Destino: "+latam.destino);
		System.out.println("Empresa: LATAM");
		System.out.println("Ano:"+latam.ano);
		System.out.println("Cor:"+latam.cor);
		System.out.println("Placa: " +latam.placa);
		
		latam.decolar();
	}

}
