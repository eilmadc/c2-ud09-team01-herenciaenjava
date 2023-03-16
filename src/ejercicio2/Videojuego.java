/**
 * 
 */
package ejercicio2;

/**
 * @author Team01 (Elena, Palmira, Paul)
 *
 */
public class Videojuego implements Entregable{
	
	protected final static double HORAS_ESTIMADAS_BASE = 10;
	protected final static boolean ENTREGADO_BASE = false;
	
	protected String titulo;
	protected double horasEstimadas;
	protected boolean entregado;
	protected String genero;
	protected String compañia;
	
	public Videojuego() {
		this.titulo = "";
		this.horasEstimadas = HORAS_ESTIMADAS_BASE;
		this.entregado = ENTREGADO_BASE;
		this.genero = "";
		this.compañia = "";
	}
	
	public Videojuego(String titulo, double horasEstimadas) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
	}
	
	public Videojuego(String titulo, double horasEstimadas, String genero, String compañia) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.genero = genero;
		this.compañia = compañia;
	}

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
