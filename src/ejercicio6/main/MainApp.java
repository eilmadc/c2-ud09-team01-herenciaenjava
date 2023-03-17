/**
 * 
 */
package ejercicio6.main;

import java.util.Scanner;

import ejercicio6.clases.Cine;
import ejercicio6.clases.Espectador;
import ejercicio6.clases.Pelicula;

/**
 * @author  Team01 (Elena, Palmira, Paul)
 *
 */
public class MainApp {
	Scanner sc = new Scanner(System.in);
	int num[];
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/** TODO: Generar simulacion: 
				 - Muchos espectadores
				 - sentados aletoriamente
				 - espacios disponibles=true
				 - ?duda:sentar a los espectadores de uno en uno 
				 */
		
		/**--Creacion Espectadores --*/
		Espectador espectador1 = new Espectador("Ana", 19, 23);
		Espectador espectador2 = new Espectador("Juan", 34, 65);
		Espectador espectador3 = new Espectador("Alex", 12, 15);
		Espectador espectador4 = new Espectador("Maria", 17, 5);
		
		
		/**--Creacion Peliculas --*/
		Pelicula pelicula1 = new Pelicula("Matrix", 131, 16, "Hermanas Wachowski");
		Pelicula pelicula2 = new Pelicula("The Tree of Life", 133 , 13, "Terrence Malick");
		Pelicula pelicula3 = new Pelicula("Dogville", 177, 16, "LarsVon Trier");
		
		/**--Creacion Cine/sesion--*/
		Cine entrada1 = new Cine();
		//Creo conjunto de asientos y lo inicializo
		entrada1.asientos();
		
		/**--Obtener Tickets--*/
		entrada1.obtenerTicket(pelicula1, espectador1);
		
		
	}

}
