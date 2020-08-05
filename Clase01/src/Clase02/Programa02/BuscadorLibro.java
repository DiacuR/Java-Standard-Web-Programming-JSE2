package Clase02.Programa02;

public class BuscadorLibro extends Buscador {

	public BuscadorLibro(String clave) {
		super(clave);
		
	}
	
	@Override
	public Resultado[] buscar() {
		
		String sql = "SELECT * FROM Libros  WHERE Titulo LIKE '%" + this.clave +"%'";
		
		System.out.println("Ejecutando: " + sql);
		
		Resultado result1 = new Resultado("Programacion Basica","Figeroa Daniel", 679f, true);
		
		return new Resultado [] {result1};
	}

}
