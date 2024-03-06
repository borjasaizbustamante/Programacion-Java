package ejercicios;

import java.util.Scanner;

/**
 * Lee un numero entero por teclado, calcula su doble, y lo muestra por pantalla.
 */
public class Ej24 {

	public static void main(String[] args) {

		// ENTERO NUM
		int num;

		// NUM <- 0
		num = 0;

		// LEER NUM
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un entero: ");
		num = teclado.nextInt();
		teclado.close();

		// NUM <- 2 * NUM
		num = num * 2;

		// ESCRIBIR NUM
		System.out.println("Resultado: " + num);
	}
}
