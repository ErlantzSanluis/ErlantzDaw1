package programa;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce tú nombre");
		String nombre = entrada.next();
		
		System.out.println("Introduce las notas de las siguientes asignaturas");
		System.out.println("Inglés");
		double ingles = entrada.nextDouble();
		System.out.println("Mates");
		double mates = entrada.nextDouble();
		System.out.println("Geografía");
		double geografia = entrada.nextDouble();
		System.out.println("Euskera");
		double euskera = entrada.nextDouble();
		System.out.println("Ruso");
		double ruso = entrada.nextDouble();
		
		double media = (ingles + mates + geografia + euskera + ruso)/5;
		
		
		if (ingles < 5 || mates < 5 || geografia < 5 || euskera < 5 || ruso < 5) {
			System.out.println("El alumno " + nombre + " tiene una media de " + media + " y no es apto");
		}else {
			System.out.println("El alumno " + nombre + " tiene una media de " + media + " y es apto");
		}

		entrada.close();	
	}
}
