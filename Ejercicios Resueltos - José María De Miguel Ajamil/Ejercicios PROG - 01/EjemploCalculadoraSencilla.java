package ejercicios;

import java.util.Scanner;

/**
 * Esto es una calculadora sencilla. Funciona, aunque da 
 * error en el caso de que dividamos por cero. 
 */
public class EjemploCalculadoraSencilla {

	static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {

		int valorUno=0; 
		int valorDos=0;
		int resultado=0;
		
		// Pedir el numero 1
		System.out.print("Dame un numero: ");
		valorUno = teclado.nextInt(); 
		
		// Pedir el numero 2
		System.out.print("Dame otro numero: ");
		valorDos = teclado.nextInt(); 
		
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
