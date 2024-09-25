package ejercicios;

import java.util.Scanner;

/**
 * Crea una clase que muestra un menu por pantalla con las siguientes opciones:
 * - Añadir Fecha. Pide una Fecha y la añade al array de manera ordenada si queda sitio en el array. 
 * - Buscar Fecha. Pide una Fecha y la busca en el array. Muestra un mensaje con la posición en que se encuentra o un mensaje de
 * error si no se encuentra en el array. 
 * - Borrar Fecha. Pide una Fecha y la elimina, si es que existe, del array. 
 * - Listar Array. Muestra todos los elementos del array por pantalla, si es que tiene elementos. 
 * - Salir. Realiza las operaciones necesarias para la correcta finalización del programa.
 */
public class Ejercicio28 {

	private static final int MAX_SIZE = 20;

	private static Scanner teclado = null;
	private static Ejercicio11[] arrayFechas = null;

	public Ejercicio28() {
		teclado = new Scanner(System.in);
		arrayFechas = new Ejercicio11[MAX_SIZE];
	}

	private void pintarMenu() {
		System.out.println(" ");
		System.out.println("- Menu Inicial -");
		System.out.println("----------------");
		System.out.println("1. Aniadir fecha");
		System.out.println("2. Buscar fecha");
		System.out.println("3. Borrar fecha");
		System.out.println("4. Mostrar Array");
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
		} while ((ret < 0) || (ret > 4));
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
				añadirFecha();
				break;
			case 2:
				buscarFecha();
				break;
			case 3:
				borrarFecha();
				break;
			case 4:
				mostrarArray();
				break;
			default:
				System.out.println("Esta opcion no deberia salir");
			}

		} while (opcionMenu != 0);
		teclado.close();
	}

	private void añadirFecha() {
		Ejercicio11 fecha = pedirFecha();

		for (int i = 0; i < arrayFechas.length; i++) {
			if (null == arrayFechas[i]) {
				arrayFechas[i] = fecha;
				break;
			}

			if (i == 19) {
				System.out.println("No tenemos espacio...");
			}
		}

		// Reordenados el array
		arrayFechas = bubbleSort(arrayFechas);
	}

	/**
	 * Ordena el array de menos a mayor mediante el algoritmo bubblesort. Se utiliza
	 * el compareTo para hacer las comparaciones y averiguar que fecha es mayor o
	 * menor que otra
	 * 
	 * @param arrayFechas
	 * @return array de fechas ordenado
	 */
	public Ejercicio11[] bubbleSort(Ejercicio11 arrayFechas[]) {
		int n = arrayFechas.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (arrayFechas[j].compareTo(arrayFechas[j + 1]) > 0) {
					Ejercicio11 temp = arrayFechas[j];
					arrayFechas[j] = arrayFechas[j + 1];
					arrayFechas[j + 1] = temp;
				}
		return arrayFechas;
	}

	private Ejercicio11 pedirFecha() {
		Ejercicio11 ret = new Ejercicio11();

		System.out.print("Dame el dia: ");
		ret.setDia(teclado.nextInt());
		teclado.nextLine();
		System.out.print("Dame el mes: ");
		ret.setMes(teclado.nextInt());
		teclado.nextLine();
		System.out.print("Dame el año: ");
		ret.setAño(teclado.nextInt());
		teclado.nextLine();

		return ret;
	}

	private void buscarFecha() {
		Ejercicio11 fechaABuscar = pedirFecha();

		boolean encontrado = false;
		for (int i = 0; i < arrayFechas.length; i++) {

			if (null != arrayFechas[i]) {
				Ejercicio11 fecha = arrayFechas[i];
				if (fechaABuscar.equals(fecha)) {
					System.out.println("Fecha encontrada! - " + fecha.toString());
					encontrado = true;
				}
			}
		}

		if (!encontrado) {
			System.out.println("Fecha no encontrado!");
		}
	}

	private void borrarFecha() {
		Ejercicio11 fechaABuscar = pedirFecha();

		boolean encontrado = false;
		for (int i = 0; i < arrayFechas.length; i++) {

			if (null != arrayFechas[i]) {
				Ejercicio11 fecha = arrayFechas[i];
				if (fechaABuscar.equals(fecha)) {
					System.out.println("Fecha encontrada!");
					arrayFechas[i] = null;
					System.out.println("Fecha eliminada!");
					encontrado = true;
				}
			}
		}

		if (!encontrado) {
			System.out.println("Alumno no encontrado!");
		}

		// Reordenados el array
		arrayFechas = bubbleSort(arrayFechas);
	}

	private void mostrarArray() {
		for (int i = 0; i < arrayFechas.length; i++) {
			Ejercicio11 fecha = arrayFechas[i];
			if (null != fecha) {
				System.out.println("fecha [" + i + "] = " + fecha.toString());
			}
		}
	}

	public static void main(String[] args) {
		Ejercicio28 ejercicio28 = new Ejercicio28();
		ejercicio28.menu();
	}
}
