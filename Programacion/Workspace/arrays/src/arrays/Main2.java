package arrays;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce un n�mero");
		int num1 = entrada.nextInt();
		System.out.println("Introduzca segundo n�mero");
		int num2 = entrada.nextInt();
		System.out.println("Introduzca el tercer n�mero");
		int num3 = entrada.nextInt();
		System.out.println("Introduzca el cuarto n�mero");
		int num4 = entrada.nextInt();
		System.out.println("Introduzca el quinto n�mero");
		int num5 = entrada.nextInt();

		int[] numeros = { num1, num2, num3, num4, num5 };

		int par = 0;
		int impar = 0;
		for (int i = 0; i < numeros.length; i++) {

			if (numeros[i] %2 == 0) {
				System.out.println("El n�mero es par");
			}else {
				System.out.println("El n�mero es impar");
			}
		}
		entrada.close();

	}

}
