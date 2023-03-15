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

	private final static int PRC_BSE = 100;
	private final static String COLOR_BSE = "blanco";
	private final static char CNSMO_ENRG = 'F';
	private final static int PSO_BSE = 5;

	private int precioBase;
	private String color;
	private char consumoEnergetico;
	private int peso;

	public Electrodomestico() {
		this.precioBase = PRC_BSE;
		this.color = COLOR_BSE;
		this.consumoEnergetico = CNSMO_ENRG;
		this.peso = PSO_BSE;
	}
	
	public Electrodomestico(int precioBase, int peso) {
		this.precioBase = precioBase;
		this.color = COLOR_BSE;
		this.consumoEnergetico = CNSMO_ENRG;
		this.peso = peso;
	}

	public Electrodomestico(int precioBase, String color, char consumoEnergetico, int peso) {
		this.precioBase = precioBase;
		this.color = color;
		this.consumoEnergetico = consumoEnergetico;
		this.peso = peso;
	}

	public int getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(int precioBase) {
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

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}
	
}
