package operadores;

public class Main {

	public static void main(String[] args) {
		
		/*Operadores aritméticos
			+  SUMAR DOS VALORES
		*/
		int n1 =3;
		int n2 =4;
		int n3 = 6;
		float n4 = 3.5f;
		int n5 = 10;
		float n6 = 19.54894654f;
		int suma = n1+n2;
		
		System.out.println(suma);
		System.out.println(n3+n4);
		/*
			- RESTAR DOS VALORES
		*/
		System.out.println(n5-n6+n1);
		/*
			/  DIVIDIR DOS VALORES
		*/
		System.out.println(n6/n5+n3);
		/*
		 	* MULTIPLICAR DOS VALORES
		 */
		System.out.println(n2*n5/n1);
		/*
			%
			++
		*/
		int n7 = 8;
		n7++;
		System.out.println(n7);
		/*
			--
		*/
		int n8 = 8;
		n8--;
		System.out.println(n8);
		/*
		Operadores lógicos*/
		//&&
		System.out.println(1<0 && 1<2); //false
		//||
		System.out.println(1<0 || 1<2); //true
		//!
		System.out.println(!(1<=0)); //true
		System.out.println(!(1>=0)); //False
		//Operadores de relacionales
		
		/*
		==
		*/
		System.out.println(1 == 1);
		System.out.println(1 == 2);
		/*
		!=
		*/
		System.out.println(1!=1);
		System.out.println(1!=2);
		/*
		>
		*/
		System.out.println(1>0);
		System.out.println(1>1);
		System.out.println(1>2);
		/*
		<
		*/
		System.out.println(1<0);
		System.out.println(1<1);
		System.out.println(1<2);
		/*
		>=
		*/
		System.out.println(1>=0);
		System.out.println(1>=1);
		System.out.println(1>=2);
		/*
		<=
		*/
		System.out.println(1<=0);
		System.out.println(1<=1);
		System.out.println(1<=2);
		/*
		*/
	}

}
