/**
 * 
 */
package ejercicio5;

import java.util.Random;

/**
 * @author Team01 (Elena, Palmira, Paul)
 *
 */
public class Profesor extends Persona {
	public static final String[] ASIGNATURAS = { "Matematicas", "Filosofia", "Fisica" };
	private String materia;

	/**
	 * @param materia
	 */
	public Profesor(String nombre, int edad, char sexo, String materia) {
		super(nombre, edad, sexo);
		this.materia = materia;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	@Override
	public boolean asistencia() {
		int numAleatorio = (int) Math.floor(Math.random() * (0 - (100 + 1)) + (100 + 1));
		return (numAleatorio < 20 ? false : true);
	}
}
