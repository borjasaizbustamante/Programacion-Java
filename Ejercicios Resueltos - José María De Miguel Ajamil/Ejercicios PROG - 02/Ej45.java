package ejercicios;

import java.util.Scanner;

public class Ej45 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		double importeCafe = 0.43;
		double importeRefresco = 1.11;
		double importeAgua = 0.36;

		System.out.print("Dame cantidad euros: ");
		double cantidadEuros = teclado.nextDouble();

		System.out.println(" ");
		System.out.println(" - Menu - ");
		System.out.println("1- café (0,43 €)");
		System.out.println("2- refrescos (1,11 €)");
		System.out.println("3- agua (0,36 €)");

		System.out.print("opcion: ");
		int opcion = teclado.nextInt();

		if ((opcion < 0) || (opcion > 3)) {
			System.out.print("Opcion no existe");
		} else {

			switch (opcion) {
			case 1:
				if (cantidadEuros >= importeCafe) {
					System.out.println("Su producto, gracias!");

					double cambios = cantidadEuros - importeCafe;
					int devolver = (int) (cambios * 100);
					if (devolver >= 200) {
						System.out.println("Monedas de 2 euros: " + devolver / 200);
						devolver %= 200;
					}
					if (devolver >= 100) {
						System.out.println("Monedas de 1 euro: " + devolver / 100);
						devolver %= 100;
					}
					if (devolver >= 50) {
						System.out.println("Monedas de 50 centimos: " + devolver / 50);
						devolver %= 50;
					}
					if (devolver >= 20) {
						System.out.println("Monedas de 20 centimos " + devolver / 20);
						devolver %= 20;
					}
					if (devolver >= 10) {
						System.out.println("Monedas de 10 centimos: " + devolver / 10);
						devolver %= 10;
					}
					if (devolver >= 5) {
						System.out.println("Monedas de 5 centimos: " + devolver / 5);
						devolver %= 5;
					}
					if (devolver >= 2) {
						System.out.println("Monedas de 2 centimos: " + devolver / 2);
						devolver %= 2;
					}
					if (devolver >= 1) {
						System.out.println("Monedas de un centimo: " + devolver);
						devolver = 0;
					}

				} else {
					System.out.println("Saldo insuficiente");
				}
				break;
			case 2:
				if (cantidadEuros >= importeRefresco) {
					System.out.println("Su producto, gracias!");

					double cambios = cantidadEuros - importeRefresco;
					int devolver = (int) (cambios * 100);
					if (devolver >= 200) {
						System.out.println("Monedas de 2 euros: " + devolver / 200);
						devolver %= 200;
					}
					if (devolver >= 100) {
						System.out.println("Monedas de 1 euro: " + devolver / 100);
						devolver %= 100;
					}
					if (devolver >= 50) {
						System.out.println("Monedas de 50 centimos: " + devolver / 50);
						devolver %= 50;
					}
					if (devolver >= 20) {
						System.out.println("Monedas de 20 centimos " + devolver / 20);
						devolver %= 20;
					}
					if (devolver >= 10) {
						System.out.println("Monedas de 10 centimos: " + devolver / 10);
						devolver %= 10;
					}
					if (devolver >= 5) {
						System.out.println("Monedas de 5 centimos: " + devolver / 5);
						devolver %= 5;
					}
					if (devolver >= 2) {
						System.out.println("Monedas de 2 centimos: " + devolver / 2);
						devolver %= 2;
					}
					if (devolver >= 1) {
						System.out.println("Monedas de un centimo: " + devolver);
						devolver = 0;
					}

				} else {
					System.out.println("Saldo insuficiente");
				}
				break;
			case 3:
				if (cantidadEuros >= importeAgua) {
					System.out.println("Su producto, gracias!");

					double cambios = cantidadEuros - importeAgua;
					int devolver = (int) (cambios * 100);
					if (devolver >= 200) {
						System.out.println("Monedas de 2 euros: " + devolver / 200);
						devolver %= 200;
					}
					if (devolver >= 100) {
						System.out.println("Monedas de 1 euro: " + devolver / 100);
						devolver %= 100;
					}
					if (devolver >= 50) {
						System.out.println("Monedas de 50 centimos: " + devolver / 50);
						devolver %= 50;
					}
					if (devolver >= 20) {
						System.out.println("Monedas de 20 centimos " + devolver / 20);
						devolver %= 20;
					}
					if (devolver >= 10) {
						System.out.println("Monedas de 10 centimos: " + devolver / 10);
						devolver %= 10;
					}
					if (devolver >= 5) {
						System.out.println("Monedas de 5 centimos: " + devolver / 5);
						devolver %= 5;
					}
					if (devolver >= 2) {
						System.out.println("Monedas de 2 centimos: " + devolver / 2);
						devolver %= 2;
					}
					if (devolver >= 1) {
						System.out.println("Monedas de un centimo: " + devolver);
						devolver = 0;
					}

				} else {
					System.out.println("Saldo insuficiente");
				}
				break;
			default:
				System.out.print("Esto no deberia salir...");
			}
		}

		teclado.close();
	}
}

