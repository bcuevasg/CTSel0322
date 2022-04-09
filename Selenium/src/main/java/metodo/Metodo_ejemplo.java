package metodo;

public class Metodo_ejemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int resultado = suma(14, 9);
		int resultado2 = suma(10, 3, 5);

		System.out.println(resultado);
		System.out.println(resultado2);

		String marca = carro(2);

		System.out.println(marca);
	}

	public static int suma(int a, int b) {
		int c = a + b;
		return c;
	}

	public static int suma(int a, int b, int c) {
		int d = a + b + c;
		return d;
	}

	public static String carro(int a) {
		String[] cars = { "volvo", "BMW", "Ford", "mazda" };
		return cars[a];
	}
}
