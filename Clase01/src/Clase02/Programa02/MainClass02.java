package Clase02.Programa02;

public class MainClass02 {

	public static void main(String[] args) {
		
		String clave = "programacion";
		Buscador b = new BuscadorGeneral(clave);
		
		Resultado[] res = b.buscar();
		
		for (Resultado resultado : res) {
			System.out.println(resultado);
		}
		System.out.println("-------------------------------------------------------------------------------");
		
		b = new BuscadorLibro(clave);
		
		res = b.buscar();
		
		for (Resultado resultado : res) {
			System.out.println(resultado);
		}
		System.out.println("-------------------------------------------------------------------------------");
		
		b = new BuscadorPelicula(clave);
		
		res = b.buscar();
		
		for (Resultado resultado : res) {
			System.out.println(resultado);
		}
	}

}
