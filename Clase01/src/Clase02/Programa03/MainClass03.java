package Clase02.Programa03;

import Clase02.Programa02.Buscador;
import Clase02.Programa02.BuscadorGeneral;
import Clase02.Programa02.BuscadorLibro;
import Clase02.Programa02.BuscadorPelicula;
import Clase02.Programa02.Resultado;

public class MainClass03 {

	public static void main(String[] args) {
		
		String clave = "programacion";
		
		Buscador bg = new BuscadorGeneral(clave);
		
		Buscador bp = new BuscadorPelicula(clave);
		
		Buscador bl = new BuscadorLibro(clave);
		
		Buscador [] buscadores = {bg, bp, bl};
		
		for (Buscador buscador : buscadores) {
			for (Resultado resultado : buscador.buscar()) {
				System.out.println(resultado);
			}
			System.out.println("-----------------------------------------------------------------");
		}
	}

}
