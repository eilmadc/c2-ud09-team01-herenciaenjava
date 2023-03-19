/**
 * 
 */
package ejercicio6.clases;

/**
 * @author elena-01
 *
 */
public class Asiento {
	//-----------Constantes-------------
	final static int CONVERSION_ASCII = 65;

	//-----------Atributos-------------
	String id;
	Boolean disponible;

	/**
	 * Constructor por defecto
	 * 
	 * @param id
	 * @param disponible
	 */
	public Asiento(String id, Boolean disponible) {
		super();
		this.id = id;
		this.disponible = true;
	}

	/**
	 * Constructor con fila y columna
	 * 
	 * @param id
	 * @param disponible
	 */
	public Asiento(int fila, int columna) {
		super();
		//Para realizar la conversion a letra char sumamos 65 que se corresponde
		//al valor "A" de la tabla ASCII
		this.id = "" + fila + (char) (columna+CONVERSION_ASCII);
		this.disponible = true;
	}

	// ---------Getters y Setters----------
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the disponible
	 */
	public Boolean getDisponible() {
		return disponible;
	}

	/**
	 * @param disponible the disponible to set
	 */
	public void setDisponible(Boolean disponible) {
		this.disponible = disponible;
	}

}
