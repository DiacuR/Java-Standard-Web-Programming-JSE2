package Clase05;

public class MedioDePago {

	private Long id;
	
	private String nombre;
	
	private Integer moneda; 	//1 == peso && 2 == dolar

	public MedioDePago(Long id, String nombre, Integer moneda) {
		
		this.id = id;
		this.nombre = nombre;
		this.moneda = moneda;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getMoneda() {
		return moneda;
	}

	public void setMoneda(Integer moneda) {
		this.moneda = moneda;
	}
	
	
	
	
}
