package evaluacion1;

/**
 * Calcula los 100 primeros numeros primos
 */
public class 122 {

	public static void main(String[] args) {

		for (int i = 0; i <100; i++) {
			int contador = 2;
			boolean primo = true;
			while ((primo) && (contador != i)) {
				if (i % contador == 0)
					primo = false;
				contador++;
			}
			if (primo) {
				System.out.println(i);
			}
		}

	}
}
