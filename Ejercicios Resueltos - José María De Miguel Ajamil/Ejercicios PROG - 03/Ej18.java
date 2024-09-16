package ejercicios;

public class Ej18 {

	public static void main(String[] args) {

		// Producto de Matrices. El número de columnas de A es igual que el número de
		// filas de B y que la matriz resultado tiene tantas filas como A y tantas
		// columnas como B

		int[][] matrizA = { { 2, 0, 1 }, { 3, 0, 0 }, { 5, 1, 1 } };
		int[][] matrizB = { { 1, 0, 1 }, { 1, 2, 1 }, { 1, 1, 0 } };
		int[][] matrizResultado = new int[3][3];

		System.out.println("MATRIZ A");
		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA[0].length; j++) {
				System.out.print(matrizA[i][j]);
			}
			System.out.println("");
		}
		System.out.println("");

		System.out.println("MATRIZ B");
		for (int i = 0; i < matrizB.length; i++) {
			for (int j = 0; j < matrizB[0].length; j++) {
				System.out.print(matrizB[i][j]);
			}
			System.out.println("");
		}
		System.out.println("");

		// Cada celda de Resultado se obtiene sumando la multiplicación de los elementos
		// de una fila de A por los de una columna de B.

		// Filas
		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizB[0].length; j++) {
				for (int k = 0; k < matrizA[0].length; k++) {
					matrizResultado[i][j] += matrizA[i][k] * matrizB[k][j];
				}
			}
		}

		// Pintamos el resultado
		System.out.println("MATRIZ RESULTADO");
		for (int i = 0; i < matrizResultado.length; i++) {
			for (int j = 0; j < matrizResultado[0].length; j++) {
				System.out.print(matrizResultado[i][j]);
			}
			System.out.println("");
		}
	}
}
