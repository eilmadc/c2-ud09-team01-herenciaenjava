/**
 * 
 */
package ejercicio1;

/**
 * @author Team01 (Elena, Palmira, Paul)
 *
 */
public class Lavadora extends Electrodomestico {

	// ------------ CONSTANTES ---------------
	final static double CARGA = 5;
	
	// ------------ VARIABLES ----------------
	private double carga;
	
	// ------------ CONSTRUCTORES ------------

	// Constructor por defecto
	public Lavadora() {
		this.carga = CARGA; // 5
	}

	// Constructor con 2 parametros de entrada (precioBase, peso) y el resto por defecto
	public Lavadora(double precioBase, double peso) {
		super(precioBase, peso);
		this.carga = CARGA; // 5
	}

	// Constructor con todos los parametros
	public Lavadora(double precioBase, String color, char consumoEnergetico, double peso, double carga) {
		super(precioBase, color, consumoEnergetico, peso);
		this.carga = carga;
	}
	
	// -------------------- GETTERS Y SETTERS ------------------------
	public double getCarga() {
		return carga;
	}

	// Método que nos suma 50 al precio final si la carga de la lavadora es superior a 30
	@Override
	public double precioFinal() {

		return (carga > 30 ? (super.precioFinal() + 50) : super.precioFinal());
	}

	// Sobreescribimos el método toString
	@Override
	public String toString() {
		return "LAVADORA: " 
				+ "Carga: " + carga 
				+ " / Precio Base: " + precioBase 
				+ " / Color: " + color 
				+ " / ConsumoEnergetico: " + consumoEnergetico
				+ " / Peso: " + peso 
				+ " / Precio final: " + precioFinal() + "€"
				+  "\n----------------------";
	}
	
	

}
