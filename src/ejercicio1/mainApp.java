/**
 * 
 */
package ejercicio1;

/**
 * @author Team01 (Elena, Palmira, Paul)
 *
 */
public class mainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Imprimir linas  para separar la cabecera del programa
		System.out.println("\n****************************************");
		System.out.println("************** C02 * UD09 **************");
		System.out.println("****************************************\n");

		// C2-T06: Ejercicio 1
		System.out.println("************** Ejercicio 1 *************\n");

		// Se crea un array de objetos Electrodomestico y se le asignan valores usando el método rellenarDatos.
		Electrodomestico electrodomestico[] = new Electrodomestico[10];
		rellenarDatos(electrodomestico);
		
		// Se muestran y calculan los datos usando el método mostrarCalcularDatos.
		mostrarCalcularDatos(electrodomestico);

	}

	// Este método se encarga de rellenar el array de objetos Electrodomestico con datos
	public static void rellenarDatos(Electrodomestico electrodomestico[]) {
		electrodomestico[0] = new Electrodomestico(750, "rojo", 'E', 45);
		electrodomestico[1] = new Electrodomestico(550, "negro", 'A', 25);
		electrodomestico[2] = new Electrodomestico(175, "azul", 'D', 39);
		electrodomestico[3] = new Lavadora(350, "blanco", 'B', 45, 7);
		electrodomestico[4] = new Lavadora(675, "plata", 'F', 45, 7);
		electrodomestico[5] = new Lavadora(800, "GRIS", 'C', 45, 7);
		electrodomestico[6] = new Television(1750, 65, 'A', "blanco", 2160, true);
		electrodomestico[7] = new Television(1200, 50, 'A', "blanco", 1080, true);
		electrodomestico[8] = new Television(690, 32, 'C', "blanco", 720, true);
		electrodomestico[9] = new Television(320, 22, 'J', "morado", 720, false);
	}

	// Mostrar los datos y de calcular el precio total de cada tipo de electrodoméstico
	public static void mostrarCalcularDatos(Electrodomestico electrodomestico[]) {

		double totalElectrodomesticos = 0, totalTelevisores = 0, totalLavadoras = 0;

		System.out.println("************** Listado de productos **************");
		
		// Recorre el array de electrodomésticos y suma el total segun el tipo que sea.
		for (int i = 0; i < electrodomestico.length; i++) {

			if (electrodomestico[i] instanceof Electrodomestico) {
				totalElectrodomesticos = totalElectrodomesticos + electrodomestico[i].precioFinal();
			}
			if (electrodomestico[i] instanceof Lavadora) {
				totalLavadoras = totalLavadoras + electrodomestico[i].precioFinal();
			}
			if (electrodomestico[i] instanceof Television) {
				totalTelevisores = totalTelevisores + electrodomestico[i].precioFinal();
			}
			// Muestra por pantalla todos los datos
			System.out.println((i + 1) + ": " + electrodomestico[i].toString());
		}

		mostrarTotal(totalElectrodomesticos, totalTelevisores, totalLavadoras);
	}
	
	//Mostramos por pantalla la suma total de los precios
	public static void mostrarTotal(double totalElectrodomesticos, double totalTelevisores, double totalLavadoras) {
		System.out.println(
				"\n************** TOTAL **************" + "\n- Total electrodomésticos: " + totalElectrodomesticos
						+ "\n- Total lavadoras: " + totalLavadoras + "\n- Total televisores: " + totalTelevisores);
	}

}
