package eJUD02;

import java.util.Scanner;

public class Ej26 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		// Variables del reloj
		
		int hours = 0;
		int minutes = 0;
		int seconds = 0;
		
		// Leer horas, minutos, segundos
		System.out.print("Introduce horas: ");
		hours = teclado.nextInt();

		System.out.print("Introduce minutos: ");
		minutes = teclado.nextInt();

		System.out.print("Introduce segundos: ");
		seconds = teclado.nextInt();

		// Sumar 1 segundo
		System.out.println("Añadimos un segundo");
		seconds = seconds +1;		
		
		if (seconds > 59) {
			seconds = 0;
			minutes = minutes +1;
		} 
		
		if (minutes > 59) {
			minutes = 0;
			hours = hours +1;
		}

		// Mostrar Resultado
		System.out.println("Horas: " + hours);
		System.out.println("Minutos: " + minutes);
		System.out.println("Seconds: " + seconds);
		
		teclado.close();
	}

}
