package Clase04.Interfaces;

public abstract class Volador {
	
	protected String nombre;
	
	public Volador(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Volador [nombre=" + nombre + "]";
	}
	
	
	
}
