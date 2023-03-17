/**
 * 
 */
package ejercicio5;

/**
 * @author Team01 (Elena, Palmira, Paul)
 *
 */
public class Aula {

	// Creo una constante para determinar el maximo de alumnos en una clase
	private static int MAX_ESTUDIANTES = 20;
	public static final String[] ASIGNATURAS = { "Matematicas", "Filosofia", "Fisica" };

	private int id;
	private String asignatura;
	private Profesor profesor;
	private Estudiantes[] alumnos;

	// constructor
	public Aula() {
		profesor = new Profesor();
		alumnos = new Estudiantes[MAX_ESTUDIANTES];
		asignatura = ASIGNATURAS[Utils.generarRandom(0, 2)];
	}

	// Creamos los alumnos del aula

	public void crearAlumnos() {
		for (int i = 0; i < alumnos.length; i++) {
			alumnos[i] = new Estudiantes();
		}
	}

	public boolean asistenciaEstudiantes() {
		int asistencia = 0;
		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i].estaPresente()) {
				asistencia++;
			}
		}
		System.out.println("Hay " + asistencia + " estudiantes en el aula");
		return asistencia >= ((int) (alumnos.length / 2));
	}

}
