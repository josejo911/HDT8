/**
 *Algoritmos y Estructuras de Datos
 *Hoja de trabajo 8

 *Integrantes:
 *Jose Javier Jo 14343
 /Jorge Suchite, 15
 *En esta clase se almacenan los datos cada uno de los pacientes incluyebdo su nombre sintoma y codigo de emergencia
 **/


public class Paciente<E> implements Comparable<E> {
	
	private String name;	//Nombre de paciente que ingresa
	private String sintoma;	//Sintoma de paciente 
	private String codigo;	//Codigo de Emergencia de Paciente 
	
	/**
	 * Constructor de la Clase. Crea un nuevo objeto Paciente recibiendo diferentes parametros 
	 * @param new_nombre Nombre del Paciente a crear
	 * @param new_sintoma Sintoma del paciente a crear 
	 * @param new_codigo Codigo de Emergencia del paciente 
	 */
	public Paciente (String new_name, String new_sintoma, String new_codigo) {
		name=new_name;
		sintoma=new_sintoma;
		codigo=new_codigo;
	}
	
	/**
	 * Permite obtener el codigo de emergencia del paciente 
	 * @return codigo de emergencia 
	 */
	public String getcodigo(){
		return codigo;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(E new_paciente) {
		// TODO Auto-generated method stub
		String new_codigo=((Paciente)new_paciente).getcodigo();
		return codigo.compareTo(new_codigo);
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString(){
		return name+", "+sintoma+", "+codigo;
	}

}

