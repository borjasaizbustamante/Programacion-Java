package ejercicios;

import java.util.Scanner;

/**
 * Lee el sueldo de un trabajador por teclado y muestra por pantalla la
 * retencion que se le aplica sabiendo que si:
 * 
 * sueldo < 1000.00 retencion 10% 
 * sueldo 1000.00 retencion 12% 
 * sueldo < 2000.00 retencion 14% 
 * sueldo 2000.00 retencion 16% 
 * sueldo > 2000.00 retencion 18%
 */
public class Ej25 {

	public static void main(String[] args) {

		double sueldo = 0;
		double retencion = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce el sueldo: ");
		sueldo = teclado.nextDouble();
		teclado.close();

		if (sueldo < 1000.00) {
			retencion = 10;
		} else if (sueldo == 1000.00){
			retencion = 12;
		} else if (sueldo < 2000.00){
			retencion = 14;
		} else if (sueldo == 2000.00){
			retencion = 16;
		} else {
			retencion = 18;  // No hace falta hacer if (sueldo > 2000.00)
		}
		
		System.out.println("Retención: " + retencion);
	}
}
