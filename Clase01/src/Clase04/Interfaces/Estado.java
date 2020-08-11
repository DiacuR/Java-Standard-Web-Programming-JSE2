package Clase04.Interfaces;

public class Estado {
	private boolean error;
	
	private String mensaje;

	public Estado(boolean error, String mensaje) {
		this.error = error;
		this.mensaje = mensaje;
	}

	public boolean isError() {
		return error;
	}

	public void setError(boolean error) {
		this.error = error;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	@Override
	public String toString() {
		return "Estado [error=" + error + ", mensaje=" + mensaje + "]";
	}
	
	
	
	
}
