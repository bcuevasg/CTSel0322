package herencia;

public class lados {

	public static void main(String[] args) {
		Triangulo t1 = new Triangulo();

		t1.base = 7.0;
		t1.altura = 3.0;
		t1.estilo = "Estilo 1";

		System.out.println("Informacion  para T1: ");
		t1.mostrarEstilo();
		t1.mostrarDimension();

		System.out.println("El Area es: " + t1.area());

		System.out.println();

		Triangulo t2 = new Triangulo();

		t2.base = 9.0;
		t2.altura = 10.0;
		t2.estilo = "Estilo 4";

		System.out.println("Informacion  para T1: ");
		t2.mostrarEstilo();
		t2.mostrarDimension();

		System.out.println("El Area es: " + t2.area());
	}

}
