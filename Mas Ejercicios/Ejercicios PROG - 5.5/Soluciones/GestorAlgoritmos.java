package algoritmos.algoritmos;

/**
 * Esta classe contiene los tres tipos basicos de algoritmos: Bubbleshort,
 * Busqueda Binaria y Busqueda Secuencial
 */
public class GestorAlgoritmos {

	/**
	 * Reordena el array pasado por parametro de menor a mayor
	 * 
	 * @param array
	 */
	public void bubbleShort(int[] array) {
		int temp = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 1; j < (array.length - i); j++) {
				if (array[j - 1] > array[j]) {
					temp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = temp;
				}
			}
		}
	}

	/**
	 * Retorna la posicion del numero indicado en el array mediante el algoritmo de
	 * busqueda secuencial; o -1 si no existe.
	 * 
	 * @param array
	 * @param numero
	 * @return la posicion del numero en el array o -1 si no existe
	 */
	public int busquedaSecuencial(int array[], int numero) {
		int ret = -1;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == numero) {
				ret = i;
				break;
			}
		}
		return ret;
	}

	/**
	 * Retorna la posicion del numero indicado en el array mediante el algoritmo de
	 * busqueda binaria; o -1 si no existe. Si te fijas, el algoritmo hace que se
	 * llame a busquedaBinaria () varias veces seguidas. Esto se llama RECURSION, se
	 * puede hacer pero si no tienes cuidado puedes caer en un bucle infinito que no
	 * termina nunca
	 * 
	 * @param array
	 * @param indiceInferior
	 * @param indiceSuperior
	 * @param numero
	 * @return la posicion del numero en el array o -1 si no existe
	 */
	public int busquedaBinaria(int array[], int indiceInferior, int indiceSuperior, int numero) {
		if (indiceSuperior >= indiceInferior) {
			int medio = indiceInferior + (indiceSuperior - indiceInferior) / 2;

			// El elemento esta 'en medio'
			if (array[medio] == numero)
				return medio;

			// El elemento se busca 'a la izquierda'
			if (array[medio] > numero)
				return busquedaBinaria(array, indiceInferior, medio - 1, numero);

			// El elemento se busca 'a la derecha'
			return busquedaBinaria(array, medio + 1, indiceSuperior, numero);
		}

		// El elemento no existe
		return -1;
	}
}