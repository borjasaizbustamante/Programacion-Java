package agenda;

import java.util.Scanner;

public class Ej09AgendaDeTelefonos {

	static final int MAX_SIZE = 10;
	static String[] names = new String[MAX_SIZE];
	static int[] numbers = new int[MAX_SIZE];

	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		int option = 0;
		do {

			option = showMenu();

			switch (option) {
			case 0:
				System.out.println("Adios!");
				break;
			case 1:
				nuevoRegistro();
				break;
			case 2:
				listarTodos();
				break;
			case 3:
				buscarNombre();
				break;
			default:
				System.out.println("Este no debería verse...");
			}

		} while (option != 0);

		teclado.close();
	}

	// Escribe el menu
	private static int showMenu() {
		int ret = 0;
		mostrarTextoMenu();
		ret = pedirNumeroPorTeclado();
		return ret;
	}

	private static void mostrarTextoMenu() {
		System.out.println(" ");
		System.out.println("- Menu Inicial -");
		System.out.println("----------------");
		System.out.println("1. Nuevo numero");
		System.out.println("2. Mostrar todos");
		System.out.println("3. Buscar");
		System.out.println("0. Salir");
		System.out.println(" ");
	}

	private static void nuevoRegistro() {
		if (!hayHuecos()) {
			System.out.println(" No hay huecos...");
		} else {
			nuevoNombre();
			nuevoNumero();
		}
	}

	private static boolean hayHuecos() {
		boolean ret = false;
		for (int i = 0; i < MAX_SIZE; i++) {
			if (null == names[i]) {
				ret = true;
				break;
			}
		}
		return ret;
	}

	private static void nuevoNombre() {
		System.out.print(" Dame un nuevo nombre: ");
		String name = teclado.nextLine().trim();
		for (int i = 0; i < MAX_SIZE; i++) {
			if (null == names[i]) {
				names[i] = name;
				break;
			}
		}
	}

	private static void nuevoNumero() {
		int number = pedirTelefonoPorTeclado();
		for (int i = 0; i < MAX_SIZE; i++) {
			if (0 == numbers[i]) {
				numbers[i] = number;
				break;
			}
		}
	}

	private static void listarTodos() {
		System.out.println(" ");
		if (!hayContactos()) {
			System.out.println(" No hay contactos...");
		} else {
			for (int i = 0; i < MAX_SIZE; i++) {
				if (null != names[i])
					System.out.println(" Nombre: " + names[i] + ", Telef: " + numbers[i]);
			}
		}
	}

	private static boolean hayContactos() {
		boolean ret = false;
		for (int i = 0; i < MAX_SIZE; i++) {
			if (null != names[i]) {
				ret = true;
				break;
			}
		}
		return ret;
	}

	private static void buscarNombre() {
		System.out.print("Dame un nombre: ");
		String name = pedirNombrePorTeclado();
		for (int i = 0; i < MAX_SIZE; i++) {
			if ((null != names[i]) && (names[i].contains(name))) {
				System.out.println(" Nombre: " + names[i] + ", Telef: " + numbers[i]);
			}
		}
	}

	private static int pedirNumeroPorTeclado() {
		int ret = 0;
		do {
			try {
				System.out.print("Opcion: ");
				ret = teclado.nextInt();
				teclado.nextLine();
			} catch (Exception e) {
				System.out.println("Error!!! Opcion incorrecta");
				teclado.nextLine();
				ret = -1;
			}
		} while ((ret < 0) || (ret > 3));
		return ret;
	}

	private static int pedirTelefonoPorTeclado() {
		int ret = 0;
		do {
			try {
				System.out.print(" Dame un nuevo numero: ");
				ret = teclado.nextInt();
				teclado.nextLine();
			} catch (Exception e) {
				System.out.println("Error!!! No es un numero");
				teclado.nextLine();
				ret = -1;
			}
		} while (ret <= 0);
		return ret;
	}

	public static String pedirNombrePorTeclado() {
		String ret = null;
		System.out.print("Dame un nombre: ");
		ret = teclado.nextLine().trim();
		return ret;
	}
}
