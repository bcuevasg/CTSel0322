package clasesYMetodos;

public class DemoVehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehiculo minivan = new Vehiculo();
		int rango;

		// Asignar valor a los campos de minivan
		minivan.pasajeros = 9;
		minivan.capacidad = 15;
		minivan.kmh = 20;

		// Calcular el rango asumiendo un tanque lleno
		rango = minivan.capacidad * minivan.kmh;

		System.out.println("La minivan puede llevar " + minivan.pasajeros + " pasajeros con un rango de " + rango + " kilometros");
	}

}
