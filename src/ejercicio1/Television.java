/**
 * 
 */
package ejercicio1;

/**
 * @author Team01 (Elena, Palmira, Paul)
 *
 */
public class Television extends Electrodomestico{
	
	private static final int RESOLUCION_DEF = 20;
	private static boolean SINTONIZADOR_DEF = false;
	
	private int resolucion;
	private boolean sintonizadorTDT;

	// Constructor por defecto
	public Television() {
		this(PRC_BSE, PSO_BSE, CNSMO_ENRG, COLOR_BSE, RESOLUCION_DEF, SINTONIZADOR_DEF);
	}

	public Television(double precioBase, double peso) {
		this(precioBase, peso, CNSMO_ENRG, COLOR_BSE, RESOLUCION_DEF, SINTONIZADOR_DEF);
	}

	public Television(double precioBase, double peso, char consumoEnergetico, String color, int resolucion,
			boolean sintonizadorTDT) {
		super(precioBase, color, consumoEnergetico, peso);
		this.resolucion = resolucion;
		this.sintonizadorTDT = sintonizadorTDT;
	}
	
	
	public double precioFinal() {
		double precio = super.precioFinal();
		if(resolucion>40) {
			precio+=precioBase*0.3;
		}
		if(sintonizadorTDT) {
			precio+=50;	
		}
		return precio;
	}

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

	@Override
	public String toString() {
		return "TELEVISIÓN: "
				+ "Resolucion: "+ resolucion
				+ " / Sintonizador TDT: " + sintonizadorTDT 
				+ " / Precio Base: "+ precioBase + "€"
				+ " / Color: " + color 
				+ " / Consumo Energetico: " + consumoEnergetico 
				+ " / Peso: " + peso + "kg"
				+ " / Precio final: " + precioFinal() + "€"
				+ "\n----------------------";
	}

	


}
