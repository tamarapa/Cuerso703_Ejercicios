package ejercicioRecopilacion;

import java.util.ArrayList;

public class MainListaPersonasArrayList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p1 = new Persona("Pepe",32);
		Persona p2 = new Persona("Juan",21);
		ArrayList<Persona> al = new ArrayList<Persona>();
		al.add(0, p1);
		al.add(1, p2);
		for (Persona miembro : al) {
			System.out.println(miembro);//for each, válido para recorrer Colecciones
		}

	}

}
