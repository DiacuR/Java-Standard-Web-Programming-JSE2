package Clase02.Programa02;

public class BuscadorGeneral extends Buscador {

	public BuscadorGeneral(String clave) {
		super(clave);		
	}
	
	@Override
	public Resultado[] buscar() {
	
		String sql = "SELECT * FROM Articulos WHERE Titulo LIKE '%" + this.clave +"%'";
		
		System.out.println("Ejecutando: " + sql);
		
		Resultado result1 = new Resultado("Programacion Basica","Figeroa Daniel", 679f, true);
		Resultado result2 = new Resultado("Programacion para ni�os I","Pe�a Millahual, Claudio A.", 578f, true);
		Resultado result3 = new Resultado("Programacion para ni�os II","Pe�a Millahual, Claudio A.", 649f, true);
		
		return new Resultado [] {result1,result2,result3};
	}
}
