package prueba;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MainPersonaSerializacion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// crear 3 objetos de persona y los guardo en un array
		Persona [] array_escribe_personas = new Persona[3];
		
		array_escribe_personas[0] = new Persona("PEPE",32);
		array_escribe_personas[1] = new Persona("MARIA", 45);
		array_escribe_personas[2] = new Persona("JUAN", 21);
		
		// serializar los objetos en un fichero
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("fichero_serializacion.txt"));
			oos.writeObject(array_escribe_personas);
			oos.close();
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("fichero_serializacion.txt"));
			
			try {
				// comprobar el tipo de objeto
				Object [] array_lee_personas = (Object []) ois.readObject();
				
				for (int i = 0; i < array_lee_personas.length; i++) {
					if (array_lee_personas[i] instanceof Persona)
					{
						System.out.print("\nNombre: ");
						((Persona) array_lee_personas[i]).mostrarNombre();
						System.out.print("\nEdad: ");
						((Persona) array_lee_personas[i]).mostrarEdad();
						System.out.println();
					}
					else
					{
						System.out.println("El objeto no es de tipo Persona");
					}					
				}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			ois.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
