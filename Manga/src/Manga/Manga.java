package Manga;

public class Manga {
	String capa;
	String idioma;
	int volume;
	int pagina;
	
	
	public Manga (String capa, int volume, int pagina, String idioma){
	this.capa=capa;
	this.idioma=idioma;
	this.volume=volume;
	this.pagina=pagina;
		
	}
	public Manga () {
		
	}
	void CapituloFinal() {
		System.out.println("Você terminou o manga");
	}
	void Começo() {
		System.out.println("Você está no começo");
	}
}
