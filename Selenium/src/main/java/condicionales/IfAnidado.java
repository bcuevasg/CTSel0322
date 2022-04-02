package condicionales;

public class IfAnidado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temperature = 26;

		if (temperature > 15) {
			if (temperature > 25) {
				System.out.println("A la playa");
			} else {
				System.out.println("A la montaña");
			}
		} else {
			System.out.println("A descansar ....");
		}
	}

}
