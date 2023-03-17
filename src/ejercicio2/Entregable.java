/**
 * 
 */
package ejercicio2;

/**
 * @author Team01 (Elena, Palmira, Paul)
 *
 */
public interface Entregable {
	//La interface nos obliga a que las clases que la implementes contengan los siguientes metodos:
	public void entregar();
	public void devolver();
	public boolean isEntregado();
	public String compareTo(Object a);
	
}
