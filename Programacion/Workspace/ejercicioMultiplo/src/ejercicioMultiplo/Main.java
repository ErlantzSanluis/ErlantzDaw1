package ejercicioMultiplo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce un n�mero");
		int resto = 1;
		int numero = entrada.nextInt();
		for (int i = 1; i <= numero; i++) {
			resto = numero % i;
			if (resto == 0)
				System.out.println(numero + " es m�ltiplo de " + i);
		}
		System.out.println("Fin del programa");
		entrada.close();
	} 
}
