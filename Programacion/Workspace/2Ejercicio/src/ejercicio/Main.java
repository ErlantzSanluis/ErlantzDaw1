package ejercicio;

import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
			Scanner entrada = new Scanner(System.in);
				
			System.out.println("Introduce t� n�mero");
			float numero = entrada.nextInt();
			
			System.out.println("Introduce la operaci�n");
			String operacion = entrada.next();
			
			System.out.println("Introduce t� segundo n�mero");
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
			    System.out.println("Operaci�n no v�lida");
			}
			entrada.close();

		}
}
