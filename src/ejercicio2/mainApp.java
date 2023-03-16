/**
 * 
 */
package ejercicio2;

/**
 * @author Team01 (Elena, Palmira, Paul)
 *
 */
public class mainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Creamos un array de Series
		Serie[] series = new Serie[5];
        // Creamos un array de Videojuegos
        Videojuego[] videojuegos = new Videojuego[5];
        
        creacionObjetos(series, videojuegos);
        //Entregamos algunos Videojuegos y algunas Series con el método entregar()
        entregar(series, videojuegos);
        //Mostramos los datos de todos los videojuegos y de las series
        mostrarDatos(series, videojuegos);
        //Comprobamos cuantos hay entregados
        seriesVideojuegosEntregados(series, videojuegos);
        //Comprobamos cual tiene más horas/temporadas
        masCantidad(series, videojuegos);
        
	}
	
	public static void creacionObjetos(Serie[] series, Videojuego[] videojuegos) {
		//Creamos un objeto dentro de cada posción del array series
        series[0] = new Serie("Padre made in USA", 18, "Comedia", "Seth MacFarlane, Mike Barker y Matt Weitzman");
        series[1] = new Serie("Breaking Bad", 5, "Drama", "Vince Gilligan");
        series[2] = new Serie("Friends", 10, "Comedia", "David Crane y Marta Kauffman");
        series[3] = new Serie("The Walking Dead", 11, "Terror", "Frank Darabont");
        series[4] = new Serie("Stranger Things", 4, "Ciencia ficción", "The Duffer Brothers");
      //Creamos un objeto dentro de cada posción del array videojuegos
        videojuegos[0] = new Videojuego("The Legend of Zelda: Breath of the Wild", 50.0, "Aventura", "Nintendo");
        videojuegos[1] = new Videojuego("Grand Theft Auto V", 30.0, "Acción", "Rockstar Games");
        videojuegos[2] = new Videojuego("Minecraft", 20.0, "Aventura", "Mojang Studios");
        videojuegos[3] = new Videojuego("The Witcher 3: Wild Hunt", 80.0, "Rol", "CD Projekt RED");
        videojuegos[4] = new Videojuego("Red Dead Redemption 2", 60.0, "Acción", "Rockstar Games");
	}
	
	public static void entregar(Serie[] series, Videojuego[] videojuegos) {
		videojuegos[3].entregar();
        videojuegos[4].entregar();
        videojuegos[1].entregar();
        series[0].entregar();
        series[4].entregar();
	}
	
	public static void mostrarDatos(Serie[] series, Videojuego[] videojuegos) {
		for (int i = 0; i < series.length; i++) {
			System.out.println(series[i].toString());
		}
		for (int i = 0; i < videojuegos.length; i++) {
			System.out.println(videojuegos[i].toString());
		}
	}
	
	//Creamos método al que le pasamos las series y videojuegos para comprobar cuantos hay entregados
	public static void seriesVideojuegosEntregados(Serie[] series, Videojuego[] videojuegos) {
		int seriesEntergadas = 0, videojuegosEntregados = 0;
		for (int i = 0; i < series.length; i++) {
			if (series[i].isEntregado()) {
				seriesEntergadas++;
				series[i].devolver();
			}
			if (videojuegos[i].isEntregado()) {
				videojuegosEntregados++;
				videojuegos[i].devolver();
			}
		}
		
		System.out.println("\n\n----- ENTREGAS -----"
				+ "\n- Series entregadas: " + seriesEntergadas
				+ "\n- Videojuegos entregados: " + videojuegosEntregados);
	}
	
	public static void masCantidad(Serie[] series, Videojuego[] videojuegos) {
		Serie mayorSerie = series[0];
		Videojuego mayorVideojuego = videojuegos[0];
		
		for (int i = 0; i < series.length; i++) {
			if (series[i].compareTo(mayorSerie).equals("mayor")) {
				mayorSerie = series[i];
			}
			if (videojuegos[i].compareTo(mayorVideojuego).equals("mayor")) {
				mayorVideojuego = videojuegos[i];
			}
		}
		
		System.out.println("\n\n----- MAYOR NÚMERO DE HORAS / TEMPORADAS -----\n"
				+ "\n- El videojuego con más horas estimadas es:\n" + mayorVideojuego
				+ "\n- La serie con más temporadas es:\n" + mayorSerie);
	}

}
