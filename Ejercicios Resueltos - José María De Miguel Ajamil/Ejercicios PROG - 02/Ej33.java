package eJUD02;

import java.util.Scanner;

public class Ej33 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		// Leemos tres numeros
		System.out.print("Introduce num1: ");
		int num1 = teclado.nextInt();
		
		System.out.print("Introduce num2: ");
		int num2 = teclado.nextInt();
		
		System.out.print("Introduce num3: ");
		int num3 = teclado.nextInt();
		
		// Comparamos
		int mayor = 0;
		if ((num1 > num2) && (num1 > num3)){
			mayor = num1;
		} else if (num2 > num3){
			mayor = num2;
		} else {
			mayor = num3;
		}
		System.out.print("El mayor es: " + mayor);
		
		teclado.close();
	}
}
