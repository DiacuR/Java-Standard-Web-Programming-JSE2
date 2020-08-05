package Clase02.Programa02;

public class Resultado {

	private String titulo;
	private String autor;
	private float precio;
	private boolean stock;
	
	public Resultado() {
		this.stock = true;
	}
	
	

	public Resultado(String titulo, String autor, float precio, boolean stock) {
		this.titulo = titulo;
		this.autor = autor;
		this.precio = precio;
		this.stock = stock;
	}



	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public boolean isStock() {
		return stock;
	}

	public void setStock(boolean stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Resultado [titulo=" + titulo + ", autor=" + autor + ", precio=" + precio + ", stock=" + stock + "]";
	}
	
	
}
