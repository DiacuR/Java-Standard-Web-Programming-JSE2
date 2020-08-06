package Clase03;

public class MainClass {

	public static void main(String[] args) {
		
		String tipo = "MP3";
		
		long tamanio = 100L;
		
		String nombre = "file";
		
		Archivo archivo = new Archivo(tipo, tamanio, nombre);
		
		
		System.out.println(archivo);
		
		if(archivo.getTipo().equalsIgnoreCase("MP3")) {
			archivo = Conversor.convertir(archivo);
		}
		
		System.out.println(archivo);
	}

}
