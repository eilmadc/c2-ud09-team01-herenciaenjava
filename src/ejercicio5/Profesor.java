/**
 * 
 */
package ejercicio5;



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
	public Profesor(String nombre, int edad, char sexo, boolean asistencia, String materia) {
		super(nombre, edad, sexo, asistencia);
		this.materia = materia;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	@Override
	public boolean estaPresente() {
		int numAleatorio = Utils.generarRandom(0, 100);
		return (numAleatorio < 20 ? false : true);
	}
}
