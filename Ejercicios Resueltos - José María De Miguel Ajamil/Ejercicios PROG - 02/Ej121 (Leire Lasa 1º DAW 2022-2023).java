package ejercicios;

import java.util.Scanner;

public class Ej123 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		int numeroRandom = 0;
		int maximo = 0;
		int adivina = 0;
		int intentos = 1;
		
		System.out.print("Introduce un número máximo: ");
		maximo = teclado.nextInt();
		
		numeroRandom = (int) (Math.floor(Math.random()* maximo)+1);
		
		System.out.println("Adivina el número entre 1 y " + maximo);
		adivina = teclado.nextInt();
		
		while (adivina != numeroRandom) {
			intentos++;
			if (adivina > numeroRandom) {
				System.out.println("Demasiado alto, introduce un número más bajo: ");
				adivina = teclado.nextInt();
			} else if (adivina < numeroRandom) {
				System.out.println("Demasiado bajo, introduce un número más alto: ");
				adivina = teclado.nextInt();
			}
		}
		
		System.out.println("HAS ACERTADO! El número era: " + numeroRandom);
		System.out.println("Has realizado " + intentos + " intentos");
		
		teclado.close();
	}
}