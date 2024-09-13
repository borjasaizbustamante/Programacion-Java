package ejercicios;

import java.util.Scanner;

public class Ej11 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		// Obtenemos una cadena de texto
		String cadena = null;
		System.out.print(" Dame un texto: ");
		cadena = teclado.nextLine();

		// Buscamos las vocales
		int as = 0;
		int es = 0;
		int is = 0;
		int os = 0;
		int us = 0;
		for (int i = 0; i < cadena.length(); i++) {
			String caracter = cadena.substring(i, i+1);
			switch (caracter) {
			case "a":
				as++;
				break;
			case "e":
				es++;
				break;
			case "i":
				is++;
				break;
			case "o":
				os++;
				break;
			case "u":
				us++;
				break;
			}
		}
		
		// Mostramos...
		System.out.println(" Numero de As: " + as);
		System.out.println(" Numero de Es: " + es);
		System.out.println(" Numero de Is: " + is);
		System.out.println(" Numero de Os: " + os);
		System.out.println(" Numero de Us: " + us);

		teclado.close();
	}
}
