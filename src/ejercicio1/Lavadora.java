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

	//Metodo precioFinal
	@Override
	public double precioFinal() {
/*
			double precio = super.precioFinal();
			if (carga>30) {
				precio = precio +50;*/

		return (carga>30? (super.precioFinal()+ 50) : super.precioFinal());
	}
	
}
