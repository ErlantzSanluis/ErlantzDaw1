package arrays;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[][] matriz = new int[3][3];

		System.out.println("Introduce los n�meros de la matriz");

		for (int fila = 0; fila < matriz.length; fila++) {
			for (int col = 0; col < matriz[fila].length; col++) {
				matriz[fila][col] = entrada.nextInt();
			}
		}
		/*
		 * for(int fila=0;fila<matriz.length;fila++) { for (int col = 0; col <
		 * matriz.length; col++) { System.out.print(matriz[fila][col] + "   "); }
		 * System.out.println(); }
		 */

		for (int fila = 0; fila < matriz.length; fila++) {
			int sumaFila = 0;
			for (int col = 0; col < matriz[fila].length; col++) {
				sumaFila = sumaFila + matriz[fila][col];

			}
			System.out.println("La suma de la fila " + fila + " es " + sumaFila);
		}
		for (int col = 0; col < 3; col++) {
			int sumaColumna = 0;
			for (int fila = 0; fila < 3; fila++) {
				sumaColumna = sumaColumna + matriz[fila][col];
			}
			System.out.println("La suma de la columna " + col + " es " + sumaColumna);
		}
	}

}
