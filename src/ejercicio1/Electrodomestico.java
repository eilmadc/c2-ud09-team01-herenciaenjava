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

	// ------------ CONSTANTES ---------------
	protected final static double PRC_BSE = 100;
	protected final static String COLOR_BSE = "blanco";
	protected final static char CNSMO_ENRG = 'F';
	protected final static double PSO_BSE = 5;

	// ------------ VARIABLES ----------------
	protected double precioBase;
	protected String color;
	protected char consumoEnergetico;
	protected double peso;

	// ------------ CONSTRUCTORES ------------
	
	// Constructor por defecto
	public Electrodomestico() {
		this.precioBase = PRC_BSE;
		this.color = COLOR_BSE;
		this.consumoEnergetico = CNSMO_ENRG;
		this.peso = PSO_BSE;
	}

	// Constructor con 2 parametros de entrada (precioBase, peso) y el resto por defecto
	public Electrodomestico(double precioBase, double peso) {
		this.precioBase = precioBase;
		this.color = COLOR_BSE;
		this.consumoEnergetico = CNSMO_ENRG;
		this.peso = peso;
	}

	// Constructor con todos los parametros
	public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
		this.precioBase = precioBase;
		comprobarColor(color);
		comprobarConsumoEnergetico(consumoEnergetico);
		this.peso = peso;
	}

	// -------------------- MÉTODOS ------------------------
	
	// Comprueba el valor de consumo energético, si no esta entre A y F lo ponemos por defecto
	private void comprobarConsumoEnergetico(char letra) {
		if ((letra >= 65 && letra <= 70) || (letra >= 61 && letra <= 66)) {
			this.consumoEnergetico = letra;
		} else {
			this.consumoEnergetico = CNSMO_ENRG;
		}
	}

	// Comprueba el valor de color, si no es blanco, negro, rojo, azul o gris lo ponemos por defecto
	private void comprobarColor(String color) {
		String colores[] = { "blanco", "negro", "rojo", "azul", "gris" };
		boolean existe = Arrays.asList(colores).contains(color.toLowerCase());
		this.color = existe ? color : COLOR_BSE;
	}
	
	// Según la letra de consumo y el peso añadimos cantidad al precio final
	public double precioFinal() {
		double precioFinal = 0;

		switch (consumoEnergetico) {
		case 'A':
		case 'a':
			precioFinal += 100;
			break;
		case 'B':
		case 'b':
			precioFinal += 80;
			break;
		case 'C':
		case 'c':
			precioFinal += 60;
			break;
		case 'D':
		case 'd':
			precioFinal += 50;
			break;
		case 'E':
		case 'e':
			precioFinal += 30;
			break;
		case 'F':
		case 'f':
			precioFinal += 10;
			break;
		default:
			precioFinal += 10;
			break;
		}

		if (peso >= 0 && peso <= 19) {
			precioFinal += 10;
		} else if (peso >= 20 && peso <= 49) {
			precioFinal += 50;
		} else if (peso >= 50 && peso <= 79) {
			precioFinal += 80;
		} else if (peso > 80) {
			precioFinal += 100;
		}

		precioFinal = precioBase + precioFinal;

		return precioFinal;
	}

	// -------------------- GETTERS Y SETTERS ------------------------
	
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

	// Sobreescribimos el método toString
	@Override
	public String toString() {
		return "ELECTRODOMÉSTICO: "
				+ "Precio Base: "+ precioBase + "€"
				+ " / Color: " + color 
				+ " / Consumo Energetico: " + consumoEnergetico 
				+ " / Peso: " + peso + "kg"
				+ " / Precio final: " + precioFinal() + "€"
				+ "\n----------------------";
	}

}
