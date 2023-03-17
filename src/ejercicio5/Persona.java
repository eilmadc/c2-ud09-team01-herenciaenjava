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
	// genero un array de nombres de hombre
	private final String[] NOMBRES_MASCULINOS = { "Paul", "Marc R.", "Marc S.", "Paula", "Roger", "Aitor", "Arnau",
			"Alberto", "Javier", "Josep Maria", "Alejandro", "Joan", "Francisco" };
	// genero un array de nombres de mujer
	private final String[] NOMBRES_FEMENINOS = { "Elena", "Palmira", "Camila", "Andrea" };

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
		// Determinamos aleatoriamente si es hombreo mujer.
		int escogerSexo = Utils.generarRandom(0, 1);
		// 0 = masculino
		if (escogerSexo == 0) {
			nombre = NOMBRES_MASCULINOS[Utils.generarRandom(0, 12)];
			sexo = 'H';
		} else {
			nombre = NOMBRES_FEMENINOS[Utils.generarRandom(0, 3)];
			sexo = 'M';
		}
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

	// Este metodo lo implemntaremos y codificaremos en las clases hijas Estudiante
	// y Profesor
	public abstract boolean estaPresente();

}
