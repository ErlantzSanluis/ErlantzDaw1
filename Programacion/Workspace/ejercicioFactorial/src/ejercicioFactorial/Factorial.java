package ejercicioFactorial;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce un número");
		int numeroFactorial = entrada.nextInt();

		int resultadoFinal = 1;

		for (int i = 1; i <= numeroFactorial; i++) {
			System.out.println(i);
			resultadoFinal = i * resultadoFinal;
		}
		System.out.println("El resultado es " + resultadoFinal);
		entrada.close();
	}
}
