/**
 * 
 */
package ejercicio6;

import java.util.ArrayList;

/**
 * @author Team01 (Elena, Palmira, Paul)
 * 
 *         Clase Java Cine que sólo tiene una sala.
 */
public class Cine {

	// Constantes
	final static int NUMERO_SALAS = 1;
	final static int FILAS = 8;
	final static int COLUMNAS = 9;

	// Atributos
	protected char columna = 'A';
	protected int fila;
	protected boolean disponible = true;

	// Atributos

	double precio;
	Pelicula pelicula;
	Espectador espectador;

	boolean requisitos;

	ArrayList<Ticket> conjuntoAsiento = new ArrayList<Ticket>();

	// Inicializa array asiento con las letras, y reseteo a true
	public void asientos() {
		for (int i = 0; i < FILAS; i++) {
			for (int j = 0; j < COLUMNAS; i++) {
				char jString = (char) j;
				conjuntoAsiento.add(new Ticket(jString, i, true, "", ""));
			}
		}
	}

	// metodo obtener Ticket sala-pelicula-espectador
	public boolean obtenerTicket(Pelicula pelicula, Espectador espectador) {

		boolean req1 = false;

		/*--Chequea si el espectador tiene dinero para la entrada
		 * si tiene la edad minima de para ver la pelicula
		 * si hay asiento disponible
		 */
		req1 = (espectador.getDinero() >= precio && espectador.getEdad() >= pelicula.getEdadMinima() && esDisponible())
				? requisitos
				: !requisitos;

		//Si cumple requisitos
		if (re1) {
			//Verificar si hay espacio disponible
			if(esDisponible()){
				
					
			};
			
		} else {
			

		}

		// (sala)

		return requisitos;
	}

	// Comprueba si hay algun asiento disponible
	public boolean esDisponible() {

		boolean disponible = false;

		for (int i = 0; i < FILAS; i++) {
			for (int j = 0; j < COLUMNAS; i++) {
				do {
					if (conjuntoAsiento.get(j).isDisponible()) {
						disponible = true;
					}
				} while (!conjuntoAsiento.get(j).isDisponible());
			}
		}
		return disponible;
	}

	// Obtener posicion (letra-numero) disponible
	// Devuelve posicion asiento disponible
	public String posicionDisponible() {
		String posicion = "";

		for (int i = 0; i < FILAS; i++) {
			for (int j = 0; j < COLUMNAS; i++) {
				char jString = (char) j;
				do {
					if (conjuntoAsiento.get(j).isDisponible()) {

						posicion = ("" + jString + i);
						System.out.println(posicion);
					}
				} while (!conjuntoAsiento.get(j).isDisponible());
			}
		}
		return posicion;
	}
}
