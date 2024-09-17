package ejercicio;

import java.util.Scanner;

public class CalculadoraConFunciones {

	private static Scanner teclado = new Scanner(System.in);

	private static double sumar(double op1, double op2) {
		return op1 + op2;
	}

	private static double restar(double op1, double op2) {
		return op1 - op2;
	}

	private static double multiplicar(double op1, double op2) {
		return op1 * op2;
	}

	private static double dividir(double op1, double op2) {
		return op1 / op2;
	}

	public static void main(String[] args) {

		boolean exit = false;
		int opcion = 0;
		do {
			System.out.print(" Dame un numero: ");
			double op1 = teclado.nextDouble();

			System.out.print(" Dame otro numero: ");
			double op2 = teclado.nextDouble();

			System.out.println(" ");
			System.out.println(" CALCULADORA ");
			System.out.println("1. Sumar ");
			System.out.println("2. Restar ");
			System.out.println("3. Multiplicar ");
			System.out.println("4. Dividir ");
			System.out.println("5. Salir ");

			switch (opcion) {
			case (1):
				System.out.println("Suma: " + sumar(op1, op2));
				break;
			case (2):
				System.out.println("Resta: " + restar(op1, op2));
				break;
			case (3):
				System.out.println("Multiplicacion: " + multiplicar(op1, op2));
				break;
			case (4):
				if (op2 == 0)
					System.out.println("Error, no se puede dividir por cero");
				else
					System.out.println("Division: " + dividir(op1, op2));
				break;
			case (5):
				System.out.println("Adios! ");
				exit = true;
				break;
			}
		} while (!exit);

		teclado.close();
	}

}
