package Clase01;

public class Programa02 {
	
	public static void main(String[] args) {
		
		int[] vectorDeNumeros = {11, -22, 33, -44, 55, -66, 77, -88, 99};
		int totalPositivos = 0;
		int totalNegativos = 0;
		int min = 0;
		int max = 0;
		int indiceMin = 0;
		int indiceMax = 0;
		
		for (int i = 0; i < vectorDeNumeros.length; i++) {
			
			if (i == 0 || min > vectorDeNumeros[i] ) {
				indiceMin = i;
				min = vectorDeNumeros[i];
			}
			if (i == 0 || max < vectorDeNumeros[i]) {
				indiceMax = i;
				max = vectorDeNumeros[i];
			}
			if (vectorDeNumeros[i] < 0) {
				totalNegativos += vectorDeNumeros[i];
			}
			else{
				totalPositivos += vectorDeNumeros[i];
			}
		}
		
		System.out.println("La suma total de los positivos es " + totalPositivos + " y la suma total de los "
				+ "negativos es" + totalNegativos);
		System.out.println("\nEl numero mas bajo es " + min + " y su indice es " + indiceMin);
		System.out.println("\nEl numero mas alto es " + max + " y su indice es " + indiceMax);
		
	}
}
