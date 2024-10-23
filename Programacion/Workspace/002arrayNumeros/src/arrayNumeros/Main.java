package arrayNumeros;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un número");
		int num1 = entrada.nextInt();
		System.out.println("Introduzca segundo número");
		int num2 = entrada.nextInt();
		System.out.println("Introduzca el tercer número");
		int num3 = entrada.nextInt();
		System.out.println("Introduzca el cuarto número");
		int num4 = entrada.nextInt();
		System.out.println("Introduzca el quinto número");
		int num5 = entrada.nextInt();

		int[] numeros = { num1, num2, num3, num4, num5 };

		int numeroMayor = 0;

		for (int i = 0; i < numeros.length; i++) {

			if (numeros[i] > numeroMayor) {
				numeroMayor = numeros[i];
			}
		}

		System.out.println("El mayor número mayor es " + numeroMayor);
		entrada.close();
	}

}
