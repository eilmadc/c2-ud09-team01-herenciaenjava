/**
 * 
 */
package utils;

import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * @author elena-01
 *
 */
public class Utils {

	Scanner scanner = new Scanner(System.in);
	int num[];

	// Mostrar mensaje en dialog
	public void mostrarMensajeDialog(String mensaje, String titulo) {
		JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.INFORMATION_MESSAGE);
	}

	// Pedir String por dialog
	@SuppressWarnings("finally")
	public String pideString(String mensaje, String titulo) {
		String string = "";
		try {
			string = JOptionPane.showInputDialog(null, mensaje, titulo, JOptionPane.QUESTION_MESSAGE);
		} catch (Exception e) {
			System.out.println("No has introducido valor");
		} finally {
			return string;
		}
	}

	// Pedir Integer por dialog
	@SuppressWarnings("finally")
	public int pideInt(String mensaje, String titulo) {
		int num = 0;
		try {
			num = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje, titulo, JOptionPane.QUESTION_MESSAGE));
		} catch (Exception e) {
			System.out.println("No has introducido valor");
		} finally {
			return num;
		}
	}

	// Pedir Double por dialog

	@SuppressWarnings("finally")
	public double pideDouble(String mensaje, String titulo) {
		double num = 0.0;
		try {
			num = Double.parseDouble(JOptionPane.showInputDialog(null, mensaje, titulo, JOptionPane.QUESTION_MESSAGE));
		} catch (Exception e) {
			System.out.println("No has introducido valor");
		} finally {
			return num;
		}
	}

	// mostrar titulo del ejercicio
	public void mostrarTitulo(String mensaje) {
		System.out.println("\n****************************************");
		System.out.println("*************** " + mensaje + " ****************");
		System.out.println("****************************************\n");
	}

	// mostrar numero ejercicio
	public void mostrarPrograma(String mensaje) {
		System.out.println("************ " + mensaje + " ***********\n");
	}

	//mostrar mensaje
	public void imprime(String mensaje) {
		System.out.println("\n------- " + mensaje + " -------\n");
	}
	
	//mostrar mensaje
	public void imprimeRayas(String mensaje) {
		System.out.println("\n--    " + mensaje + "     --\n");
	}
	
	//mostrar mensaje
	public void imprimeLinea() {
		System.out.println("\n__________________________________________________________\n");
	}
	
	//mostrar mensaje
		public void imprimeLineaMensaje(String mensaje) {
			System.out.println("\n-----------------         "+ mensaje +"           --------------\n");
		}
	
	//Devuelve double o float por pantalla con 2 posiciones.
	public String dosPos(double numero) {
		String x = String.format("%.2f", numero);
		return x;
	}
}
