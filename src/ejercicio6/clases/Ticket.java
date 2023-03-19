/**
 * 
 */
package ejercicio6.clases;

/**
 * @author elena-01
 *
 */
public class Ticket {

	//Atributos
	String nombreEspectador;
	String peliculaTicket;
	String codAsiento;


	/**
	 * @param nombreEspectador
	 * @param peliculaTicket
	 */
	public Ticket(Espectador espectador, Pelicula pelicula) {
		super();
		this.nombreEspectador = espectador.getNombre();
		this.peliculaTicket = pelicula.getTitulo();
	}

	/**
	 * Constructor al que le pasamos por parametro un objeto Espectador, Pelicula, Asiento
	 * 
	 * @param disponible
	 * @param asiento
	 * @param espectador
	 * @param pelicula
	 */
	public Ticket( Asiento asiento, Espectador espectador, Pelicula pelicula) {
		this.codAsiento = asiento.getId();
		this.nombreEspectador =espectador.getNombre();
		this.peliculaTicket = pelicula.getTitulo();
	}
}
