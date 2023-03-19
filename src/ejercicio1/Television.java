/**
 * 
 */
package ejercicio1;

/**
 * @author Team01 (Elena, Palmira, Paul)
 *
 */
public class Television extends Electrodomestico {

	//------------ CONSTANTES ---------------
	private static final int RESOLUCION_DEF = 20;
	private static boolean SINTONIZADOR_DEF = false;
	//------------ VARIABLES ----------------
	private int resolucion;
	private boolean sintonizadorTDT;

	// ------------ CONSTRUCTORES------------

	// Constructor por defecto
	public Television() {
		this(PRC_BSE, PSO_BSE, CNSMO_ENRG, COLOR_BSE, RESOLUCION_DEF, SINTONIZADOR_DEF);
	}

	// Constructor con 2 parametros de entrada y el resto por defecto
	public Television(double precioBase, double peso) {
		this(precioBase, peso, CNSMO_ENRG, COLOR_BSE, RESOLUCION_DEF, SINTONIZADOR_DEF);
	}

	// Constructor con todos los parametros
	public Television(double precioBase, double peso, char consumoEnergetico, String color, int resolucion,
			boolean sintonizadorTDT) {
		super(precioBase, color, consumoEnergetico, peso);
		this.resolucion = resolucion;
		this.sintonizadorTDT = sintonizadorTDT;
	}

	// Metodo para calcular el precio final
	public double precioFinal() {
		double precio = super.precioFinal();
		// Si la resolución es superior a 40 se incrementa el precio
		if (resolucion > 40) {
			precio += precioBase * 0.3;
		}
		// Si tiene sintonizador TDT aumenta en 50 el precio
		if (sintonizadorTDT) {
			precio += 50;
		}
		return precio;
	}

	// --------------------Setters y Getters------------------------
	public int getResolucion() {
		return resolucion;
	}

	public void setResolucion(int resolucion) {
		this.resolucion = resolucion;
	}

	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}

	public void setSintonizadorTDT(boolean sintonizadorTDT) {
		this.sintonizadorTDT = sintonizadorTDT;
	}

	// Metodo toString
	@Override
	public String toString() {
		return "TELEVISIÓN: " + "Resolucion: " + resolucion + " / Sintonizador TDT: " + sintonizadorTDT
				+ " / Precio Base: " + precioBase + "€" + " / Color: " + color + " / Consumo Energetico: "
				+ consumoEnergetico + " / Peso: " + peso + "kg" + " / Precio final: " + precioFinal() + "€"
				+ "\n----------------------";
	}

}
