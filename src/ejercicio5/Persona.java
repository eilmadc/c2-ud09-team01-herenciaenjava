/**
 * 
 */
package ejercicio5;

/**
 * @author Team01 (Elena, Palmira, Paul)
 *
 */
public abstract class Persona {

	// Creamos clase superclase Persona con los atributos en común

	private String nombre;
	private int edad;
	private char sexo;
	private boolean asistencia;
	private final String[] NOMBRES = { "Elena", "Paul", "Palmira", "Marc R.", "Marc S.", "Paula", "Roger", "Aitor",
			"Arnau", "Alberto", "Javier", "Josep Maria", "Alejandro", "Camila", "Joan", "Francisco", "Andrea" };

	/**
	 * @param nombre
	 * @param edad
	 * @param sexo
	 */
	public Persona(String nombre, int edad, char sexo, boolean asistencia) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.asistencia = asistencia;

	}

	public Persona() {
		estaPresente();
	}

	public boolean isAsistencia() {
		return asistencia;
	}

	public void setAsistencia(boolean asistencia) {
		this.asistencia = asistencia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public abstract boolean estaPresente();

}
