package ejercicios;

import java.util.Objects;
import java.util.Scanner;

/**
 * Clase Java que constará de los atributos dia, mes, y año de tipo int además 
 * de los siguientes metodos: 
 * - Un constructor por defecto que tenga como valores por defecto 1 para dia, 1 para mes, y 2016
 * - Un constructor que permita dar valores a cada uno de los atributos de la clase. 
 * - Un constructor copia. 
 * - Setters y Getters 
 * - Método toString que devuelve un String con el formato dia + "/" + mes + "/" + año. Ej: 1/1/2016. 
 * - Métodos equals, hashCode, y compareTo para comparar objetos de la clase. 
 * - Método leer que lea por teclado usando un objeto de la clase Scanner los datos necesarios para crear
 * un objeto de la clase controlando los posibles errores.
 */
public class Ejercicio11 {
	
	private static Scanner teclado = null;
	
	private int dia = 0;
	private int mes = 0;
	private int año = 0;
	
	public Ejercicio11() {
		teclado = new Scanner(System.in);
		dia = 1;
		mes = 1;
		año = 2016;
	}
	
	public Ejercicio11(int dia, int mes, int año) {
		teclado = new Scanner(System.in);
		this.dia = dia;
		this.mes = mes;
		this.año = año;
	}
	
	public Ejercicio11 (Ejercicio11 ejercicio11 ){
		teclado = new Scanner(System.in);
		this.dia = ejercicio11.getDia();
		this.mes = ejercicio11.getMes();
		this.año = ejercicio11.getAño();
	}

	@Override
	public String toString() {
		return dia + "/" + mes + "/" + año;
	}

	@Override
	public int hashCode() {
		return Objects.hash(año, dia, mes);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ejercicio11 other = (Ejercicio11) obj;
		return año == other.año && dia == other.dia && mes == other.mes;
	}

	public int compareTo(Ejercicio11 ejercicio11) {
		if (dia > ejercicio11.getDia())
			return 1;
		else if (dia < ejercicio11.getDia())
			return -1;
		else {
			if (mes > ejercicio11.getMes())
				return 1;
			else if (mes < ejercicio11.getMes())
				return -1;
			else {
				if (año > ejercicio11.getAño())
					return 1;
				else if (año < ejercicio11.getAño())
					return -1;
				else 
					return 0;
			}
		}
	}
	
	public void leer () {
		System.out.print ("Dame el dia: ");
		dia = teclado.nextInt();
		teclado.nextLine();
		System.out.print ("Dame el mes: ");
		mes = teclado.nextInt();
		teclado.nextLine();
		System.out.print ("Dame el año: ");
		año = teclado.nextInt();
		teclado.nextLine();
	}
	
	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}
	
}
