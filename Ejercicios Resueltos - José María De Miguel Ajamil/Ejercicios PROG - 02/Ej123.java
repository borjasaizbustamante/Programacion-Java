package exercises2loops;

import java.util.Scanner;

public class Exercise123 {

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


/*
Realiza la clase Java Buscanum que guarda un número en memoria y pide números hasta que se
acierta el número por parte del usuario. El programa muestra si el número introducido es 
mayor o menor que el almacenado en memoria así como el número de intentos que lleva el usuario.
*/