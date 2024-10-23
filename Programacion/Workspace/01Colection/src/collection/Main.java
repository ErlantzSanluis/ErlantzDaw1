package collection;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Persona p1 = new Profesor();
		Persona p2 = new Profesor();

		String[] dias = new String[7];

		dias[0] = "Lunes";

		System.out.println(dias[0]);

		System.out.println();

		for (int i = 0; i < dias.length; i++) {
			System.out.println(dias[i]);

		}

		ArrayList<String> lista = new ArrayList<>();

		lista.add("Erlantz");
		lista.add("Alberto");

		lista.get(0);

		System.out.println(lista.get(0));

		lista.remove(0);

		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(0));
		}

	}
}
