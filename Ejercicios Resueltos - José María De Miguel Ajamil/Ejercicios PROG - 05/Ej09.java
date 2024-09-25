package ejercicios;

import java.util.Objects;
import java.util.Scanner;

/**
 * Crea una clase que consta de dos atributos de tipo int numerador y
 * denominador y de los siguientes metodos: 
 * - Un constructor por defecto que tenga como valores por defecto 0 para el numerador y 1 para el denominador. 
 * - Un constructor que permita dar valores a cada uno de los atributos de la clase. 
 * - Un constructor que permita dar valor sólo al numerador. 
 * - Un constructor copia. 
 * - Setters y Getters 
 * - Método toString que devuelve un String con el formato numerador + "/" + denominador. Ej: 2/3 
 * - Métodos equals, hashCode, y compareTo para comparar objetos de la clase. 
 * - Método leer que lea por teclado usando un objeto de la clase Scanner los datos
 * necesarios para crear un objeto de la clase controlando los posibles errores.
 */
public class Ejercicio9  implements Comparable<Ejercicio9>{

	private static Scanner teclado = null;
	
	private int numerador = 0;
	private int denominador = 0;

	public Ejercicio9() {
		teclado = new Scanner(System.in);
		numerador = 0;
		denominador = 1;
	}

	public Ejercicio9(int numerador) {
		teclado = new Scanner(System.in);
		numerador = 0;
	}

	public Ejercicio9(int numerador, int denominador) {
		teclado = new Scanner(System.in);
		this.numerador = numerador;
		this.denominador = denominador;
	}

	public Ejercicio9(Ejercicio9 ejercicio9) {
		teclado = new Scanner(System.in);
		numerador = ejercicio9.getNumerador();
		denominador = ejercicio9.getDenominador();
	}

	@Override
	public int hashCode() {
		return Objects.hash(denominador, numerador);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ejercicio9 other = (Ejercicio9) obj;
		return denominador == other.denominador && numerador == other.numerador;
	}

	@Override
	public int compareTo(Ejercicio9 ejercicio9) {
		if (numerador > ejercicio9.getNumerador())
			return 1;
		else if (numerador < ejercicio9.getNumerador())
			return -1;
		else {
			if (denominador > ejercicio9.getDenominador())
				return 1;
			else if (denominador < ejercicio9.getDenominador())
				return -1;
			else 
				return 0;
		}
	}
	
	@Override
	public String toString() {
		return numerador + "/" + denominador;
	}

	public void leer () {
		System.out.print ("Dame el numerador: ");
		numerador = teclado.nextInt();
		teclado.nextLine();
		System.out.print ("Dame el numerador: ");
		denominador = teclado.nextInt();
		teclado.nextLine();
	}
	
	public int getNumerador() {
		return numerador;
	}

	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}

	public int getDenominador() {
		return denominador;
	}

	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
