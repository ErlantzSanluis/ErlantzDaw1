package estructura;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// ESTRUCTURAS CONTROL DE FLUJO
		// condicionales
		Scanner entrada = new Scanner(System.in);
		/*
		 * System.out.println("Introduce tú edad"); int edad = entrada.nextInt();
		 * 
		 * // edad >=18 // acceso permitido if (edad >= 16 && edad< 18) {
		 * System.out.println("Acceso permitido con tutor"); }else if(edad>=18) {
		 * System.out.println("Acceso permitido"); }else {
		 * System.out.println("Acceso denegado");
		 * 
		 * System.out.println("Introduce la inicial del día de la semana"); String dia =
		 * entrada.next(); switch(dia) { case "l": System.out.println("Lunes");
		 * break;//termina un control de flujo case "m": System.out.println("Martes");
		 * break; case "x": System.out.println("Miercoles"); break; case "j":
		 * System.out.println("Jueves"); break; case "v": System.out.println("Viernes");
		 * break; } System.out.println("Fin del programa");
		 */
		// repetitivas
		// for(inicialización;condicion
		/*
		 * System.out.println("Introduce tu nombre"); String nombre = entrada.next();
		 * for (int i = 6; i >= 0; i--) { System.out.println(nombre.charAt(i)); }
		 * entrada.close();
		 */
		Random random = new Random();
		int numeroOculto = random.nextInt(10) + 1; // Genera un número entre 1 y 10
		while (true) {
			System.out.println("Introduce el número");
			// int numeroUsuario = entrada.nextInt();
		//	if (numeroUsuario == numeroOculto) {
				System.out.println("Has acertado");
				break;
			}
			/*int numeroUsuario = 0;
			do {
				System.out.println("Introduce el número");
				numeroUsuario = entrada.nextInt();
			} while (numeroUsuario != numeroOculto);*/
			
			int numeroUsuario = 0;
			do {
				System.out.println("Introduce el número");
				numeroUsuario = entrada.nextInt();
			} while (numeroUsuario != numeroOculto);
		}
	entrada.close(); // Cierra el Scanner
}
