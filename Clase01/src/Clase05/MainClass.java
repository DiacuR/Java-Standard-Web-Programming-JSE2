package Clase05;

import java.util.Scanner;

import Clase05.Exception.SaldoInsuficienteException;

public class MainClass {

	//Comprador intenta realizar una compra de un monto superior a su saldo
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		char cargar;
		float monto;
		Orden orden = null;
		//3 items
		Item cafe = new Item(1L, 100f, "cafe");
		Item budin = new Item(2L, 500f, "Budin Marmolado");
		Item puchos = new Item(3L, 150f, "camel");
		
		//Comprador
		Comprador carlos = new Comprador(1L,550f);
		
		//Medio de pago
		MedioDePago mp = new MedioDePago(1L, "MP", 1);
		
		//Generador de la compra
		GeneradorDeOrden go = new GeneradorDeOrden(carlos);
		
		go.setItems(new Item[] {cafe, budin, puchos});
		
		try {

			orden = go.comprar(mp);
			System.out.println("La orden con el id " + orden.getId() + " se genero exitosamente.");
			
		} catch (SaldoInsuficienteException e) {
			
			System.err.println(e);
			
			System.out.println("Desea agregar saldo? s/n");
			cargar = scanner.nextLine().charAt(0);
			
			if(cargar == 's') {
				
				System.out.println("Cuanto desea agregar?");
				monto = scanner.nextFloat();
				carlos.setSaldo(monto);
				try {
					orden = go.comprar(mp);
					System.out.println("La orden con el id " + orden.getId() + " se genero exitosamente.");
				} catch (SaldoInsuficienteException e1) {

					e1.printStackTrace();
					
				}catch(MedioDePagoException ex) {
					
					ex.printStackTrace();
				}
			}
			
		} catch(MedioDePagoException ex) {
			System.err.println(ex);
		}
		finally {
			
			
		}
		
		
	}

}
