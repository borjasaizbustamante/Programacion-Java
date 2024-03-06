package ejercicios;

import java.util.Scanner;

/**
 * Lee el valor del radio por teclado y muestra el valor de la circunferencia de
 * ese radio por pantalla con dos decimales. Para el calculo podemos usar la
 * constante Java Math.PI.
 */
public class Ej26 {

	public static void main(String[] args) {

		// REAL radio <- 0
		double radio = 0;

		// REAL resultado <- 0
		double resultado = 0;

		// REAL PI <- 3.14
		// double PI = 3.14; <------------ Las constante PI ya existe en Java -> Math.PI

		// LEER radio
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce radio: ");
		radio = teclado.nextDouble();
		teclado.close();

		// resultado <- 2 * radio * PI
		resultado = 2 * radio * Math.PI; // <------------ La ponemos y listo

		// ESCRIBIR numeroReal
		System.out.printf("El valor del radio es %.2f", resultado);

	}
}
