/**
 * 
 */
package ejercicio3;

/**
 * @author Team01 (Elena, Palmira, Paul)
 *
 */
public class MainApp {

	public static void main(String[] args) {

		// Creamos 2 objetos tipo libro
		Libro libro1 = new Libro(97884015, "El Nombre del viento", "Patrick Rothfuss", 880);
		Libro libro2 = new Libro(97884663, "IT", "Stephen King", 1504);

		// Los mostramos por pantalla
		System.out.println(libro1.toString());
		System.out.println(libro2.toString());
		
		//Y buscaremos cual de los 2 tiene más páginas. 
		if(libro1.getNumPaginas()<libro2.getNumPaginas()) {
			System.out.println("El libro " + libro2.getTitulo() + " tiene más páginas");
		}else {
			System.out.println("El libro " + libro1.getTitulo() + " tiene más páginas");
		}

	}
}