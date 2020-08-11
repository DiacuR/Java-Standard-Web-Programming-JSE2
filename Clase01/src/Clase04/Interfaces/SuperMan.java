package Clase04.Interfaces;

public class SuperMan extends SuperHeroe implements IAterrizable {

	public SuperMan(String nombre) {
		super(nombre, Boolean.TRUE);
		
	}

	@Override
	public Estado aterrizable() {
		
		System.out.println(this.nombre + " aterrizando");
		
		return new Estado(false, "No hay criptonita");
	}

	@Override
	public String toString() {
		return super.toString() + " SuperMan\n";
	}

	
	
}
