/**
 * 
 */
package ejercicio6.main;

import ejercicio6.clases.VentaEntradas;

/**
 * @author Team01 (Elena, Palmira, Paul)
 *
 */
public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		//Se abre la venta de entradas para el cine.
		VentaEntradas ventaEntrada = new VentaEntradas();
		
		/**
		 * Mostrar Listado de Tickets
		 */
		ventaEntrada.ticketsToString();
	}


}


