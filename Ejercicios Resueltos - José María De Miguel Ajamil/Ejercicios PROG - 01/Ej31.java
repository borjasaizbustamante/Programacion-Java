package ejercicios;

import java.util.Scanner;

/**
 * Lee una cantidad en euros por teclado y muestra por separado el numero de
 * euros y el numero de centimos de euro.
 */
public class Ej31 {

	public static void main(String[] args) {

		// REAL euros <- 0
		double euros = 0;

		// REAL numEuros <- 0
		double numEuros = 0;

		// REAL numCentimos <- 0
		double numCentimos = 0;

		// LEER euros
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce euros: ");
		euros = teclado.nextDouble();
		teclado.close();

		// numCentimos <- euros % 1
		numCentimos = euros % 1;

		// numEuros <- euros - numCentimos
		numEuros = euros - numCentimos;

		// ESCRIBIR numEuros
		System.out.printf("Numero Euros: %f", numEuros);

		// ESCRIBIR numCentimos
		System.out.printf("Numero Centimos: %f", numCentimos);
	}
}
