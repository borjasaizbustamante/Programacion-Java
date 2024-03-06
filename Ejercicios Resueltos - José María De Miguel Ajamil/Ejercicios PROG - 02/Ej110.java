package ejercicios;

import java.util.Scanner;

/**
 * Pide un numero entero por teclado y muestra la suma de todos los numeros
 * pares desde 0 hasta n. Con While.
 */
public class Ej110 {
	
	public static void main(String[] args) {

		int numero = 0;
		int sumatorio = 0;

		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce numero entero: ");
		numero = teclado.nextInt();
		teclado.close();

		while (numero != 0) {
			if (numero % 2 == 0)
				sumatorio = sumatorio + numero;
			numero = numero - 1;
		}

		System.out.println("El sumatorio es: " + sumatorio);
	}
}
