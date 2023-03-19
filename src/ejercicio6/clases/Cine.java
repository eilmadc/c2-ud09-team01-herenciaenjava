/**
 * 
 */
package ejercicio6.clases;

import java.util.ArrayList;

/**
 * @author Team01 (Elena, Palmira, Paul)
 * 
 *         Clase Java Cine que sólo tiene una sala.
 */
public class Cine {

	// ------- Constantes -----------------
	final static int FILAS = 8;
	final static int COLUMNAS = 9;

	// ------- Atributos-------------------

	// Lista con el conjunto de asientos
	double precio;
	ArrayList<Asiento> conjuntoAsiento = new ArrayList<Asiento>();
	Pelicula pelicula;

	// ------- Constructores -----------------

	public Cine(Pelicula pelicula, double precio) {
		this.pelicula = pelicula;
		this.precio = precio;
		asientos();
	}

	// ------------ Getters y Setters -------------------
	/**
	 * @return the precio
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	/**
	 * @return the conjuntoAsiento
	 */
	public ArrayList<Asiento> getConjuntoAsiento() {
		return conjuntoAsiento;
	}

	/**
	 * @param conjuntoAsiento the conjuntoAsiento to set
	 */
	public void setConjuntoAsiento(ArrayList<Asiento> conjuntoAsiento) {
		this.conjuntoAsiento = conjuntoAsiento;
	}

	/**
	 * @return the pelicula
	 */
	public Pelicula getPelicula() {
		return pelicula;
	}

	/**
	 * @param pelicula the pelicula to set
	 */
	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}

	// ------- Metodos -----------------
	// Conjunto de Asientos mediante una lista ArrayList de la clase Asiento
	public void asientos() {
		for (int i = 0; i < FILAS; i++) {
			for (int j = 0; j < COLUMNAS; j++) {
				conjuntoAsiento.add(new Asiento(i, j));
			}
		}
	}

	// Comprueba si hay algun asiento disponible
	public String esDisponible() {

		boolean asientoDisponible = true;
		int cont = 0;
		// Inicializacion de posicion de asiento random valido a -1
		// En el caso que recorrael conjunto de asientos y no encuentre
		// un asiento disponible, mantendra un valor inferior a 0
		int posicionAleatoria = -1;

		do {
			// Calcula posicion random del arrayList del conjunto de asientos
			// lo guarda en la posicion posicionAleatoria
			posicionAleatoria = (int) ( Math.random() * conjuntoAsiento.size());

			if (conjuntoAsiento.get(posicionAleatoria).getDisponible()) {
				// reservaAsiento();
				conjuntoAsiento.get(posicionAleatoria).setDisponible(false);
				asientoDisponible = false;

			}
			cont++;
		} while (!asientoDisponible && cont < conjuntoAsiento.size());

		// Devuelve el id del asiento en la posicion random, si hay asientos disponibles
		// sino, devolvera ""
		return ((posicionAleatoria >= 0) ? conjuntoAsiento.get(posicionAleatoria).getId() : "");
	}

}
