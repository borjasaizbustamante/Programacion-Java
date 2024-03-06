package ejercicios;

/**
 * Calcula los valores de X, Y y Z que cumplen el Teorema de Pitagoras hasta un
 * valor de Z de 50, teniendo en cuenta que el valor de Y es mayor que el de X,
 * y que los valores cumplen la expresión Z^2 = X^2 + Y^2
 */
public class Ej139 {

	public static void main(String[] args) {

		System.out.println("Teorema de Pitagoras: Z^2 = X^2 + Y^2");

		// Para un rango de valores de Z [1-50]
		for (int z = 1; z < 50; z++) {
			
			// Para cada z, empezamos a dar valores a la Y 
			for (int y = 1; y < 50; y++) {
				
				// Calculamos el valor de la X en base a Z e Y
				// X = sqrt (Y^2 - Z^2)
				double x = Math.sqrt( (y*y) - (z*z));
				
				if (y > x) {
					System.out.println("Valores [z, x, y] = [" + z + ", " + x + ", " + y + "]");
				} else {
					// No nos sirve
				}
			}
		}
	}
}
