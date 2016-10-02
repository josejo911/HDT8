/**
 *Algoritmos y Estructuras de Datos
 *Hoja de trabajo 8

 *Integrantes:
 *Jose Javier Jo 14343
 /Jorge Suchite, 15
 *Esta interfaz se encarga de los metodos a implementar ya que es un PriorityQueue osea se encarga de observar la prioridad 
 **/
public interface PriorityQueue<E extends Comparable<E>>
{
	/**
	 *Regresa el primer elemento que se encuetra en la cola 
	 * @return  elemento numero 1 de la cola
	 */
	public E getFirst();

	
	/**
	 * Elimina y retorna el elemento de  menor valor en la cola
	 * @return elemento con el valor mas pequeño de la cola
	 */
	public E remove();

	/**
	 * Agrega un nuevo elemento a la cola 
	 * @param value Valor que se desea agregar a la cola 
	 */
	public void add(E value);

	/**
	 * Determina si la cola se encuentra vacia 
	 * @return TRUE si esta vacio y FALSE si no 
	 */
	public boolean isEmpty();	
	/**
	 * Regresa el tamaño actual de la cola 
	 * @return Tamano de la cola 
	 */
	public int size();
	/**
	 * Elimina todos los elementos de la cola 
	 */
	public void clear();
	// post: removes all elements from queue

}
