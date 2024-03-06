package ejercicios;

import java.util.Scanner;

/**
 * Lee un numero real por teclado y muestra por pantalla el mensaje "El valor de
 * la variable introducida es ".
 */
public class Ej18 {

	public static void main(String[] args) {

		// REAL numeroReal <- 0
		double numeroReal = 0;

		// LEER numeroReal
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce numero real: ");
		numeroReal = teclado.nextDouble();
		teclado.close();

		// ESCRIBIR numeroReal
		System.out.printf("El valor de la variable introducida es %.2f", numeroReal);

	}

}
