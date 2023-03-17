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

	// Metodo para determinar si hay clase o no
	public boolean hayClase() {
		if (!profesor.estaPresente()) {
			System.out.println("El profesor no está. No hay clase");
			return false;
		} else if (!asistenciaEstudiantes()) {
			System.out.println("No hay suficientes alumnos. No hay classe");
			return false;
		} else if (!profesor.getAsignatura().equals(asignatura)) {
			System.out.println("El aula no coincide con la materia del profesor. No se puede hacer clase");
			return false;
		} else {
			System.out.println("Hay clase");
			return true;
		}

	}
	//Recorremos el array y vemos si la asistencia llega al 50%
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
