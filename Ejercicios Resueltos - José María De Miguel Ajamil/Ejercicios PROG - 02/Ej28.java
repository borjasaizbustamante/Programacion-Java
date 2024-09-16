package eJUD02;

import java.util.Scanner;

public class Ej28 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		// Codigo de articulo
		System.out.print("Introduce codigo: ");
		String codigo = teclado.nextLine();
		
		// Cantidad
		System.out.print("Introduce cantidad: ");
		int cantidad = teclado.nextInt();
		
		// Precios
		System.out.print("Introduce precio: ");
		double precio = teclado.nextDouble();
		
		// Calcular descuento
		int descuento = 0;
		double precioTotal = 0;
		
		if (cantidad > 100) {
			descuento = 40;
		} else if (cantidad > 25 &&  cantidad <=100) {
			descuento = 20;
		} else if (cantidad > 10 && cantidad <= 25) {
			descuento = 10;
		}
		
		// Calculamos el precio final
		precioTotal = (precio * cantidad);
		precioTotal = precioTotal - (precioTotal * (descuento / 100));
		
		// Mostrar codigo, cantidad, precio, descuento, precio total (con descuento)
		System.out.println("Codigo: " + codigo);
		System.out.println("Cantidad: " + cantidad);
		System.out.println("Precio: " + precio);
		System.out.println("Descuento: " + descuento + "%");
		System.out.println("Precio total: " + precioTotal);
		
		teclado.close();
	}
}
