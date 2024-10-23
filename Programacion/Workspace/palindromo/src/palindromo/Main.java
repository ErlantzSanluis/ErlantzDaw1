package palindromo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce un nombre");
		String nombre = entrada.next();
		String nombreAlreves = "";
		for (int i = nombre.length() - 1; i >= 0; i--) {
			nombreAlreves = nombreAlreves + nombre.charAt(i);
		}
		if (nombre.equalsIgnoreCase(nombreAlreves)) {
			System.out.println("La palabra es palíndroma");
		} else {
			System.out.println("La palabra no es palíndroma");
		}

		entrada.close();
	}

}
