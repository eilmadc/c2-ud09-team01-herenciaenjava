/**
 * 
 */
package ejercicio6;

/**
 * @author elena-01
 *
 */
public class Ticket extends Cine {

	String nombreEspectador;
	String peliculaTicket;
	
	
	/**
	 * @param nombreEspectador
	 * @param peliculaTicket
	 */
	public Ticket(String nombreEspectador, String peliculaTicket) {
		super();
		this.nombreEspectador = nombreEspectador;
		this.peliculaTicket = peliculaTicket;
	}

	/**
	 * Constructor al que le pasamos por parametro la pelicula y el nombre del espectador.
	 * 
	 * @param columna
	 * @param fila
	 * @param disponible
	 */
	public Ticket(char columna, int fila, boolean disponible, String nombre, String pelicula ) {
		super.columna = columna;
		super.fila = fila;
		super.disponible = disponible;
		this.nombreEspectador=nombre;
		this.peliculaTicket=pelicula;
	}

	/**
	 * @return the disponible
	 */
	public boolean isDisponible() {
		return disponible;
	}

	/**
	 * @param disponible the disponible to set
	 */
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

}
