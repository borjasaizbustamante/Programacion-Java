package ejercicios;

import java.util.Scanner;

/**
 * Pide un número n por teclado y muestra la siguiente salida en pantalla. Con
 * While.
 * 
 * N=5 
 * 1
 * 2 2
 * 3 3 3
 * 4 4 4 4
 * 5 5 5 5 5
 */
public class Ej140 {

	public static void main(String[] args) {

		// ENTERO num <- 0
		int num = 0;

		// LEER num
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce número entero: ");
		num = teclado.nextInt();
		teclado.close();

		// ESCRIBIR num
		System.out.println("N= " + num);

		// ENTERO fila <- 0
		int fila = 1;

		// MIENTRAS (fila <= num)
		while (fila <= num) {

			// ENTERO veces <- 0
			int veces = 0;

			// MIENTRAS (veces < fila)
			while (veces < fila) {

				// ESCRIBIR num
				System.out.print(fila);

				// veces <- veces - 1
				veces = veces + 1;
			}

			// ESCRIBIR salto de línea
			System.out.println(" ");

			// file <- fila + 1
			fila = fila + 1;
		}
	}
}
