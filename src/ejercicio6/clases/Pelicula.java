/**
 * 
 */
package ejercicio6.clases;

/**
 * @author Team01 (Elena, Palmira, Paul)
 *
 */
public class Pelicula {

	// Atributos
	private String titulo = "";
	private int duracion = 0; // minutos
	private int edadMinima;
	private String director = "";

	// Constructor
	/**
	 * @param titulo
	 * @param duracion
	 * @param edadMinima
	 * @param director
	 */
	public Pelicula(String titulo, int duracion, int edadMinima, String director) {
		super();
		this.titulo = titulo;
		this.duracion = duracion;
		this.edadMinima = edadMinima;
		this.director = director;
	}

	// ------------------ Getters ----------------------------
	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @return the duracion
	 */
	public int getDuracion() {
		return duracion;
	}

	/**
	 * @return the edadMinima
	 */
	public int getEdadMinima() {
		return edadMinima;
	}

	/**
	 * @return the director
	 */
	public String getDirector() {
		return director;
	}

}
