package Clase05;

import java.util.Arrays;

import Clase05.Exception.SaldoInsuficienteException;

public class GeneradorDeOrden {
	
	private Comprador comprador;
	
	private Item[] items;
	
	
	
	public GeneradorDeOrden(Comprador comprador) {
		this.comprador = comprador;
	}

	public Orden comprar(MedioDePago mp) throws SaldoInsuficienteException, MedioDePagoException {
	
		float montoCompra = 0f;
		
		for (Item i : items) {
			montoCompra += i.getPrecio();
		}
		
		if(montoCompra > this.comprador.getSaldo() || this.comprador.getSaldo() == 0) {
			throw new SaldoInsuficienteException("El comprador " + this.comprador.getId() + " no posee saldo suficiente",null);
		}
		
		if(mp.getMoneda().equals(comprador.getTipoMoneda())) {
			
			throw new MedioDePagoException("El medio de pago del comprador no coincide con el del Medio de pago seleccionado");
		}
		
		return createOrden(mp);
	}

	private Orden createOrden(MedioDePago mp) {
		Orden orden;
		orden = new Orden(this.comprador,mp);
		orden.setItems(items);
		orden.setId(1L);
		
		//Logica de grabado en DB
			//Va a reducir el saldo al comprador, reducir el stock 
		
		return orden;
	}

	public Comprador getComprador() {
		return comprador;
	}

	public void setComprador(Comprador comprador) {
		this.comprador = comprador;
	}

	public Item[] getItems() {
		return items;
	}

	public void setItems(Item[] items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "GeneradorDeOrden [comprador=" + comprador + ", items=" + Arrays.toString(items) + "]";
	}

}
