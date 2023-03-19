/**
 * 
 */
package ejercicio6.clases;

/**
 * @author @author Team01 (Elena, Palmira, Paul)
 *
 */
public class Ticket {

	// --------------- Atributos ------------------
	private Espectador espectador;
	private Pelicula pelicula;
	private String codAsiento;

	
	
	// --------------- Constructores ------------------
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
		return "\n ----------------------------------------"+
				"--     TICKET : Sala 01     --" + 
				"\n Espectador :" + espectador.getNombre() +
				"\n Pelicula : " + pelicula.getTitulo().toUpperCase() +
				"\n Director : " + pelicula.getDirector()+
				"\n Duracion : " + pelicula.getDuracion()+
				"\n Edad Minima : " + pelicula.getEdadMinima()+
				"\n--      PATIO: " + codAsiento + "     --"+ 
				"\n ----------------------------------------";
	}

}
