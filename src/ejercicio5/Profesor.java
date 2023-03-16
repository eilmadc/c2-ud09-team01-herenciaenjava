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

	private String materia;

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	/**
	 * @param materia
	 */
	public Profesor(String nombre, int edad, char sexo, String materia) {
		super(nombre, edad, sexo);
		this.materia = materia;
	}

	@Override
	public boolean asistencia() {
		int numAleatorio = (int) Math.floor(Math.random() * (0 - (100 + 1)) + (100 + 1));
		return (numAleatorio < 20 ? false : true);
	}
}
