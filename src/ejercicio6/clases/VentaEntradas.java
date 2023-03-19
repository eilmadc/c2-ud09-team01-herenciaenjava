/**
 * 
 */
package ejercicio6.clases;

import java.util.ArrayList;
import java.util.Iterator;

import utils.Utils;
import utils.ColorConsole;

/**
 * @author Team01 (Elena, Palmira, Paul)
 *
 */
public class VentaEntradas {
	private Utils utils = new Utils();
	private ColorConsole cc = new ColorConsole();

	// ------------ Atributos-----------
	private double precio = 6.00;
	// Lista con el conjunto de Espectadores
	private ArrayList<Espectador> espectadores = new ArrayList<Espectador>();
	// Lista con el conjunto de Tickets
	private ArrayList<Ticket> tickets = new ArrayList<Ticket>();

	/** --Creacion Cine/sesion-- */
	private Cine sesionCine;

	public VentaEntradas() {
		// Creacion de sesion de cine con la pelicula y precio
		sesionCine = new Cine(generaPeliculas(), precio);
		// generamos el conjunto de espectadores
		generaEspectadores();

		// Generamos ticket para cada espectador
		Iterator<Espectador> it = espectadores.iterator();
		Espectador element;
		while (it.hasNext()) {
			element = it.next();
			pidoTicket(element);
		}
	}

	/*
	 * Rellena ArrayList de Espectadores
	 */
	public void generaEspectadores() {
		/** --Creacion Espectadores -- */
		espectadores.add(new Espectador("Ana", 19, 23));
		espectadores.add(new Espectador("Juan", 34, 65));
		espectadores.add(new Espectador("Alex", 12, 15));
		espectadores.add(new Espectador("Maria", 17, 5));
	}

	/*
	 * Crea Pelicula
	 */
	public Pelicula generaPeliculas() {
		/** --Creacion Peliculas -- */
		Pelicula pelicula1 = new Pelicula("Matrix", 131, 16, "Hermanas Wachowski");
		// Pelicula pelicula2 = new Pelicula("The Tree of Life", 133, 13, "Terrence
		// Malick");
		// Pelicula pelicula3 = new Pelicula("Dogville", 177, 16, "LarsVon Trier");

		return pelicula1;
	}

	// Metodo para obtenerEntrada por el espectador.
	public void pidoTicket(Espectador espectador) {

		boolean req = false;
		String asientoAsignado;

		// Si cumple requisitos
		if (cumpleRequisitos(req, sesionCine.getPelicula(), espectador)) {
			// Verificar si hay espacio disponible
			asientoAsignado = sesionCine.esDisponible();
			if (!asientoAsignado.isEmpty()) {
				tickets.add(new Ticket(asientoAsignado, espectador, sesionCine.getPelicula()));
			} else {
				utils.mostrarMensajeDialog("No hay asientos disponibles", "Venta Entradas");
			}

		} else
			System.out.println(cc.ANSI_BRED + (espectador.getNombre() + cc.ANSI_RESET)
					+ " no cumple requisitos. No puede comprar entrada");
	}

	/*
	 * Verificacion de requisitos para la compra de una entrada en el cine
	 */
	public boolean cumpleRequisitos(boolean req1, Pelicula pelicula, Espectador espectador) {

		/*--Chequea:
		 * - Si el espectador tiene dinero para la entrada
		 * - Si tiene la edad minima de para ver la pelicula
		 * - Si hay asiento disponible
		 */
		if (espectador.getDinero() >= precio && espectador.getEdad() >= pelicula.getEdadMinima()) {
			req1 = true;
		} else {
			req1 = false;
			if (espectador.getDinero() < precio)
				System.out.print("--> El espectador no tiene dinero suficiente : ");
			else
				System.out.print("--> El espectador no tiene edad minima para ver pelicula : ");
		}
		return req1;
	}

	/*
	 * Impresion de Tickets por pantalla
	 */
	public void ticketsToString() {

		utils.imprimeLinea();
		utils.imprimeLineaMensaje(cc.ANSI_FBGREEN + "TICKETS" + cc.ANSI_RESET);
		utils.imprimeLinea();
		Iterator<Ticket> it = tickets.iterator();
		Ticket element;
		while (it.hasNext()) {
			element = it.next();

			System.out.println(cc.ANSI_BGREEN + (element.toString()) + cc.ANSI_RESET);
		}
	}

	public void imprimirEntradasDisponibles() {
		sesionCine.getConjuntoAsiento();
	}
}