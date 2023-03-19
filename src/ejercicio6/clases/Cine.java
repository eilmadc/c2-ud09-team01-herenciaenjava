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
	// final static int NUMERO_SALAS = 1;
	final static int FILAS = 8;
	final static int COLUMNAS = 9;
	final static double PRECIO = 6;

	// ------- Atributos-------------------

	boolean requisitos;

	// Lista con el conjunto de asientos
	ArrayList<Asiento> conjuntoAsiento = new ArrayList<Asiento>();

	// Lista con el conjunto de Tickets
	ArrayList<Ticket> tickets = new ArrayList<Ticket>();

	// Objetos
	Pelicula pelicula;
	Espectador espectador;
	Asiento asiento;
	Cine cine;

	// ------- Constructores -----------------

	public Cine(Pelicula pelicula, Espectador espectador) {
		asientos();
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

	// Metodo para obtenerEntrada
	public void obtenerTicket(Pelicula pelicula, Espectador espectador) {

		boolean req = false;

		// Si cumple requisitos
		if (cumpleRequisitos(req, pelicula, espectador)) {
			// Verificar si hay espacio disponible
			esDisponible();
		} else
			System.out.println("El usuario no cumple requisitos. No puede comprar entrada.");
	}

	public boolean cumpleRequisitos(boolean req1, Pelicula pelicula, Espectador espectador) {

		/*--Chequea si el espectador tiene dinero para la entrada
		 * si tiene la edad minima de para ver la pelicula
		 * si hay asiento disponible
		 */
		if (espectador.getDinero() >= PRECIO && espectador.getEdad() >= pelicula.getEdadMinima()) {
			req1 = true;
		} else {
			req1 = false;
			if (espectador.getDinero() < PRECIO)
				System.out.println("El espectador no tiene dinero suficiente");
			else
				System.out.println("El espectador no tiene edad minima para ver pelicula");
		}
		return req1;
	}

	// Comprueba si hay algun asiento disponible
	public boolean esDisponible() {

		boolean disponible = false;
		int contadorAsientosDisponibles = 0;

		for (int i = 0; i < FILAS; i++) {
			for (int j = 0; j < COLUMNAS; i++) {
				do {
					if (conjuntoAsiento.get(j).getDisponible()) {
						contadorAsientosDisponibles++;
					}
				} while (!conjuntoAsiento.get(j).getDisponible());
			}
			if (contadorAsientosDisponibles > 0)
				reservaAsiento();
			else
				System.out.println("No hay asientos disponibles");
		}
		return disponible;
	}

	// Obtener posicion (letra-numero) disponible
	// Devuelve posicion asiento disponible
	public String reservaAsiento() {
		String posicion = "";

		for (int i = 0; i < FILAS; i++) {
			for (int j = 0; j < COLUMNAS; i++) {
				do {
					if (conjuntoAsiento.get(j).getDisponible()) {

						tickets.add(new Ticket(asiento, espectador, pelicula));
						
					}
				} while (!conjuntoAsiento.get(j).getDisponible());
			}
		}
		return posicion;
	}
}
