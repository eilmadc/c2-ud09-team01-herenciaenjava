/**
 * 
 */
package ejercicio3;

/**
 * @author Team01 (Elena, Palmira, Paul)
 *
 */
public class Libro {
	
	//-------------------- VARIABLES -----------------------
	private int isbn;
	private String titulo;
	private String autor;
	private int numPaginas;
	
	
	//------------------- CONSTRUCTORES --------------------
	
	// Constructor por defecto
	public Libro() {
		
	}
	//Constructor que recibe todos los parametros
	public Libro(int isbn, String titulo, String autor, int numPaginas) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.numPaginas = numPaginas;
	}
	
	//Setters y Getters
	
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getNumPaginas() {
		return numPaginas;
	}
	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}
	
	//Sobreescribimos el metodo toString
	@Override
	public String toString() {
		return "El libro " + titulo + " con ISBN " + isbn + ", creado por el autor " + autor + " tiene " + numPaginas + " páginas.";
	}
	

}
