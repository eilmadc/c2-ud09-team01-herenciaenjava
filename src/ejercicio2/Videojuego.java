/**
 * 
 */
package ejercicio2;

/**
 * @author Team01 (Elena, Palmira, Paul)
 *
 */
public class Videojuego implements Entregable{
	
	// ------------ CONSTANTES ---------------
	protected final static double HORAS_ESTIMADAS_BASE = 10;
	protected final static boolean ENTREGADO_BASE = false;
	
	// ------------ VARIABLES ----------------
	protected String titulo;
	protected double horasEstimadas;
	protected boolean entregado;
	protected String genero;
	protected String compañia;
	
	// ------------ CONSTRUCTORES ------------
	
	// Constructor por defecto
	public Videojuego() {
		this.titulo = "";
		this.horasEstimadas = HORAS_ESTIMADAS_BASE;
		this.entregado = ENTREGADO_BASE;
		this.genero = "";
		this.compañia = "";
	}
	
	// Constructor con 2 parametros de entrada (titulo, horasEstimadas) y el resto por defecto
	public Videojuego(String titulo, double horasEstimadas) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
	}
	
	// Constructor con todos los parametros
	public Videojuego(String titulo, double horasEstimadas, String genero, String compañia) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.genero = genero;
		this.compañia = compañia;
	}
	
	// -------------------- MÉTODOS ------------------------
	
	// Comparamos los diferentes videojuegos
	// Nos quedamos con el videojuego con más horas estimadas
	public String compareTo(Object a) {
		Videojuego videojuego = (Videojuego) a;
        if (this.horasEstimadas > videojuego.horasEstimadas) {
            return "mayor";
        } else if (this.horasEstimadas < videojuego.horasEstimadas) {
            return "menor";
        } else {
            return "igual";
        }
	}

	// -------------------- GETTERS Y SETTERS ------------------------
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getHorasEstimadas() {
		return horasEstimadas;
	}

	public void setHorasEstimadas(double horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCompañia() {
		return compañia;
	}

	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}
	
	public void entregar() {
		entregado = true;
	}

	public void devolver() {
		entregado = false;
	}

	public boolean isEntregado() {
		if (entregado) {
			return true;
		}
		return false;
	}

	// Sobreescribimos el método toString
	@Override
	public String toString() {
		return "Videojuego:" 
				+ "\n- Título: " + titulo
				+ "\n- Horas estimadas: " + horasEstimadas
				+ "\n- Entregado: " + entregado
				+ "\n- Genero: " + genero
				+ "\n- Compañía: " + compañia
				+ "\n---------------------";
	}
	
}
