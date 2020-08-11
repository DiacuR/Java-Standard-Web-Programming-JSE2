package Clase04.Interfaces;

public class Avion extends Maquina {

	public Avion(String nombre) {
		super(nombre, Boolean.TRUE);
	}

	@Override
	public Estado aterrizable() {
		
		System.out.println(this.nombre + " aterrizando");
		
		//Verificar
		boolean error = Maquina.contador % 2 == 0;
		
		return new Estado(error, "Todo Bien");
	}

	@Override
	public String toString() {
		return super.toString() + " Avion\n";
	}
	
	
	
}
