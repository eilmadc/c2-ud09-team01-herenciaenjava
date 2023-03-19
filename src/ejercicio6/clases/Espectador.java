/**
 * 
 */
package ejercicio6.clases;

/**
 * @author Team01 (Elena, Palmira, Paul)
 *
 */
public class Espectador {

	//------------- Atributos -------------------

	private String nombre;// nombre
	private int edad;// edad
	private double dinero; // dinero
	
	
	//------------ Constructor --------------------
	/**
	 * Constructor por defecto
	 * @param nombre, edad, dinero
	 */
	public Espectador(String nombre, int edad, double dinero) {
		this.nombre=nombre;
		this.edad = edad;
		this.dinero = dinero;
	}
	
	// ------------ Getters --------------------------- 
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
