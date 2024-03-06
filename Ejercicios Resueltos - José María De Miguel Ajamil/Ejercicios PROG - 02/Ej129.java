package ejercicios;

import java.util.Scanner;

/**
 * Pide numeros enteros por teclado hasta que se introduce un numero negativo.
 * Con cada numero, si el numero es impar comprueba si es primo o no y muestra
 * un mensaje por pantalla de “Es Primo” o de “No es Primo”; y si es impar,
 * calcula su cubo y muestra el resultado por pantalla.
 */
public class Ej129 {

	public static void main(String[] args) {

		int numero = 0;
		Scanner teclado = new Scanner(System.in);

		while (numero >= 0) {
			System.out.print("Introduce numero entero: ");
			numero = teclado.nextInt();

			if (numero < 0)
				System.out.println("Adios!");
			else if (numero % 2 == 0) {
				// Es par
				System.out.println("Es par");

			} else {
				// Es impar

				int contador = 0;
				for (int i = 1; i <= numero; i++) {
					if ((numero % i) == 0)
						contador++;
				}

				if (contador <= 2)
					System.out.println("Es primo");
				else
					System.out.println("No es primo");

				System.out.println("El cubo vale: " + numero * numero * numero);
			}
		}
		teclado.close();
	}
}
