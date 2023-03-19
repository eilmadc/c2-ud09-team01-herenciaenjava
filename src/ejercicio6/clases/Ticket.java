/**
 * 
 */
package ejercicio6.clases;
/**
 * @author @author Team01 (Elena, Palmira, Paul)
 *
 */
public class Ticket {

	// Atributos
	Espectador espectador;
	Pelicula pelicula;
	String codAsiento;

	/**
	 * @param nombreEspectador
	 * @param peliculaTicket
	 */
	public Ticket(Espectador espectador, Pelicula pelicula) {
		super();
		this.espectador = espectador;
		this.pelicula = pelicula;
	}

	/**
	 * Constructor al que le pasamos por parametro un objeto Espectador, Pelicula,
	 * Asiento
	 * 
	 * @param disponible
	 * @param asiento
	 * @param espectador
	 * @param pelicula
	 */
	public Ticket(String asiento, Espectador espectador, Pelicula pelicula) {
		this.codAsiento = asiento;
		this.espectador = espectador;
		this.pelicula = pelicula;
	}

	@Override
	public String toString() {
		return "Ticket [espectador=" + espectador.getNombre() + ", pelicula=" + pelicula.getTitulo() + ", codAsiento="
				+ codAsiento + "]";
	}

}
