package collection;

public class Profesor implements Persona {

	@Override
	public void andar() {
		System.out.println("Anda dando saltitos");
	}

	@Override
	public void hablar() {
		System.out.println("Habla pedante");
	}
}
