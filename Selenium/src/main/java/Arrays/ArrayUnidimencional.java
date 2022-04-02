package Arrays;

public class ArrayUnidimencional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Abajo son las formas de declarar Array
		//int intArray[];
		//int[] intArray2;
		//long longArray[];

		// Declara un array de strings
		String[] arr;

		// asignando memoria para 5 posiciones
		arr = new String[5];

		// inicializa el primer elemento del array
		arr[0] = "cero";

		// inicializa el segundo elemento del array
		arr[1] = "uno";

		// sucesivamente
		arr[2] = "dos";
		arr[3] = "tres";
		arr[4] = "cuatro";

		System.out.println("El elemento en la pisicion 2 es: " + arr[1]);
		for (int i = 0; i < arr.length; i++) {
			System.out.println("El elemento en el momento es: " + arr[i]);
		}

		System.out.println();// separador de lineas

		/// Otra forma de declarar la parte de arriba seria losiguiente(esta es la foma
		/// mas comun de verlo

		String[] sArray = new String[] { "uno", "dos", "tres" };
		for (int i = 0; i < sArray.length; i++) {
			System.out.println("Nueva forma el valor en el arreglo es: " + sArray[i] + " para la pocision: " + i);
		}

	}

}
