package ejercicios;

import java.util.Scanner;

public class Ej34 {

	public static void main(String[] args) {
		
		//entero numero
		int numero=0;
		//entero unidades
		int unidades=0;
		//entero decenas
		int decenas=0;
		//entero centenas
		int centenas=0;
		
		//Leer numero
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un numero entreo de 0 a 999:");
		numero = teclado.nextInt();
		teclado.close();
		
		//Si (numero <1000)
		if (numero>=0 && numero<1000) {
			//Divido entre 100 para calcular las centenas
			centenas = numero / 100;
			
			//Calculo las decenas
			decenas = (numero - (centenas * 100)) / 10;
			
			//Calculo las unidades
			unidades = (numero- (centenas*100+decenas*10));
			
			//Saco por pantalla el resultado 
			System.out.print("El numero introducido " +numero+ " se divide en "+ unidades + " unidades, ");
			System.out.println(decenas + " decenas  y " +centenas + " centenas.");
			
		}else {
			System.out.println("El numero introducido no está entre 0 y 999");
		}	
	}

}