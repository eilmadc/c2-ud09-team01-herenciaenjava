/**
 * 
 */
package ejercicio5;

import java.util.Random;

/**
 * @author Team01 (Elena, Palmira, Paul)
 *
 */
public class Estudiantes extends Persona {

	private double calificacion;

	public Estudiantes() {
		super();
		calificacion = (int) Math.floor(Math.random() * (0 - (10 + 1)) + (10 + 1));
		super.setEdad((int) Math.floor(Math.random() * (12 - (18 + 1)) + (18 + 1)));
	}

	public Estudiantes(String nombre, int edad, char sexo, boolean asistencia, double calificacion) {
		super(nombre, edad, sexo, asistencia);
		this.calificacion = calificacion;
	}

	public double getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}

	/**
	 * @param calificacion
	 */

	@Override
	public boolean estaPresente() {
		return new Random().nextBoolean();
	}

}
