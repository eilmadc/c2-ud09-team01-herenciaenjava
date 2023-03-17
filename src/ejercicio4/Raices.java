/**
 * 
 */
package ejercicio4;

/**
 * @author Team01 (Elena, Palmira, Paul)
 *
 */
public class Raices {

	private double a, b, c;

	public Raices(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double getDiscriminante() {
		double discriminante = Math.pow(b, 2) - (4 * a * c);
		return discriminante;
	}

	// El enunciado dice que si el discriminante es mayor o igual a 0 tiene 2
	// soluciones, es decir, true;
	// He decidido que el enunciado debia estar mal. Cambio y pongo que la condición sea mayor a 0.
	public boolean tieneRaices() {
		return this.getDiscriminante() > 0;

	}

	// El enunciado ahora dice que si es igual a 0 tiene 1 solución, el enunciado se
	// contradice...
	public boolean tieneRaiz() {
		return this.getDiscriminante() == 0;
	}
	
	//Comprobamos si el problema tiene 1 raíz, 2 o ninuna
	public void calcular() {
		if (tieneRaices()) {
			obtenerRaices();
		} else if (tieneRaiz()) {
			obtenerRaiz();
		} else {
			System.out.println("No existe solución");
		}

	}
	
	//Si el problema tiene 2 raíces las calculamos y mostramos
	public void obtenerRaices() {
		double solucionPositiva = (-b + (Math.sqrt(getDiscriminante()))) / (2 * a);
		double solucionNegativa = (-b - (Math.sqrt(getDiscriminante()))) / (2 * a);
		System.out.println("Tiene 2 soluciones reales: ");
		System.out.println("Solución 1: " + solucionPositiva);
		System.out.println("Solución 2: " + solucionNegativa);
	}
	
	//Si el problema tiene 1 raíz la calculamos y mostramos
	public void obtenerRaiz() {
		double solucionUnica = (-b + (Math.sqrt(getDiscriminante()))) / (2 * a);
		System.out.println("Tiene una solución: ");
		System.out.println(solucionUnica);
	}

}
