package ejercicio;

import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
			Scanner entrada = new Scanner(System.in);
				
			System.out.println("Introduce tú número");
			float numero = entrada.nextInt();
			
			System.out.println("Introduce la operación");
			String operacion = entrada.next();
			
			System.out.println("Introduce tú segundo número");
			float numero2 = entrada.nextInt();
			
			if(operacion.equals("+")) {
			    System.out.println(numero + numero2);
			} else if(operacion.equals("-")) {
			    System.out.println(numero - numero2);
			} else if(operacion.equals("*")) {
			    System.out.println(numero * numero2);
			} else if(operacion.equals("/")) {
			    System.out.println(numero / numero2);
			} else {
			    System.out.println("Operación no válida");
			}
			entrada.close();

		}
}
