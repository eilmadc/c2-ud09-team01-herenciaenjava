/**
 * 
 */
package ejercicio6;

/**
 * @author Team01 (Elena, Palmira, Paul)
 *
 */
public class Espectador {

	// TODO: Atributos

	private String nombre;// nombre
	private int edad;// edad
	private double dinero; // dinero
	
	/**
	 * 
	 */
	public Espectador(String nombre, int edad, double dinero) {
		this.nombre=nombre;
		this.edad = edad;
		this.dinero = dinero;
	}
	// 
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}
	/**
	 * @return the dinero
	 */
	public double getDinero() {
		return dinero;
	}
}
