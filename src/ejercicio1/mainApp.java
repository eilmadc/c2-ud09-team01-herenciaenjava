/**
 * 
 */
package ejercicio1;

/**
 * @author elena-01
 *
 */
public class mainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("\n****************************************");
		System.out.println("************** C02 * UD09 **************");
		System.out.println("****************************************\n");

		// C2-T06: Ejercicio 1
		System.out.println("************** Ejercicio 1 *************\n");

		Electrodomestico electrodomestico[] = new Electrodomestico[10];
		
		

		System.out.println(electrodomestico[0].toString());
		System.out.println(electrodomestico[1].toString());

//		for (int i = 0; i < electrodomestico.length; i++) {
//			electrodomestico[i].toString();
//		}

	}
	
	public void rellenarDatos(Electrodomestico electrodomestico[]) {
		electrodomestico[0] = new Electrodomestico(750, "rojo", 'E', 45);
		electrodomestico[1] = new Lavadora(750, "rojo", 'E', 45, 7);
	}

}
