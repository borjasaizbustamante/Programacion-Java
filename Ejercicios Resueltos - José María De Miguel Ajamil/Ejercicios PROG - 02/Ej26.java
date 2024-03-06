package ejercicios;

import java.util.Scanner;

public class Ej26 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int hora = 0;
		int minuto = 0;
		int segundo = 0; 
		
		System.out.print("Hora: ");
		hora = teclado.nextInt();

		System.out.print("Minuto: ");
		minuto = teclado.nextInt();

		System.out.print("Segundo: ");
		segundo = teclado.nextInt();
		
		// Comprobamos formato
		if (
				((hora < 0) || (hora > 23)) ||
				((minuto < 0) || (minuto > 59)) ||
				((segundo < 0) || (segundo > 59))
				) {
			
			System.out.print("Hora mal metida");
			
		} else {
			
			System.out.println("Sumamos 1 segundo...");
			
			if (segundo == 59) {
				segundo = 0;
				if (minuto == 59) {
					minuto = 0;
					if (hora == 23) {
						hora = 0;
					} else {
						hora++;
					}
				} else {
					minuto ++;
				}
			} else segundo ++;
		}
		
		System.out.print("La hora es: [" + hora + ":" + minuto + ":" + segundo + "]");
		teclado.close();
	}
}
