package Clase01;

import java.util.Scanner;

public class Programa01 {

	public static void main(String[] args) {
		
		int nota1, nota2, nota3;
		int cantidadNotas = 3;
		int mayor = 0;
		int menor = 0;
		int sumaNotas = 0;
		float promedio = 0f;
		
		Scanner teclado = new Scanner(System.in);
		
		nota1 = ValidarNota(teclado, "primer"); //ctrl + shift + m (Crea funcion con el codigo seleccionado
		nota2 = ValidarNota(teclado, "segunda");
		nota3 = ValidarNota(teclado, "tercera");
		
		sumaNotas = nota1 + nota2 + nota3;
		
		promedio = sumaNotas / cantidadNotas;
		
		//Mayor
		
		mayor = MayorNota(nota1, nota2, nota3);
		
		//Minimo
		
		menor = MenorNota(nota1, nota2, nota3);
		
		//Mostrar
		
		System.out.println("La suma de las notas es: " + sumaNotas);
		System.out.println("El promedio de las notas es: " + promedio);
		System.out.println("La mayor de las notas es: " + mayor);
		System.out.println("La menor de las notas es: " + menor);
	}
	
	private static int MenorNota(int nota1, int nota2, int nota3) {
		
		int menor = 0;
		
		if(nota1 < nota2 && nota1 < nota3) {
			menor = nota1;
		}
		if(nota2 < nota1 && nota2 < nota3) {
			menor = nota2;
		}
		if(nota3 < nota2 && nota3 < nota1) {
			menor = nota3;
		}
		
		return menor;
	}
	
	private static int MayorNota(int nota1, int nota2, int nota3) {
		
		int mayor = 0;
		
		if(nota1 > nota2 && nota1 > nota3) {
			mayor = nota1;
		}
		if(nota2 > nota1 && nota2 > nota3) {
			mayor = nota2;
		}
		if(nota3 > nota2 && nota3 > nota1) {
			mayor = nota3;
		}
		
		return mayor;
	}

	private static int ValidarNota(Scanner teclado, String texto) {
		
		int nota = 0;
		boolean valido = false;
		
		do {
			
			System.out.print("Ingrese la "+ texto +" nota: ");
			String aux = teclado.next();
			
			try {
				
				nota = Integer.parseInt(aux);
				valido = true;
				
			} catch (Exception e) {
				
				valido = false;
				
			}
			
		} while (!valido);
		
		return nota;
	}

}
