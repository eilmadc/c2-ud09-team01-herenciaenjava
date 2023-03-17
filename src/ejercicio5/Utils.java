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

	// Clase creada para poder aprovechar métodos

	//Metodo para generar numeros enteros aleatorios
	public static int generarRandom(int min, int max) {
		Random random = new Random();
		int numRandom = random.nextInt(max - min) + min;
		return numRandom;
	}

	//Metodo para generar numeros reales aleatorios
	public static double generarRandomReal(double min, double max) {
		Random random = new Random();
		double numRandom = min + (max - min) * random.nextDouble();
		return numRandom;
	}
}
