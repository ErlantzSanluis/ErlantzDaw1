package repaso;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("¿De cuantas posiciones quieres crear tu Array?");
		int posiciones;
		posiciones = entrada.nextInt();
		
		
		int[] numerosArray = new int [posiciones];
		
		mostrarArray(numerosArray);
		
		System.out.print("]");
		entrada.close();
	}

	private static void mostrarArray(int[] numerosArray) {
		System.out.print("Tu Array de [");
		for (int i = 0; i < numerosArray.length; i++) {
				if (i == numerosArray.length - 1) {
					System.out.print(numerosArray[i]);
				}else {
					System.out.print(numerosArray[i] +  " , ");
				}
			}
	}

}
