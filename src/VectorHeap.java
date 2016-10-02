import java.util.PriorityQueue;
import java.util.Vector;

/**
 *Algoritmos y Estructuras de Datos
 *Hoja de trabajo 8

 *Integrantes:
 *Jose Javier Jo 14343
 /Jorge Suchite, 15
 *Esta clase se encarga de generar un vector basado en la estructura de datos Heap que hereda de PriorityQueue para ordenar los datos en orden de importancia
 **/

public class VectorHeap < E extends Comparable<E>> extends PriorityQueue<E>{
	/**
	 * Es un vector que guarda la informacion del VectorHeap  
	 */
	protected Vector<E> data; // the data, kept in heap order
	
	/**
	 * Constructor que no tiene ningun vector predeterminado  
	 */
	public VectorHeap()
	// post: constructs a new priority queue
	{
	data = new Vector<E>();
	}
	/**
	 * Aca se encuentra el constructor de la clase que se encarga de recibir un vector como parametro 
	 * lo que hace es que convierte el vector ingresado en un VectorHeap 
	 * @param v Vector a convierte a VectorHeap 
	 */public VectorHeap(Vector<E> v)
	// post: constructs a new priority queue from an unordered vector
	{
	int i;
	data = new Vector<E>(v.size()); // we know ultimate size
	for (i = 0; i < v.size(); i++)
	{ // add elements to heap
	add(v.get(i));
	}
	}
	
	/**
	 * Aca se regresa el nodo PADRE que se necesita  
	 * @param El parametro i es el nodo del que se necesita conocer su PADRE  
	 * @return PADRE del nodo que esta en la posicion i 
	 */
	protected static int parent(int i)
	// pre: 0 <= i < size
	// post: returns parent of node at location i
	{
	return (i-1)/2;
	}
	
	/**
	 * Regresa el hijo de la izquierda del nodo indicado  
	 * @param El parametro i del nodo que se desea conocer del hijo  
	 * @return La localida que se encuetra el hijo de izquierdo del nodo  
	 */
	protected static int left(int i)
	// pre: 0 <= i < size
	// post: returns index of left child of node at location i
	{
	return 2*i+1;
	}
	
	/**
	 * Regresa el hijo derecho del nodo que seleccionamos  
	 * @param El parametro i del nodo que se desea conocer del hijo derechp
	 * @return La localida que se encuetra el hijo de derecho del nodo 
	 */
	protected static int right(int i)
	// pre: 0 <= i < size
	// post: returns index of right child of node at location i
	{
	return 2*(i+1);
	}
}
