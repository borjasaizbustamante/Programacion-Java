package ejercicios;

public class Ejercicio10 {

	public static void main(String[] args) {

		Ejercicio9 ejercicioUno = new Ejercicio9();
		System.out.println(ejercicioUno.toString());

		Ejercicio9 ejercicioDos = new Ejercicio9(7);
		System.out.println(ejercicioDos.toString());

		Ejercicio9 ejercicioTres = new Ejercicio9(10, 20);
		System.out.println(ejercicioTres.toString());

		Ejercicio9 ejercicioCuatro = new Ejercicio9(ejercicioTres);
		System.out.println(ejercicioCuatro.toString());

		System.out.println(ejercicioUno.hashCode());

		if (ejercicioUno.equals(ejercicioDos)) {
			System.out.println("Son iguales");
		} else {
			System.out.println("Son diferentes");
		}

		if (ejercicioUno.compareTo(ejercicioDos) > 0) {
			System.out.println("Es mayor");
		} else if (ejercicioUno.compareTo(ejercicioDos) < 0) {
			System.out.println("Es menor");
		} else
			System.out.println("Son iguales");

		
	}
}
