package menus;

import java.util.Scanner;

/**
 * Ejemplo para cuatro opciones de menu
 */
public class MenusSencillos {

	private static Scanner teclado = null;

	// Numero de opciones del menu - de la 0 a la 3
	private static final int MAX_OPCIONES_MENU = 3;

	public MenusSencillos() {
		teclado = new Scanner(System.in);
	}

	private void pintarMenu() {
		System.out.println(" ");
		System.out.println("- Menu Inicial -");
		System.out.println("----------------");
		System.out.println("1. Menu 1");
		System.out.println("2. Menu 2");
		System.out.println("0. Salir");
		System.out.println(" ");
	}

	private int escribirMenu() {
		int ret = 0;
		do {
			try {
				pintarMenu();
				System.out.print("Escoge una opcion: ");
				ret = teclado.nextInt();
				teclado.nextLine();
			} catch (Exception e) {
				System.out.println("Error!!! Opcion incorrecta");
				teclado.nextLine();
				ret = -1;
			}
		} while ((ret < 0) || (ret > MAX_OPCIONES_MENU));
		return ret;
	}

	public void menu() {

		int opcionMenu = 0;

		do {

			opcionMenu = escribirMenu();

			switch (opcionMenu) {
			case 0:
				System.out.println("Adios !!!");
				break;
			case 1:
				System.out.println("Opcion 1");
				break;
			case 2:
				System.out.println("Opcion 2");
				break;
			default:
				System.out.println("Esta opcion no deberia salir");
			}

		} while (opcionMenu != 0);
		teclado.close();
	}

	public String pedirTextoPorTeclado() {
		String ret = null;
		System.out.print("Dame un texto: ");
		ret = teclado.nextLine().trim();
		return ret;
	}

	public int pedirNumeroPorTeclado() {
		int ret = 0;
		do {
			try {
				System.out.print("Dame un numero: ");
				ret = teclado.nextInt();
				teclado.nextLine();
			} catch (Exception e) {
				System.out.println("Error!!! Nota incorrecta");
				teclado.nextLine();
				ret = -1;
			}
		} while ((ret < 0) || (ret > 10));
		return ret;
	}

	public String pedirCaracterPorTeclado() {
		String ret = null;
		System.out.print("Dame un caracter: ");
		ret = teclado.nextLine().trim().charAt(0) + "";
		teclado.nextLine();
		return ret;
	}
}
