/**
 * 
 */
package ejercicio4;

/**
 * @author Team01 (Elena, Palmira, Paul)
 *
 */
public class MainApp {

	public static void main(String[] args) {

		// Creamos algunos objetos de clase Raices
		Raices raiz1 = new Raices(1, -2, 1);
		Raices raiz2 = new Raices(1.2, 7, 4);
		Raices raiz3 = new Raices(4.5, 1, 1);

		System.out.println("Prueba 1: ");
		raiz1.calcular();
		System.out.println("Prueba 2:");
		raiz2.calcular();
		System.out.println("Prueba 3:");
		raiz3.calcular();

	}

}
