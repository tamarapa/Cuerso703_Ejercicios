package prueba;

public class MainDosPersonas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//crear persona 1
		Persona p1 = null;
		byte edad1 = 12;
		p1 = new Persona("Ana",edad1);
		
		System.out.println(p1);
		System.out.println(p1);
		
		/*
		//crear persona 2
		Persona p2 = null;
		byte edad2 = 12;
		p2 = new Persona("Ana",edad2);
		
		//crear persona 3
		Persona p3 = null;
		p3 = new Persona();
		p3 = p1;
		p3.nombre = "Pepe";
		
		
		
		//comparar personas
		if (p1.equals(p3))
		//if (p1.nombre==p3.nombre)
		{
			//System.out.println("p1 -> "+p1+" y p3 -> "+p3);
			System.out.println("p1.nombre -> "+p1.nombre+" y p3.nombre -> "+p3.nombre);
			System.out.println("SON IGUALES");
		}
		else
		{
			System.out.println("NO SON IGUALES");
		}
		*/
	}

}
