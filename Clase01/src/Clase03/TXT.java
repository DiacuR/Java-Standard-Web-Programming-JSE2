package Clase03;

public class TXT extends Archivo {
	public TXT() {
		this.tipo = "TXT";
	}
	
	public TXT(String nombre, long tamanio) {
		setTipo("TXT");
		setNombre(nombre);
		setTamanio(tamanio);
	}
}
