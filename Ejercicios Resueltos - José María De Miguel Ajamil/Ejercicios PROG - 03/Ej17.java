package ejercicios;

import java.util.Scanner;

public class Ej17 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		// El array
		int tam = 10;
		int[] array = new int[tam];

		// Menu de opciones
		boolean exit = false;
		int opcion = 0;
		do {
			System.out.println(" ");
			System.out.println(" DE MANEJO DE ARRAYS ");
			System.out.println("1. Inicializar el array ");
			System.out.println("2. Ver el array ");
			System.out.println("3. Insertar un elemento (en la posición que le corresponda) ");
			System.out.println("4. Borrar un elemento (de su posición compactando el array) ");
			System.out.println("5. Salir ");

			System.out.print(" Elige una opcion: ");
			opcion = teclado.nextInt();

			switch (opcion) {
			case (1):
				// Inicializamos el array
				for (int i = 0; i < array.length; i++) {
					array[i] = 0;
				}
				System.out.println("Array inicializado... ");
				break;
			case (2):
				// Mostrar el array
				for (int i = 0; i < array.length; i++) {
					System.out.println("Array[" + i + "]: " + array[i]);
				}
				break;
			case (3):
				// Aniadir a posicion
				System.out.print(" Dime posicion: ");
				int pos = teclado.nextInt();
				if (pos < 0 || pos >= array.length)
					System.out.println(" Posicion no valida... ");
				else {
					System.out.print(" Dime valor: ");
					int valor = teclado.nextInt();
					array[pos] = valor;
					System.out.println(" Posicion añadida... ");
				}
				break;
			case (4):
				// Borrar posicion
				System.out.print(" Dime posicion: ");
				int posicion = teclado.nextInt();

				if (posicion < 0 || posicion >= array.length)
					System.out.println(" Posicion no valida... ");
				else {
					array[posicion] = 0;
					System.out.println(" Posicion borrada... ");
				}
				break;
			case (5):
				// Salir
				System.out.println("Adios! ");
				exit = true;
				break;
			}

		} while (!exit);
		
		teclado.close();
	}
}
