package arrays;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce la nota de Mates");
		double num1 = entrada.nextDouble();
		System.out.println("Introduzca la nota de Historia");
		double num2 = entrada.nextDouble();
		System.out.println("Introduzca la nota de Geografia");
		double num3 = entrada.nextDouble();
		System.out.println("Introduzca la nota de Programación");
		double num4 = entrada.nextDouble();
		System.out.println("Introduzca la nota de Ingles");	
		double num5 = entrada.nextDouble();
		System.out.println("Introduzca la nota de Analisis");
		double num6 = entrada.nextDouble();
		System.out.println("Introduzca la nota de Programación");
		double num7= entrada.nextDouble();
		System.out.println("Introduzca la nota de Ingles");
		double num8= entrada.nextDouble();
		System.out.println("Introduzca la nota de Lengua");
		double num9 = entrada.nextDouble();
		System.out.println("Introduzca la nota de Euskera");
		double num10 = entrada.nextDouble();
		double[] numeros = { num1, num2, num3, num4, num5 , num6 , num7 , num8 , num9 , num10};

        double suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        
        double media = suma / numeros.length;
        
        System.out.println("La media de las notas es: " + media);
        
        entrada.close();
	}

}
