package programa;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Introduzca el nombre");
		String nombre = entrada.next();
		
		System.out.println("Indica el tipo de cliente(VIP, Socio, Normal)");
		String tipo_cliente = entrada.next();
		
		
		if (tipo_cliente.equals("VIP") || tipo_cliente.equals("Socio") || tipo_cliente.equals("Normal") ) {
			System.out.println("Introduzca el importe de la compra");
			double compra = entrada.nextDouble();
		
		
		switch (tipo_cliente) {
		case "VIP":
			compra = (compra * 80)/100;
			System.out.println("El importe que tiene que pagar el cliente " + nombre + " es de " + compra + "€");
			break;
			
		case "Socio":
			compra = (compra * 95)/100;
			System.out.println("El importe que tiene que pagar el cliente " + nombre + " es de " + compra + "€");
			break;
		case "Normal":
			compra = compra;
			System.out.println("El importe que tiene que pagar el cliente " + nombre + " es de " + compra + "€");
			break;
		}
	}
		
		entrada.close();	
	}
}
