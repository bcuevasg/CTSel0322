package herencia;

public class Triangulo extends DosDimensiones{ //cuando usas extend esto quiere decir que la clase enlistada despues es la padre
	
	String estilo;
	
	double area () {
		return (base * altura) /2;// estas variables se obtienen por clase padre DosDimensiones
	}
	
	void mostrarEstilo() {
		System.out.println("El triangulo es: " + estilo);
	}
}
