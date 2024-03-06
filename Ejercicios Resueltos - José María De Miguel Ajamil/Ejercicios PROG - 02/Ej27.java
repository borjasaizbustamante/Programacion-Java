package ejercicios;

import java.util.Scanner;

public class Ej27 {

	public static void main(String[] args) {
		//Definir variable nota de entrada por teclado
		double nota;
		
		// LEER nota
		Scanner datoEntrada = new Scanner(System.in);
		System.out.print("Introduce la nota del alumno: ");
		nota = datoEntrada.nextDouble();
		datoEntrada.close();
				
		if(nota<0 || nota>10) {
			System.out.println("Nota invalida. Vuelve a intentarlo");
		}else {
			if (nota>=0 && nota<3) {
				System.out.println("Calificacion MD");
			}else if(nota>=3 && nota<5) {
				System.out.println("Calificacion INS");
			}else if(nota>=5 && nota<6) {
				System.out.println("Calificacion SUF");
			}else if(nota>=6 && nota<7) {
				System.out.println("Calificacion BIEN");
			}else if(nota>=7 && nota<9) {
				System.out.println("Calificacion NOT");
			}else if(nota>=9 && nota<=10) {
				System.out.println("Calificacion SOBRE");
			}else {
				System.out.println("Dato INCORRECTO");
			}
		}

	}
}
