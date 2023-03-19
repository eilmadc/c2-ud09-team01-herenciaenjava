/**
 * 
 */
package utils;

/**
 * @author elena-01
 *
 */
public class ColorConsole {

	// ESTRUCTURA: COLORES + CADENA + RESET
	//https://i.stack.imgur.com/9UVnC.png
	
	// COLORES
	public final String ANSI_RESET = "\u001B[0m";
	public final String ANSI_BLACK = "\u001B[30m";
	public final String ANSI_RED = "\u001B[31m";
	public final String ANSI_GREEN = "\u001B[32m";
	public final String ANSI_YELLOW = "\u001B[33m";
	public final String ANSI_BLUE = "\u001B[34m";
	public final String ANSI_MAGENTA = "\u001B[35m";
	public final String ANSI_CYAN = "\u001B[36m";
	public final String ANSI_WHITE = "\u001B[37m";

	public final String ANSI_BBLACK = "\u001B[90m";
	public final String ANSI_BRED = "\u001B[91m";
	public final String ANSI_BGREEN = "\u001B[92m";
	public final String ANSI_BYELLOW = "\u001B[93m";
	public final String ANSI_BBLUE = "\u001B[94m";
	public final String ANSI_BMAGENTA = "\u001B[95m";
	public final String ANSI_BCYAN = "\u001B[96m";
	public final String ANSI_BWHITE = "\u001B[97m";

	//COLORES DE FONDO
	public final String ANSI_FBLACK = "\u001B[40m";
	public final String ANSI_FRED = "\u001B[41m";
	public final String ANSI_FGREEN = "\u001B[42m";
	public final String ANSI_FYELLOW = "\u001B[43m";
	public final String ANSI_FBLUE = "\u001B[44m";
	public final String ANSI_FMAGENTA = "\u001B[45m";
	public final String ANSI_FCYAN = "\u001B[46m";
	public final String ANSI_FWHITE = "\u001B[47m";
	
	public final String ANSI_FBBLACK = "\u001B[100m";
	public final String ANSI_FBRED = "\u001B[101m";
	public final String ANSI_FBGREEN = "\u001B[102m";
	public final String ANSI_FBYELLOW = "\u001B[103m";
	public final String ANSI_FBBLUE = "\u001B[104m";
	public final String ANSI_FBMAGENTA = "\u001B[105m";
	public final String ANSI_FBCYAN = "\u001B[106m";
	public final String ANSI_FBWHITE = "\u001B[107m";

	//Imprime con salto de linea
	public void imprimeColor(String colour, String string) {
		System.out.println(colour+string+ANSI_RESET);
	}
	
	//Imprime sin salto de linea
	public void imprimeColorSin(String colour, String string) {
		System.out.print(colour+string+ANSI_RESET);
	}
}
