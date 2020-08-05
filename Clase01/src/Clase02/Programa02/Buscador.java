package Clase02.Programa02;

public abstract class Buscador {
	
	protected String clave;
	
	public Buscador(String clave) {
		this.clave = clave;
	}
	
	public abstract Resultado[] buscar();
}
