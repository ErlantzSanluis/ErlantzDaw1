package tablaMultiplicadora;


public class Main {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			System.out.println("Las tablas son la siguientes");
			for (int u = 1; u <= 10; u++) {
				System.out.println(i + "x" + u + "=" + i*u);
			}
		}

	}

}
