/**
 * 
 */
package ejercicio6;

import java.util.ArrayList;
import java.util.Hashtable;

/**
 * @author Team01 (Elena, Palmira, Paul)
 *
 */
public class Sala {

	final static int FILAS = 8;
	final static int COLUMNAS = 9;

	// TODO:Atributos
	// numeroDeSala
	private int numeroDeSala;

	/*-- conjuntoAsientos = 8 x 9 --> hashtable:
	key =
	letra:columna
	numero: fila
	disponible= true/false
	--*/
	ArrayList asiento = new ArrayList();
	Hashtable<String, Boolean> conjuntoAsientos = new Hashtable<String, Boolean>();

	// Inicializa array asiento con las letras

	// Añadir posiciones Disponibles en el conjuntoAsientos

	// Metodo emisionPelicula ??

}
