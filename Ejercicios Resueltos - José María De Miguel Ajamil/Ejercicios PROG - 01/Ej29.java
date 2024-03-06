package ejercicios;

import java.util.Scanner;

/**
 * Pide una cantidad en euros, un tipo de interes (ej: 5,5%), y un periodo de tiempo 
 * expresado en dias por pantalla y calcula el interes producido en ese tiempo en base a la formula: 
 * 
 * Interes=(Cantidad*TipoInteres*Tiempo)/(360*100) 
 * 
 * Nota: Para mostrar el caracter % dentro de printf debemos escribir %%. Sino mostrara una excepcion.
 */
public class Ej29 {

	public static void main(String[] args) {
		
		// REAL EUROS 
		double euros = 0; 
		
		// REAL TIPOINTERES
		double tipoInteres = 0; 
		
		// ENTERO DIAS
		int dias = 0; 
		
		// REAL RESULTADO
		double resultado = 0; 

		// LEER EUROS
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce euros: ");
		euros = teclado.nextLong();
		
		// LEER TIPOINTERES
		System.out.println("Introduce tipo interes: ");
		tipoInteres = teclado.nextLong();
		
		// LEER DIAS
		System.out.println("Introducedias: ");
		dias = teclado.nextInt();
		teclado.close();
		
		// RESULTADO <- (EUROS * TIPOINTERES * DIAS) / (360*100)
		resultado = (euros * tipoInteres * dias) / (360*100);
		
		// ESCRIBIR RESULTADO
		System.out.printf("Resultado: %f %%", resultado);
		
	}
}
