package ejercicios;

import java.util.Scanner;

/**
 * Lee un número por teclado y calcula el cuadrado de ese número. Si el cuadrado
 * es mayor que 100 se le restara 100 y se mostrara por pantalla. Si no es mayor
 * que 100, se mostrara lo que le falta para llegar a 100.
 */
public class Ej22 {

	public static void main(String[] args) {
		
		// REAL numeroEntero <- 0
		double numeroEntero = 0; 
		
		// LEER numeroEntero
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce numero entero: ");
		numeroEntero = teclado.nextDouble();
		teclado.close();
		
		// numeroEntero <- numeroEntero * numeroEntero
		numeroEntero = numeroEntero * numeroEntero;
		
		// SI numeroEntero > 100 
		if (numeroEntero > 100) {
			
			// ENTONCES numeroEntero <- numeroEntero - 100
			numeroEntero = numeroEntero - 100;
			
			// ESCRIBIR numeroEntero
			System.out.println("Numero Entero: " + numeroEntero);
		}
		// SINO 
		else {
			
			// ENTONCES numeroEntero <- 100 - numeroEntero
			numeroEntero = 100 - numeroEntero;
			
			// ESCRIBIR "Lo que falta para llegar a 100 es: " numeroEntero
			System.out.println("Lo que falta para llegar a 100 es: " + numeroEntero);
		}
		// FIN-SI 
	}
}
