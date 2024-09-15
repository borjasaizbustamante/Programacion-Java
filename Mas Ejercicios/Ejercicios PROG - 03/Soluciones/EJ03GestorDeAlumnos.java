package ejercicio;

import java.util.Scanner;

/**
 * Ejercicios resueltos de la UD3 - Arrays [Avanzado]
 */
public class GestorDeAlumnosEj2 {

	private static Scanner teclado = new Scanner(System.in);

	private static String[] arrayAlumnos = new String[20];

	/**
	 * Pinta el menu por pantalla
	 */
	private static void pintarMenu() {
		System.out.println(" ");
		System.out.println("- Menu Inicial -");
		System.out.println("----------------");
		System.out.println("1. Aniadir alumno");
		System.out.println("2. Mostrar todos alumnos");
		System.out.println("3. Mostrar alumno");
		System.out.println("4. Modificar alumno");
		System.out.println("5. Borrar alumno");
		System.out.println("0. Salir");
		System.out.println(" ");
	}

	/**
	 * Muestra el menu, recoge la opcion del usuario y la retorna. No permitimos al
	 * usuario introducir un valor incorrecto. Los valores correctos son: numero
	 * entero del [0-5]
	 * 
	 * @return la opcion del usuario
	 */
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
		} while ((ret < 0) || (ret > 5));
		return ret;
	}

	/**
	 * Opcion de menu Aniador Alumno. Solicita los datos de un alumno y lo guarda en
	 * el array de alumnos
	 */
	private static void aniadirAlumno() {
		String datosAlumno = pedirAlumno();
		guardarNuevoAlumno(datosAlumno);
	}

	/**
	 * Solicita los datos de un alumno y los devuelve encadenados en formato String
	 * 
	 * @return String de los datos del alumno encadenados
	 */
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

	/**
	 * Introduce el string de los datos del alumno encadenados en el array de
	 * alumnos
	 * 
	 * @param datosAlumno
	 */
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

	/**
	 * Muestra todos los alumnos del array de alumnos
	 */
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

	/**
	 * Pide por teclado el nombre de un alumno y lo retorna
	 * 
	 * @return El nombre del alumno
	 */
	private static String pedirNombreAlumno() {
		String ret = null;
		System.out.print("Dame un nombre: ");
		ret = teclado.nextLine();
		return ret;
	}

	/**
	 * Divide los datos del alumno encadenados y retorna solamente el nombre
	 * 
	 * @param alumno
	 * @return El nombre del alumno
	 */
	private static String getNombreDelAlumno(String alumno) {
		String[] parts = alumno.split(",");
		return parts[0].trim();
	}

	/**
	 * Busca el alumno en el array de alumnos por el nombre. Si lo encuentra, lo
	 * muestra. Si no lo encuentra, da un mensaje de error.
	 * 
	 * @param nombreAlumno
	 */
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

	/**
	 * Busca el alumno en el array de alumnos por el nombre. Si lo encuentra, lo
	 * modifica. Si no lo encuentra, da un mensaje de error.
	 * 
	 * @param nombreAlumno
	 */
	private static void modificarUnAlumno(String nombreAlumno) {
		boolean encontrado = false;

		for (int i = 0; i < arrayAlumnos.length; i++) {

			if (null != arrayAlumnos[i]) {
				String alumno = arrayAlumnos[i];
				String nombreAlu = getNombreDelAlumno(alumno);
				if (nombreAlu.equals(nombreAlumno)) {
					System.out.println("Alumno encontrado!");
					
					String alumnoModificado = pedirAlumno();
					arrayAlumnos[i] = alumnoModificado;
					
					System.out.println("Alumno modificado!");
					encontrado = true;
				}
			}
		}

		if (!encontrado) {
			System.out.println("Alumno no encontrado!");
		}
	}

	/**
	 * Busca el alumno en el array de alumnos por el nombre. Si lo encuentra, lo
	 * borra. Si no lo encuentra, da un mensaje de error.
	 * 
	 * @param nombreAlumno
	 */
	private static void borrarUnAlumno(String nombreAlumno) {
		boolean encontrado = false;

		for (int i = 0; i < arrayAlumnos.length; i++) {

			if (null != arrayAlumnos[i]) {
				String alumno = arrayAlumnos[i];
				String nombreAlu = getNombreDelAlumno(alumno);
				if (nombreAlu.equals(nombreAlumno)) {
					System.out.println("Alumno encontrado!");
					arrayAlumnos[i] = null;
					System.out.println("Alumno eliminado!");
					encontrado = true;
				}
			}
		}

		if (!encontrado) {
			System.out.println("Alumno no encontrado!");
		}
	}

	/**
	 * Main de la clase
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		int opcionMenu = 0;
		String nombreAlumno = null;

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
				nombreAlumno = pedirNombreAlumno();
				visualizarUnAlumno(nombreAlumno);
				break;
			case 4:
				nombreAlumno = pedirNombreAlumno();
				modificarUnAlumno(nombreAlumno);
				break;
			case 5:
				nombreAlumno = pedirNombreAlumno();
				borrarUnAlumno(nombreAlumno);
				break;
			default:
				System.out.println("Esta opcion no deberia salir");
			}

		} while (opcionMenu != 0);
		teclado.close();
	}
}
