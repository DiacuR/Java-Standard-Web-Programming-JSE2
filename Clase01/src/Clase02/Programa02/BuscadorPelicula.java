package Clase02.Programa02;

public class BuscadorPelicula extends Buscador {

	public BuscadorPelicula(String clave) {
		super(clave);
		
	}
	
	@Override
	public Resultado[] buscar() {
		
		String sql = "SELECT * FROM Pelicula  WHERE Titulo LIKE '%" + this.clave +"%'";
		
		System.out.println("Ejecutando: " + sql);
		
		Resultado result1 = new Resultado("Programacion de tv","Los hermanos W", 1000f, true);
		
		return new Resultado [] {result1};
	}

}
