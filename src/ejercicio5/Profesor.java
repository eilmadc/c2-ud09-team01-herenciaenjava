/**
 * 
 */
package ejercicio5;



/**
 * @author Team01 (Elena, Palmira, Paul)
 *
 */
public class Profesor extends Persona {
	
	private String asignatura;

	/**
	 * @param materia
	 */
	//Constructores
	public Profesor() {
		super();
		super.setEdad(Utils.generarRandom(22, 67));
	}
	public Profesor(String nombre, int edad, char sexo, boolean asistencia, String asignatura) {
		super(nombre, edad, sexo, asistencia);
		this.asignatura = asignatura;
	}
	//Getters y Setters

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	//Metodo sobreescrito de la clase abstracta Persona. 
	@Override
	public boolean estaPresente() {
		int numAleatorio = Utils.generarRandom(0, 100);
		return (numAleatorio < 20 ? false : true);
	}
}
