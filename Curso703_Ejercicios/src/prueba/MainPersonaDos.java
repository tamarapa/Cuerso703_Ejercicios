package prueba;

public class MainPersonaDos {

	/**
	 * @param args
	 */
	public static void insertarPersona (Persona [] array_persona, String nombre, int edad, int pos) 
	{
		try {
			array_persona[pos] = new Persona(nombre,edad);
		} catch (ArrayIndexOutOfBoundsException e) {
			throw new ExcepcionesArray();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona [] array_persona = new Persona [2];
		insertarPersona (array_persona, "Juan", 21, 4);		
	}

}
