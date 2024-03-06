package ejercicios;

import java.util.Scanner;

public class Ej44 {
	
	public static void main(String[] args) {

		// real nota
		int nota = 0;
		
		// cadena calificacion
		String calificacion = "La calificacion obtenida es: ";
		
		// leer nota
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce la NOTA obtenida : ");
		nota = teclado.nextInt();
		teclado.close();

		switch (nota) {
		case 0:
		case 1:
		case 2:
			calificacion += "MD";
			break;
		case 3:
		case 4:
			calificacion += "INS";
			break;
		case 5:
			calificacion += "SUF";
			break;
		case 6:
			calificacion += "BIEN";
			break;
		case 7:
		case 8:
			calificacion += "NOT";
			break;
		case 9:
		case 10:
			calificacion += "SOBRE";
			break;
		default:
			calificacion += "NOTA INTRODUCIDA NO VALIDA";
		}
		// ESCRIBIR ("LA CALIFICACION OBTENIDA ES: "+CALIFICACION+);
		System.out.print(calificacion + ".");
	
	}
}
