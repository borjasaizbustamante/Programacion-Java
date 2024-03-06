package ejercicios;

import java.util.Scanner;

/**
 * Lee un numero por teclado y escribe en pantalla el rectangulo siguiente:
 * 
 * Para el numero 7: 
 * 1 2 3 4 5 6 7 
 * 0 2 3 4 5 6 0 
 * 0 0 3 4 5 0 0 
 * 0 0 0 4 0 0 0 
 * 0 0 0 0 0 0 0 
 * 0 0 0 4 0 0 0 
 * 0 0 3 4 5 0 0 
 * 0 2 3 4 5 6 0 
 * 1 2 3 4 5 6 7
 * 
 * Para el numero 4: 
 * 1 2 3 4 
 * 0 2 3 0 
 * 0 0 0 0 
 * 0 2 3 0 
 * 1 2 3 4
 */
public class Ej155 {

	public static void main(String[] args) {

		int num = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce numero entero: ");
		num = teclado.nextInt();
		teclado.close();

		System.out.println("Para el numero " + num + ":");

		// Parte 1
		int columnaI = 1;
		int columnaF = num;
		while (columnaI <= columnaF) {
			for (int i = 1; i <= num; i++) {
				if (i < columnaI)
					System.out.print("0");
				else if (i > columnaF)
					System.out.print("0");
				else
					System.out.print(i);
			}
			System.out.println(" ");

			columnaI++;
			columnaF--;
		}
		
		// Parte 2
		columnaI--;
		columnaF++;
		while (columnaI != 0) {
			for (int i = 1; i <= num; i++) {
				if (i < columnaI)
					System.out.print("0");
				else if (i > columnaF)
					System.out.print("0");
				else
					System.out.print(i);
			}
			System.out.println(" ");

			columnaI--;
			columnaF++;
		}
	}
}
