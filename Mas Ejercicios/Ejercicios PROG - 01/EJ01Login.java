package correciones;

import java.util.Scanner;

public class EJ01Login {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		String login = "El0rr1eta"; // El unico login valido
		String password = "aa1122bb"; // El unico pass valido

		String myLogin = null;
		String myPassword = null;

		int veces = 0;
		do {

			System.out.println("- LOGIN -");
			System.out.println("---------");
			System.out.print("Dame login: ");
			myLogin = teclado.nextLine().trim(); // trim () - Para quitar los espacios en blanco

			System.out.print("Dame pass: ");
			myPassword = teclado.nextLine().trim();
			System.out.println(" ");

			if (!Character.isUpperCase(myLogin.charAt(0))) {
				// myLogin tiene que empezar por mayuscula
				System.out.println("Formato login erróneo");
				veces++;
			} else if (!(myPassword.matches(".*\\d.*")) || !(myPassword.matches(".*\\D.*"))) {
				// myPassword tiene que tener números y letras
				System.out.println("Formato password erróneo");
				veces++;
			} else if (!(login.equalsIgnoreCase(myLogin)) || !(password.equals(myPassword))) {
				System.out.println("Usuario o password desconocido");
				veces++;
			} else {
				System.out.println("- Wellcome!!! -");
			}
			System.out.println(" ");
		} while (veces < 3);

		System.out.println("Adios!!");
		teclado.close();
	}

}