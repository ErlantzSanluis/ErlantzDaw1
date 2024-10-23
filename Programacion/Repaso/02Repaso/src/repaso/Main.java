package repaso;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("¿De cuántas posiciones quieres crear tu Array?");
        int posiciones = entrada.nextInt();
        int[] numerosArray = new int[posiciones];

        System.out.println("¿Cómo quieres inicializar tu array:");
        System.out.println("   1.- Con ceros");
        System.out.println("   2.- Con números aleatorios del 1 al 100");
        System.out.println("   3.- Insertando los números manualmente.");
        int respuesta = entrada.nextInt();

        if (respuesta == 1) {
            System.out.println("Generando tu array de 0:");
            mostrarArray(numerosArray);
        }
        if (respuesta == 2) {
            arrayRandom(numerosArray);
        }
        if (respuesta == 3) {
            arrayManual(numerosArray, entrada);
        }else {
			System.out.println("Ese valor no entra dentro de los terminos");
		}

        entrada.close(); 
    }

    public static void mostrarArray(int[] numerosArray) {
        System.out.print("[");
        for (int i = 0; i < numerosArray.length; i++) {
            if (i == numerosArray.length - 1) {
                System.out.print(numerosArray[i]);
            } else {
                System.out.print(numerosArray[i] + " , ");
            }
        }
        System.out.println("]");
    }

    public static void arrayRandom(int[] numerosArray) {
        Random random = new Random();
        for (int j = 0; j < numerosArray.length; j++) {
            numerosArray[j] = random.nextInt(100) + 1;
        }
        System.out.println("Generando array de números aleatorios:");
        mostrarArray(numerosArray);
    }

    public static void arrayManual(int[] numerosArray, Scanner entrada) {
        for (int i = 0; i < numerosArray.length; i++) {
            System.out.println("Introduce el número para la posición " + (i + 1) + ":");
            numerosArray[i] = entrada.nextInt();
        }
        System.out.println("Array generado manualmente:");
        mostrarArray(numerosArray);
    }
}
