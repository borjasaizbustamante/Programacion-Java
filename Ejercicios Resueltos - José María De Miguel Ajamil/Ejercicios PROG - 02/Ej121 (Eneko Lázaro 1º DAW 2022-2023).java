package ejercicios;

import java.util.Scanner;

public class Ej123 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);  // Create a Scanner object
	    
		boolean correcto = false;
		int numGuardado =(int) (1+ (Math.random()*100));
		int intento = 1;
		
		do {
			System.out.println("Inserta numero: ");
		    
		    int n = scan.nextInt();
		    
		    if (n == numGuardado) {
		    	
		    	System.out.println("Has acertado");
		    	System.out.println("Tu numero de intentos ha sido: " + intento);
		    	correcto = true;
		    	
		    } else if (n < numGuardado) {
		    	
		    	System.out.println(n + " es menor que el numero guardado");
		    	System.out.println("Es tu intento numero " + intento);
		    	
		    } else {
		    	
		    	System.out.println(n + " es mayor que el numero guardado");
		    	System.out.println("Es tu intento numero " + intento);
		    	
		    }
			
		    intento ++;
		    
		} while (!correcto);
		
		scan.close();

	}

}