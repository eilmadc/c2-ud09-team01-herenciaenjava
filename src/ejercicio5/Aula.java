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
	private static int MAX_ESTUDIANTES = 24;
	private static final String[] ASIGNATURAS = { "Matematicas", "Filosofia", "Fisica" };

	private int id;
	private String asignatura;
	private Profesor profesor;
	private Estudiantes[] alumnos;

	// constructor
	public Aula() {
		// Determinamos que hay 5 aulas y la generamos aleatoriamente
		id = Utils.generarRandom(1, 5);
		profesor = new Profesor();
		alumnos = new Estudiantes[MAX_ESTUDIANTES];
		crearAlumnos();
		asignatura = ASIGNATURAS[Utils.generarRandom(0, 2)];
	}

	// Creamos los alumnos del aula

	public void crearAlumnos() {
		for (int i = 0; i < alumnos.length; i++) {
			alumnos[i] = new Estudiantes();
		}
	}

	// metodo para determinar las notas de los alumnos
	public void clasificaciones() {
		// Calcularemos la cantidad de aprobados según el sexo
		int aprobadosH = 0;
		int aprobadosM = 0;
		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i].getCalificacion() >= 5) {
				if (alumnos[i].getSexo() == 'H') {
					aprobadosH++;
				} else {
					aprobadosM++;
				}

			}
			System.out.println(alumnos[i].toString());
		}
		System.out.println("Hay " + aprobadosH + " alumnos aprobados y " + aprobadosM + " alumnas aprobadas.");
	}

	// Metodo para determinar si hay clase o no, lo llamaremos desde el main
	public boolean hayClase() {
		if (!profesor.estaPresente()) {
			System.out.println("El profesor no está. No hay clase");
			return false;
		} else if (!asistenciaEstudiantes()) {
			System.out.println("No hay suficientes alumnos. No hay classe");
			return false;
		} else if (!profesor.getAsignatura().equals(asignatura)) {
			System.out.println(
					"El aula " + getId() + " no coincide con la materia del profesor. No se puede hacer clase");
			return false;
		} else {
			System.out.println("Hay clase en el aula " + getId());
			return true;
		}

	}

	// Recorremos el array y vemos si la asistencia llega al 50%
	private boolean asistenciaEstudiantes() {
		int asistencia = 0;
		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i].estaPresente()) {
				asistencia++;
			}
		}
		System.out.println("Hay " + asistencia + " estudiantes en el aula");
		return asistencia >= ((int) (alumnos.length / 2));
	}

	// Setters y getters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	public Estudiantes[] getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(Estudiantes[] alumnos) {
		this.alumnos = alumnos;
	}

}
