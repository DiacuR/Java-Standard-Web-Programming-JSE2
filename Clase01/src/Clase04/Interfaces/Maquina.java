package Clase04.Interfaces;

public abstract class Maquina extends Volador implements IAterrizable {

	protected static int contador = 0;
	protected boolean tieneTurbinas;
	
	public Maquina(String nombre, boolean turbinas) {
		super(nombre);
		this.tieneTurbinas = turbinas;
		contador ++;
	}

	public boolean isTieneTurbinas() {
		return tieneTurbinas;
	}

	public void setTieneTurbinas(boolean tieneTurbinas) {
		this.tieneTurbinas = tieneTurbinas;
	}

	@Override
	public String toString() {
		return super.toString() + " Maquina [tieneTurbinas=" + tieneTurbinas + "]";
	}
	
	
}
