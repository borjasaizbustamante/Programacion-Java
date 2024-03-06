package ejercicios;

import java.util.Scanner;

public class Ej41 {

	public static void main(String[] args) {
	
		int opcion = 0;
		
		// LEER opcion
		System.out.println("1. Opción 1\r\n"
				+ "2. Opción 2\r\n"
				+ "3. Opción 3\r\n"
				+ "4. Opción 4\r\n"
				+ "5. Opción 5\r\n"
				+ "0. Salir");
		Scanner teclado = new Scanner(System.in);
		System.out.println("Elige una opcion: ");
		opcion = teclado.nextInt();
		teclado.close();
		
		switch (opcion) {
		case 1:
			System.out.println("Has elegido la opcion 1");
			break;
		case 2:
			System.out.println("Has elegido la opcion 2");
			break;
		case 3:
			System.out.println("Has elegido la opcion 3");
			break;
		case 4:
			System.out.println("Has elegido la opcion 4");
			break;
		case 5:
			System.out.println("Has elegido la opcion 5");
			break;
		case 0:
			break;
		default:
			System.out.println("Has elegido una opcion incorrecta del menu");
		
		}
	}	
}