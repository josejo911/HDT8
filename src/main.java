import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

/**
Algoritmos y Estructuras de Datos
Hoja de trabajo 8

Integrantes:
Jose Javier Jo 14343
Jorge Suchite, 15

 *Main del Programa 
 **/


public class main {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		String file = "pacientes.txt";
		String[] separador; //separador de frases
		BufferedReader br = new BufferedReader(new FileReader(file));
	    String line;
	    
	    Vector<Paciente> patient_list = new Vector<Paciente>();
	    
        try {
			while ((line = br.readLine()) != null) {
				//separador de frases
			    separador=line.split(",");
			    patient_list.add(new Paciente(separador[0], separador[1], separador[2]));
			    //System.out.print(separador[0]+separador[1]+separador[2]);
			}
		} catch (IOException e) {
			System.out.println("error");
		}
        
//Se muestra en pantalla el listado de pacinttes ingresados originalmente en el texto 
        System.out.println("Listado de pacientes ingresados en el IGSS Jutiapa\n");
        for(int i=0; i<patient_list.size(); i++){
            System.out.println(patient_list.get(i));
		}

        
        System.out.println("\nAtencion de emergencias que usa una implementacion  \nproporcionada por el Java Collection Framework\n");
        
        VectorHeap v_heap = new VectorHeap(patient_list);
		String ordenados="";
        while(v_heap.iterator().hasNext()){
			Paciente paciente = (Paciente) v_heap.poll();
			ordenados += paciente.toString()+"\n";
		}
		
		
		System.out.println(ordenados);
		
		System.out.println("Atencion de emergencias que usa implementacion de VectorHeap\n");
		
		ordenados="";
		VectorHeap_implements v_heap2 = new VectorHeap_implements(patient_list);
		int size=v_heap2.size();
		
		for(int i=0; i<size; i++){
			Paciente paciente = (Paciente)v_heap2.remove();
			ordenados += paciente.toString()+"\n";
		}
		
		System.out.println(ordenados);
	}
	
}
