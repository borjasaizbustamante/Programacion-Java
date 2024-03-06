package ejercicios;

import java.util.Scanner;

public class Ej141 {

	public static void main(String[] args) {

		int numero = 0;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		numero = teclado.nextInt();
		
		for (int i = 1; i <= numero; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
		System.out.println();
		}
		teclado.close();
	}
}