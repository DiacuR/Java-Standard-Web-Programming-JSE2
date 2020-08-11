package Clase04.Interfaces;

public class MainClass {

	public static void main(String[] args) {
		
		Volador v = new Avion("747");
		
		Volador h = new Helicoptero("Apache");
		
		Volador s = new SuperMan("Clark Kent");
		
		Dron d = new Dron("XDS");
		
		Batman b = new Batman("Bruno Diaz");
		
		
		Volador[] voladores = { v, h, s, d, b};
		
		IAterrizable[] atrs = new IAterrizable[10]; 			
			
		int i = 0;
		
		
		for (Volador aux : voladores) {
			
			if (aux instanceof IAterrizable) {
				
				atrs[i++] = ((IAterrizable)aux);
				
				Estado estado = ((IAterrizable)aux).aterrizable();
				
				if (estado.isError()) {
					System.out.println("Enviando a la pista 3 con ayuda a: " + aux );
				}
				else {
					
					if (aux instanceof Maquina) {
						
						if(((Maquina)aux).tieneTurbinas) {
						
							System.out.println("Enviando a la pista 1 a: " + aux);
							
						}
						else {
							System.out.println("Enviando a la pista 2 a: " + aux);
						}
					
					}
					else {
						
						if (((SuperHeroe)aux).tieneCapa) {
							System.out.println("Enviando a la pista 1 a: " + aux);
						}
						else {
							System.out.println("Enviando a la pista 2 a: " + aux);
						}
					 } 
				}
			}
			else {
				System.out.println("No fue posible aterrizar el objeto: "+ aux);
			}
		}
		
		System.out.println("---------------------------");
		
		for (IAterrizable aux : atrs) {
			
			if (aux != null) {
				
				Estado estado = aux.aterrizable();
				
				if (estado.isError()) {
					
					System.out.println("Error aterrizando el objeto " + aux);
				}
			}
		}
		
	}

}
