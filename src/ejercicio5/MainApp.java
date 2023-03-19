/**
 * 
 */
package ejercicio5;

/**
 * @author Team01 (Elena, Palmira, Paul)
 *
 */
public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Creamos un objeto de tipo Aula y lo instanciamos

		Aula aula1 = new Aula();

		// Comprobamos si realmente se puede dar clase en este aula
		if (aula1.hayClase()) {
			//Y si hay clase mostramos las notas de cada alumno
			aula1.clasificaciones();
		}

	}

}
