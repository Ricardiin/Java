package Aviao;

import Aviao.Azul;

public class Azul {
	public static void main(String[] args) {
		
		Aviao azul = new Aviao();
		azul.ano=2009;
		azul.cor="Vermelho";
		azul.destino="Portugal";
		azul.placa="BR-PL-PP";
		System.out.println("Destino: "+azul.destino);
		System.out.println("Empresa: Azul");
		System.out.println("Ano:"+azul.ano);
		System.out.println("Cor:"+azul.cor);
		System.out.println("Placa: " +azul.placa);
		
		azul.pouso();
	}
}