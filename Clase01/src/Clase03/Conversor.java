package Clase03;

public final class Conversor {

	
	public static Archivo convertir(Archivo source) {
		
		//Alguna libreria que conviertas
		return new TXT(source.getNombre(),source.getTamanio());
	}
}
