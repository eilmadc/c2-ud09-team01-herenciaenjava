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

	public double getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}

	/**
	 * @param calificacion
	 */
	public Estudiantes(String nombre, int edad, char sexo, double calificacion) {
		super(nombre, edad, sexo);
		this.calificacion = calificacion;
	}

	@Override
	public boolean asistencia() {
		
		return new Random().nextBoolean();
	}

}
