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
		// Determinamos la nota de los alumnos aleatoriamente
		calificacion = Math.round(Utils.generarRandomReal(0, 10)*100d)/100d;
		// Determinamos la edad de los alumnos entre un rango de edad razonable.
		super.setEdad(Utils.generarRandom(18, 60));
		
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
	//En este caso como la asistencia es del 50% he decidido usar un nextBoolean()
	public boolean estaPresente() {
		return new Random().nextBoolean();
	}

	@Override
	public String toString() {
		return "Estudiante: " + super.getNombre() + ", sexo: " + super.getSexo() + " nota: " + getCalificacion();
	}

}
