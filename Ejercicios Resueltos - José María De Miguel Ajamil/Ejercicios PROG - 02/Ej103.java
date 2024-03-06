package ejercicios;

import java.util.Scanner;

public class Ej103_Sacarnumw {

	public static void main(String[] args) {
		// Numero entero
		int numero, contador=1;
					
		// leer numero
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce hasta que numero hay que sacar por pantalla : ");
		numero = teclado.nextInt();
		teclado.close();

		while (contador <= numero) {
			
			// ESCRIBIR los numeros empezando por 1 hasta el "numero" introducido por pantalla;
			System.out.println(contador);
			
			//Sumar 1 al contador, hasta que sea igual al numero, y sale del bucle
			contador ++; //Es lo mismo que poner contador=contador+1
		}

	}

}
