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
	private String asignatura;

	/**
	 * @param materia
	 */
	// Constructores
	public Profesor() {
		super();
		super.setEdad(Utils.generarRandom(22, 67));
		asignatura = ASIGNATURAS[Utils.generarRandom(0, 2)];
	}


	// Getters y Setters

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	
	@Override
	// Metodo sobreescrito de la clase abstracta Persona para comprobar asistencia del Profesor
	public boolean estaPresente() {
		int numAleatorio = Utils.generarRandom(0, 100);
		return (numAleatorio < 20 ? false : true);
	}
}
