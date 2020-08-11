package Clase05;

import java.util.Arrays;

public class Orden {

	private Long id;
	private Comprador comprador;
	private MedioDePago mp;
	private Item[] items;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Orden(Comprador comprador, MedioDePago mp) {
	
		this.comprador = comprador;
		this.mp = mp;
	}

	public void setComprador(Comprador comprador) {
		this.comprador = comprador;
	}

	public void setMedioDePago(MedioDePago mp) {
		this.mp = mp;
	}

	public MedioDePago getMp() {
		return mp;
	}

	public void setMp(MedioDePago mp) {
		this.mp = mp;
	}

	public Comprador getComprador() {
		return comprador;
	}

	public void setItems(Item[] items) {
		this.items= items;
	}

	public Item[] getItems() {
		return items;
	}
	
	@Override
	public String toString() {
		return "Orden [comprador=" + comprador + ", mp=" + mp + ", items=" + Arrays.toString(items) + "]";
	}
	
}
