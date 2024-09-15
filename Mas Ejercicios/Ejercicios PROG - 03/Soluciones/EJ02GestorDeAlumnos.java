package ejercicio;

import java.util.Scanner;

public class GestorDeAlumnos {

	private static Scanner teclado = new Scanner(System.in);

	private static String[] arrayAlumnos = new String[20];

	private static void pintarMenu() {
		System.out.println(" ");
		System.out.println("- Menu Inicial -");
		System.out.println("----------------");
		System.out.println("1. Aniadir alumno");
		System.out.println("2. Mostrar todos alumnos");
		System.out.println("3. Mostrar alumno");
		System.out.println("0. Salir");
		System.out.println(" ");
	}

	private static int escribirMenu() {
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
		} while ((ret < 0) || (ret > 3));
		return ret;
	}

	private static void aniadirAlumno() {
		String datosAlumno = pedirAlumno();
		guardarNuevoAlumno(datosAlumno);
	}

	private static String pedirAlumno() {
		String ret = null;

		System.out.print("Dame un nombre: ");
		String nombre = teclado.nextLine();

		System.out.print("Dame un apellido: ");
		String apellido = teclado.nextLine();

		System.out.print("Dame un apellido2: ");
		String apellido2 = teclado.nextLine();

		System.out.print("Dame una fecha nacimiento: ");
		String fecha = teclado.nextLine();

		System.out.print("Dame un curso: ");
		String curso = teclado.nextLine();

		System.out.print("Dame una clase: ");
		String clase = teclado.nextLine();

		ret = nombre + ", " + apellido + ", " + apellido2 + ", " + fecha + ", " + curso + ", " + clase;

		return ret;
	}

	private static void guardarNuevoAlumno(String datosAlumno) {
		for (int i = 0; i < arrayAlumnos.length; i++) {
			if (null == arrayAlumnos[i]) {
				arrayAlumnos[i] = datosAlumno;
				break;
			}

			if (i == 19) {
				System.out.println("No tenemos espacio...");
			}
		}
	}

	private static void visualizarTodosAlumons() {
		for (int i = 0; i < arrayAlumnos.length; i++) {
			String alumno = arrayAlumnos[i];
			if (null != alumno) {
				System.out.println("Alumno [" + i + "] = " + alumno);
			} else {
				System.out.println("Alumno [" + i + "] = vacio");
			}
		}
	}

	private static String pedirNombreAlumno() {
		String ret = null;
		System.out.print("Dame un nombre: ");
		ret = teclado.nextLine();
		return ret;
	}

	private static String getNombreDelAlumno(String alumno) {
		String[] parts = alumno.split(",");
		return parts[0].trim();
	}

	private static void visualizarUnAlumno(String nombreAlumno) {
		boolean encontrado = false;
		
		for (int i = 0; i < arrayAlumnos.length; i++) {

			if (null != arrayAlumnos[i]) {
				String alumno = arrayAlumnos[i];
				String nombreAlu = getNombreDelAlumno(alumno);
				if (nombreAlu.equals(nombreAlumno)) {
					System.out.println("Alumno encontrado!");
					System.out.println("Datos del alumno: " + alumno);
					encontrado = true;
				}
			}
		}
		
		if (!encontrado) {
			System.out.println("Alumno no encontrado!");
		}
	}

	public static void main(String[] args) {

		int opcionMenu = 0;

		do {

			opcionMenu = escribirMenu();

			switch (opcionMenu) {
			case 0:
				System.out.println("Adios !!!");
				break;
			case 1:
				aniadirAlumno();
				break;
			case 2:
				visualizarTodosAlumons();
				break;
			case 3:
				String nombreAlumno = pedirNombreAlumno();
				visualizarUnAlumno(nombreAlumno);
				break;
			default:
				System.out.println("Esta opcion no deberia salir");
			}

		} while (opcionMenu != 0);
		teclado.close();
	}
}
