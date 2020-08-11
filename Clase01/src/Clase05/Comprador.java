package Clase05;

public class Comprador {

	private Long id;
	private Float saldo;
	private Integer tipoMoneda = 1;
	
	public Comprador(Long id, Float saldo) {
		
		this.id = id;
		this.saldo = saldo;
	}	
	
	public Integer getTipoMoneda() {
		return tipoMoneda;
	}
	public void setTipoMoneda(Integer tipoMoneda) {
		this.tipoMoneda = tipoMoneda;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Float getSaldo() {
		return saldo;
	}
	public void setSaldo(Float saldo) {
		this.saldo = saldo;
	}
	
	
}
