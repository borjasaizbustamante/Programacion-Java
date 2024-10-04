package temp;

import java.util.Scanner;

public class Ej07 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int [] temperaturas = new int [20];
		int numTemperaturas = 0;
		
		// Leemos temperaturas
		for (int i = 0; i < temperaturas.length; i++) {
			System.out.print ("Dame una temperatura: ");
			int temp = teclado.nextInt ();
			if (temp != -999) {
				temperaturas [i] = temp;
				numTemperaturas ++;
			} else {
				break;
			}
		}
		
		// Media de los valores metidos
		int sumatorio = 0;
		for (int i = 0; i < numTemperaturas + 1; i++) {
			sumatorio = sumatorio + temperaturas[i];
		}
		double media = sumatorio / numTemperaturas;
		System.out.println ("La media es: " + media);
		
		// Temperaturas mayores, iguales o menores
		int menores = 0;
		int iguales = 0; 
		int mayores = 0; 
		for (int i = 0; i < numTemperaturas + 1; i++) {
			if (temperaturas[i] < media) {
				menores ++;
			} else if (temperaturas[i] > media) {
				mayores ++;
			} else {
				iguales ++;
			}
		}
		System.out.println ("Temperaturas mayores: " + mayores);
		System.out.println ("Temperaturas menores: " + menores);
		System.out.println ("Temperaturas iguales: " + iguales);
		teclado.close();
	}
}
