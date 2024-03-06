package ejercicios;

import java.util.Scanner;

public class Ej19_ValorAbs {

	public static void main(String[] args) {
		double numero = 0;
		
		//Pido el numero REAL por teclado
		Scanner input = new Scanner(System.in); 
		System.out.println("Teclee un numero real: ");
		numero = input.nextDouble();
		input.close();
		
		//Pregunto a ver si es un numero negativo
		if (numero < 0) {
			System.out.printf("El valor absoluto de %f es %f .", numero,(numero*-1));
			//System.out.printf("El valor absoluto de %f es %f .", numero, Math.abs(numero));
		}else {
			System.out.println("El valor absoluto de " +numero + " es " + numero);
		}
	}

}
