/**
 * 
 */
package ejercicio5;

import java.util.Random;

/**
 * @author Team01 (Elena, Palmira, Paul)
 *
 */
public class Utils {

	//Clase creada para poder aprovechar métodos
	
	public static int generarRandom(int min, int max) {
		Random random = new Random();
		int numRandom = random.nextInt(max - min) + min;
		return numRandom;
	}
}
