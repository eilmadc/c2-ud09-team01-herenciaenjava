/**
 * 
 */
package ejercicio2;

/**
 * @author Team01 (Elena, Palmira, Paul)
 *
 */
public class Serie implements Entregable{
	
	protected final static int TEMPORADAS_BASE = 3;
	protected final static boolean ENTREGADO_BASE = false;

	protected String titulo;
	protected int numeroTemporadas;
	protected boolean entregado;
	protected String genero;
	protected String creador;

	public Serie() {
		this.titulo = "";
		this.numeroTemporadas = TEMPORADAS_BASE;
		this.entregado = ENTREGADO_BASE;
		this.genero = "";
		this.creador = "";
	}

	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.numeroTemporadas = TEMPORADAS_BASE;
		this.entregado = ENTREGADO_BASE;
		this.genero = "";
		this.creador = "";
	}

	public Serie(String titulo, int numeroTemporadas, String genero, String creador) {
		this.titulo = titulo;
		this.numeroTemporadas = numeroTemporadas;
		this.genero = genero;
		this.creador = creador;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumeroTemporadas() {
		return numeroTemporadas;
	}

	public void setNumeroTemporadas(int numeroTemporadas) {
		this.numeroTemporadas = numeroTemporadas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
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
	
	//Comparamos la serie con el mayor número de temporadas
	public String compareTo(Object a) {
		Serie serie = (Serie) a;
        if (this.numeroTemporadas > serie.getNumeroTemporadas()) {
            return "mayor";
        } else if (this.numeroTemporadas < serie.getNumeroTemporadas()) {
            return "menor";
        } else {
            return "igual";
        }
	}

	@Override
	public String toString() {
		return "SERIE: "
				+ "\n- Título: " + titulo
				+ "\n- Número de temporadas: " + numeroTemporadas
				+ "\n- Entregado: " + entregado
				+ "\n- Género: " + genero
				+ "\n- Creador: " + creador
				+ "\n---------------------";
	}
	
}
