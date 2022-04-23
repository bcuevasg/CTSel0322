package modAccesos;

public class b {

	public static void main(String[] args) {
		A objA = new A();
		
		objA.mostrar();// creando objeto de a usando public puede mostrar
		objA.mostrar1(); // usando mostrar1 no se puede debido a que es esta en private ese metodo
	}

}
