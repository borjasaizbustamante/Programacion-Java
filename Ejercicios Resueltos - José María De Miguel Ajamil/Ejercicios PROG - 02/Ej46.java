package ejercicios;

import java.util.Scanner;

/**
 * Pide pide un numero entero entre 1 y 99 y lo muestra en números romanos. Si
 * se introduce un número incorrecto muestra el mensaje “Numero incorrecto”.
 */
public class Ej46 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int numero = 0;
		String romano = "";
		System.out.print("Introduce el a: ");
		numero = teclado.nextInt();
		teclado.close();

		if (numero > 99 || numero < 1) {
			System.out.println("Numero incorrecto");
		} else {

			// Dividimos el numero en decenas y unidades
			int decena = numero / 10 % 10;
			int unidad = numero % 10;

			switch (decena) {
			case 9:
				romano = "XC";
				break;
			case 8:
				romano = "LXXX";
				break;
			case 7:
				romano = "LXX";
				break;
			case 6:
				romano = "LX";
				break;
			case 5:
				romano = "L";
				break;
			case 4:
				romano = "XL";
				break;
			case 3:
				romano = "XXX";
				break;
			case 2:
				romano = "XX";
				break;
			case 1:
				romano = "X";
				break;
			}

			switch (unidad) {
			case 9:
				romano = romano + "IX";
				break;
			case 8:
				romano = romano + "VIII";
				break;
			case 7:
				romano = romano + "VII";
				break;
			case 6:
				romano = romano + "VI";
				break;
			case 5:
				romano = romano + "V";
				break;
			case 4:
				romano = romano + "IV";
				break;
			case 3:
				romano = romano + "III";
				break;
			case 2:
				romano = romano + "II";
				break;
			case 1:
				romano = romano + "I";
				break;
			}

			System.out.println("Numero romano: " + romano);
		}
	}
}
