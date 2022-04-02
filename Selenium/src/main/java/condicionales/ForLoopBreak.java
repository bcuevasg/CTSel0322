package condicionales;

public class ForLoopBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int x = 1; x <= 10; x++) {
			System.out.println("El Valor de X es:" + x);
			if (x == 7) {
				break;
			}

		}
		System.out.println("El ciclo esta completo");
	}

}
