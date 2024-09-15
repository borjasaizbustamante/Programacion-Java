package ejercicio;

import java.util.Scanner;

/**
 * Ejercicios resueltos de la UD3 - Arrays [Avanzado]
 */
public class GestorDeAlumnosEj4 {

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
		System.out.println("6. Insertar nota en alumno");
		System.out.println("7. Modificar nota en alumno");
		System.out.println("8. Borrar nota en alumno");
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
		} while ((ret < 0) || (ret > 8));
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

		System.out.print("Nota por defecto: 0"); // El ejercicio dice que la nota mínima es 0

		ret = nombre + ", " + apellido + ", " + apellido2 + ", " + fecha + ", " + curso + ", " + clase + ", " + 0;

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
	 * Pide por teclado la nota de un alumno y la retorna
	 * 
	 * @return La nota del alumno
	 */
	private static int pedirNotaAlumno() {
		int ret = 0;
		do {
			try {
				System.out.print("Dame una nota: ");
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
	 * Divide los datos del alumno encadenados y retorna solamente la nota
	 * 
	 * @param alumno
	 * @return La nota del alumno
	 */
	private static String getNotaDelAlumno(String alumno) {
		String[] parts = alumno.split(",");
		return parts[6].trim();
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
	 * Busca el alumno en el array de alumnos por el nombre. Si lo encuentra, le
	 * añade una nota. Si no lo encuentra, da un mensaje de error.
	 * 
	 * @param nombreAlumno
	 */
	private static void insertarNotaEnAlumno(String nombreAlumno) {
		boolean encontrado = false;

		for (int i = 0; i < arrayAlumnos.length; i++) {

			if (null != arrayAlumnos[i]) {
				String alumno = arrayAlumnos[i];
				String nombreAlu = getNombreDelAlumno(alumno);
				if (nombreAlu.equals(nombreAlumno)) {
					System.out.println("Alumno encontrado!");

					int nuevaNota = pedirNotaAlumno();
					arrayAlumnos[i] = modificarNotaAlumno(alumno, nuevaNota);

					System.out.print("Nota del alumno insertada!");
					encontrado = true;
				}
			}
		}

		if (!encontrado) {
			System.out.println("Alumno no encontrado!");
		}
	}

	/**
	 * Modifica el valor de la nota de un alumno y lo retorna
	 * 
	 * @param alumno    Datos encadenados del alumno
	 * @param nuevaNota La nota nueva
	 * @return El elumno con la nota modificada
	 */
	private static String modificarNotaAlumno(String alumno, int nuevaNota) {
		String ret = null;
		String[] parts = alumno.split(","); // Cortamos en pedacitos y volvemos a juntar las piezas
		ret = parts[0].trim() + ", " + parts[1].trim() + ", " + parts[2].trim() + ", " + parts[3].trim() + ", "
				+ parts[4].trim() + ", " + parts[5].trim() + ", " + nuevaNota;
		return ret;
	}

	/**
	 * Busca el alumno en el array de alumnos por el nombre. Si lo encuentra,
	 * comprueba si la nota es 0. Si lo es, da un error diciendo que debe insertarla
	 * primero. Si no, le deja modificar la nota. Si no encuentra el alumno, da un
	 * mensaje de error.
	 * 
	 * @param nombreAlumno
	 */
	private static void modificarNotaEnAlumno(String nombreAlumno) {
		boolean encontrado = false;

		for (int i = 0; i < arrayAlumnos.length; i++) {

			if (null != arrayAlumnos[i]) {
				String alumno = arrayAlumnos[i];
				String nombreAlu = getNombreDelAlumno(alumno);
				if (nombreAlu.equals(nombreAlumno)) {
					System.out.println("Alumno encontrado!");

					String notaAlumno = getNotaDelAlumno(alumno);
					if (notaAlumno.equals("0")) {
						System.out.println("Debes insertar una nota primero!");
					} else {
						int nuevaNota = pedirNotaAlumno();
						arrayAlumnos[i] = modificarNotaAlumno(alumno, nuevaNota);
						System.out.print("Nota del alumno modificada!");
					}
					encontrado = true;
				}
			}
		}

		if (!encontrado) {
			System.out.println("Alumno no encontrado!");
		}
	}

	/**
	 * Busca el alumno en el array de alumnos por el nombre. Si lo encuentra, le
	 * pone la nota a 0. Si no lo encuentra, da un mensaje de error.
	 * 
	 * @param nombreAlumno
	 */
	private static void borrarNotaEnAlumno(String nombreAlumno) {
		boolean encontrado = false;

		for (int i = 0; i < arrayAlumnos.length; i++) {

			if (null != arrayAlumnos[i]) {
				String alumno = arrayAlumnos[i];
				String nombreAlu = getNombreDelAlumno(alumno);
				if (nombreAlu.equals(nombreAlumno)) {
					System.out.println("Alumno encontrado!");
					
					arrayAlumnos[i] = modificarNotaAlumno(alumno, 0);
					System.out.print("Nota del alumno borrada!");
					
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
			case 6:
				nombreAlumno = pedirNombreAlumno();
				insertarNotaEnAlumno(nombreAlumno);
				break;
			case 7:
				nombreAlumno = pedirNombreAlumno();
				modificarNotaEnAlumno(nombreAlumno);
				break;
			case 8:
				nombreAlumno = pedirNombreAlumno();
				borrarNotaEnAlumno(nombreAlumno);
				break;
			default:
				System.out.println("Esta opcion no deberia salir");
			}

		} while (opcionMenu != 0);
		teclado.close();
	}
}
