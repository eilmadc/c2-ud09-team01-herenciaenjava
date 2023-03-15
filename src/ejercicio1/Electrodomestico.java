/**
 * 
 */
package ejercicio1;

import java.util.Arrays;

/**
 * @author Team01 (Elena, Palmira, Paul)
 *
 */
public class Electrodomestico {

	protected final static double PRC_BSE = 100;
	protected final static String COLOR_BSE = "blanco";
	protected final static char CNSMO_ENRG = 'F';
	protected final static double PSO_BSE = 5;

	protected double precioBase;
	protected String color;
	protected char consumoEnergetico;
	protected double peso;

	public Electrodomestico() {
		this.precioBase = PRC_BSE;
		this.color = COLOR_BSE;
		this.consumoEnergetico = CNSMO_ENRG;
		this.peso = PSO_BSE;
	}

	public Electrodomestico(double precioBase, double peso) {
		this.precioBase = precioBase;
		this.color = COLOR_BSE;
		this.consumoEnergetico = CNSMO_ENRG;
		this.peso = peso;
	}

	public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
		this.precioBase = precioBase;
		comprobarColor(color);
		this.consumoEnergetico = consumoEnergetico;
		this.peso = peso;
	}

	private void comprobarConsumoEnergetico(char letra) {
		if ((letra >= 65 && letra <= 70) || (letra >= 61 && letra <= 66)) {
			this.consumoEnergetico = letra;
		} else {
			this.consumoEnergetico = CNSMO_ENRG;
		}
	}

	private void comprobarColor(String color) {

		String colores[] = { "blanco", "negro", "rojo", "azul", "gris" };
		boolean existe = Arrays.asList(colores).contains(color.toLowerCase());
		this.color = existe ? color : COLOR_BSE;

	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public void setConsumoEnergetico(char consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

}
