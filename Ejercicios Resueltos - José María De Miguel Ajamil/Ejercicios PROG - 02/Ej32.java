package ejercicios;

import java.util.Scanner;

/**
 * Calcula las soluciones de una ecuación de 2º grado. Si las raices son
 * complejas muestra el mensaje de error "Raíces Complejas". Para calcular la
 * raiz cuadrada hay que usar el metodo Math.sqrt(determinante).
 */
public class Ej32 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		// Las ecuaciones de 2º grado son de la forma ax2 + bx + c = 0
		int a = 0;
		int b = 0;
		int c = 0;
		
		System.out.println("Formato de la ecuacion 2º Grado -> ax2 + bx + c = 0");
		System.out.print("Introduce el a: ");
		a = teclado.nextInt();
		System.out.print("Introduce el b: ");
		b = teclado.nextInt();
		System.out.print("Introduce el c: ");
		c = teclado.nextInt();
		teclado.close();
		
		// Hacemos la operacion aplicando la formula
		
		double discriminante = 0; 
		discriminante = -4 * a * c;
		discriminante = (b * b) - (4 * a * c);
		
		if (discriminante >= 0) {
			double resultado = 0; 
			if (discriminante == 0) {
				
				// Una solucion
				resultado = (-b - (4 * a * c)) / (2 * a);
				System.out.println ("Resultado = " + resultado);
				
			} else {
				
				// Dos soluciones
				resultado = (-b + Math.sqrt(discriminante)) / (2 * a);
				System.out.println ("Resultado 1 = " + resultado);
				
				resultado = (-b - Math.sqrt(discriminante)) / (2 * a);
				System.out.println ("Resultado 2 = " + resultado);
			}
			
		} else {
			// Sin solucion
			System.out.println ("Raíces Complejas");
		}
	}
	
}
