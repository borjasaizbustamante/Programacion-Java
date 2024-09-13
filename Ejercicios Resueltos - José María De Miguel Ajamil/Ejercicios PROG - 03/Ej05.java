package ejercicios;

import java.util.Scanner;

public class Ej05 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		// Recuerda: los array se inicializan todo a 0s, a false o a null
		int tamanioArray = 20;
		int[] array = new int[tamanioArray];
		int[] numVeces = new int[10];

		// Pide números de 0 a 9 hasta que tenemos 20 o nos dan un negativo

		int valor = 0;
		int posicionArray = 0;
		do {

			System.out.print(" Dame un numero: ");
			valor = teclado.nextInt();
			if (valor >= 0) {
				array[posicionArray] = valor;
				posicionArray++;
			} else
				System.out.println(" Fin de introducion de numeros ");

		} while ((valor >= 0) && (posicionArray < tamanioArray));

		// Buscamos cuantos 0s, cuantos 1s, ...

		for (int i = 0; i < 10; i++) {
			for (int pos = 0; pos < tamanioArray; pos++) {
				int numArray = array[pos];
				if (numArray == i) {
					numVeces[i] = numVeces[i] + 1;
				}
			}
		}

		// Los mostramos
		
		for (int pos = 0; pos < numVeces.length; pos++) {
			System.out.println(" Veces numero " + pos + ": " + numVeces[pos]);
		}
		
		teclado.close();
	}

}
