package ejercicios;

import java.util.Scanner;

/**
 * Esto es una calculadora sencilla. En este caso, no da el error de división
 * por cero. Recuerda!!! Hay muchas formas de solucionar un mismo problema.
 */
public class EjemploCalculadoraSinError {

	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		int valorUno = 0;
		int valorDos = 0;
		int resultado = 0;

		// Pedir el numero 1
		System.out.print("Dame un numero: ");
		valorUno = teclado.nextInt();

		// Pedir el numero 2
		System.out.print("Dame otro numero: ");
		valorDos = teclado.nextInt();

		// Comprobamos si el valorDos es un cero.
		// Si lo es, el programa termina con un
		// mensaje de error
		if (valorDos == 0) {
			System.out.println("No puedo dividir por cero");
		} else {
			
			// Si nos dan otro valor que no es cero, operamos...

			// Sumar
			resultado = valorUno + valorDos;
			System.out.println("La suma es: " + resultado);

			// Restar
			resultado = valorUno + valorDos;
			System.out.println("La resta es: " + resultado);

			// Multiplicar
			resultado = valorUno + valorDos;
			System.out.println("La multiplicación es: " + resultado);

			// Dividir
			resultado = valorUno + valorDos;
			System.out.println("La division es: " + resultado);
		}
	}
}
