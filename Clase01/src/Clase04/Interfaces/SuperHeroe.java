package Clase04.Interfaces;

public class SuperHeroe extends Volador{

	protected boolean tieneCapa;

	public SuperHeroe(String nombre, Boolean tieneCapa) {
		super(nombre);
		this.tieneCapa = tieneCapa;
	}

	public boolean isTieneCapa() {
		return tieneCapa;
	}

	public void setTieneCapa(boolean tieneCapa) {
		this.tieneCapa = tieneCapa;
	}

	@Override
	public String toString() {
		return super.toString() + " SuperHeroe [tieneCapa=" + tieneCapa + "]";
	}	
	
	
}
