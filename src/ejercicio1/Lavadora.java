/**
 * 
 */
package ejercicio1;

/**
 * @author Team01 (Elena, Palmira, Paul)
 *
 */
public class Lavadora extends Electrodomestico {

	final static double CARGA = 5;
	private double carga;

	/**
	 * Constructor sin parametros por defecto
	 * 
	 * @param
	 */
	public Lavadora() {
		this.carga = CARGA; // 5
	}

	/**
	 * Constructor sin parametros por defecto
	 * 
	 * @param
	 */
	public Lavadora(double precioBase, double peso) {
		super(precioBase, peso);
		this.carga = CARGA; // 5
	}

	/**
	 * Constructor parametros
	 * 
	 * @param precioBase,color, consumoEnergetico, peso
	 */
	public Lavadora(double precioBase, String color, char consumoEnergetico, double peso, double carga) {
		super(precioBase, color, consumoEnergetico, peso);
		this.carga = carga;
	}

	/**
	 * Obtener carga Getter
	 * 
	 * @return carga
	 */
	public double getCarga() {
		return carga;
	}

	@Override
	public double precioFinal() {

		return (carga > 30 ? (super.precioFinal() + 50) : super.precioFinal());
	}

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
