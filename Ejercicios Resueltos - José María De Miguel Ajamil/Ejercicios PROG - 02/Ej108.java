package ejercicios;

import java.util.Scanner;

/**
 * Pide un numero entero por teclado y muestra la suma de todos los numeros
 * hasta el inclusive. Con for.
 */
public class Ej108 {
	public static void main(String[] args) {

		int numero = 0; 
		int sumatorio = 0;
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce numero entero: ");
		numero = teclado.nextInt();
		teclado.close();
		
		for (int i = 1; i <= numero; i++) {
			sumatorio = sumatorio + i;
		}
		
		System.out.println("El sumatorio es: " + sumatorio);
	}
}
