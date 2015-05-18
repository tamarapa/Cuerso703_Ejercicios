package ejercicioRecopilacion;
import ejercicioRecopilacion.exceptions.InsertarPersonaException;
import prueba.Persona;

public class MainListaPersonas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListaPersonas lp = new ListaPersonas();
		
		Persona p = new Persona("Pepe",35);
		try {
			lp.insertarPersona(p);
		} catch (InsertarPersonaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Número de personas: "+lp.numeroPersonas());
		System.out.println("---------------------------------------");
		
		try {
			lp.insertarPersona(p);
		} catch (InsertarPersonaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Número de personas: "+lp.numeroPersonas());
		System.out.println("---------------------------------------");
		
			
		Persona p2 = new Persona("Juan",31);
		try {
			lp.insertarPersona(p2);
		} catch (InsertarPersonaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Número de personas: "+lp.numeroPersonas());
		System.out.println("---------------------------------------");
		
				
		for (int i = 0; i < ListaPersonas.array_personas.length; i++) {
			if (ListaPersonas.array_personas[i]!=null)
			{
				System.out.println(i+":" +ListaPersonas.array_personas[i].getNombre());
			}
			else
			{
				System.out.println(i+":null");
			}
		}
		System.out.println("---------------------------------------");
		lp.eliminarPersona(p2);
		System.out.println("Número de personas: "+lp.numeroPersonas());
		System.out.println("---------------------------------------");
		
				
		for (int i = 0; i < ListaPersonas.array_personas.length; i++) {
			if (ListaPersonas.array_personas[i]!=null)
			{
				System.out.println(i+":" +ListaPersonas.array_personas[i].getNombre());
			}
			else
			{
				System.out.println(i+":null");
			}
		}
	}

}
