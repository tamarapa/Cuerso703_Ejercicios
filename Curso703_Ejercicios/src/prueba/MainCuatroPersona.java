package prueba;

public class MainCuatroPersona {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//método sobre la clase persona que reciba una persona y 
		//me devuelva la misma persona con x años más
		
		// recibe un objeto y devuelve otro nuevo
		Persona p1 = null;	
		p1 = new Persona("Ana",30);
		p1.UNO_sumaEdad(p1,3).mostrarEdad();
		
		// recibe el incremento y modifica el objeto q llama
		Persona p2 = null;	
		p2 = new Persona("Ana",31);
		p2.DOS_sumaEdad(3);
		p2.mostrarEdad();
		
		// recibe el objeto, el incremento y modifica ese objeto q recibe por parámetro
		Persona p3 = null;
		p3 = new Persona("Ana",32);
		Persona.TRES_sumaEdad(p3, 3);
		p3.mostrarEdad();
		

	}

}
