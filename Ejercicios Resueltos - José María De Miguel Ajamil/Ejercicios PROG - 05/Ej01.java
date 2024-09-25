package ejercicios;

/**
 * Clase recuento. No importa cuantas veces hagamos un objeto nuevo (new
 * Recuento()) ya que, al ser su variable static, solo habrá una copia de ella
 * en memoria. Por tanto, siempre que hagamos setRecuento () o recuento ++ en un
 * objeto, se cambiara para TODOS los objetos
 */
public class Ejercicio1 {

	// Esta variable es comun para todos los objetos de la clase Recuento
	private static int recuento = 0;

	// Cada vez que hacemos un new Recuento() se incrementa el contador en +1. Como
	// es static, se cambia en todos los objetos
	public Ejercicio1() {
		recuento++;
	}

	public static int getRecuento() {
		return recuento;
	}

	public static void setRecuento(int recuento) {
		Ejercicio1.recuento = recuento;
	}

	public static void main(String[] args) {

		// Primer objeto
		Ejercicio1 recuentoUno = new Ejercicio1();
		System.out.println("Numero de Objetos Recuento en memoria: " + Ejercicio1.getRecuento());

		// Segundo objeto
		Ejercicio1 recuentoDos = new Ejercicio1();
		System.out.println("Numero de Objetos Recuento en memoria: " + Ejercicio1.getRecuento());

		// Objeto objeto
		Ejercicio1 recuentoTres = new Ejercicio1();
		System.out.println("Numero de Objetos Recuento en memoria: " + Ejercicio1.getRecuento());

		// ¿Vale lo mismo si accedemos por un objeto que por otro?
		if ((recuentoUno.getRecuento() - recuentoDos.getRecuento() == 0)
				&& ((recuentoDos.getRecuento() - recuentoTres.getRecuento() == 0))) {
			System.out.println("Los tres son iguales");
		} else {
			System.out.println("Son diferentes!");
		}

	}

}
