package Manga;

public class Berserk {

	public static void main(String[] args) 
	{
	Manga berserk = new Manga();
	berserk.capa="Berserk";
	berserk.idioma="Japones";
	berserk.pagina=108;
	berserk.volume=27;
	
	System.out.println("O nome do manga é "+berserk.capa);
	System.out.println("O idioma original do manga é "+berserk.idioma);
	System.out.println("A pagina que o Leitor está é "+berserk.pagina);
	System.out.println("O Volume atual da edição é "+berserk.volume);
	System.out.println("");
	berserk.CapituloFinal();
	}

}
