package prueba;

public class MainPersona {
		
	public static void main (String []argumentos){
		// TODO utilizar los métodos que hemos desarrollado
		String n = null;
		Persona p = null;
		byte e = 0;
		byte numeroPersonas = 0;
		
		numeroPersonas = PedirDatos.pedirNumeroDePersonas();
		
		for (int contador=1;contador<numeroPersonas+1;contador++)
		{
			System.out.println("PERSONA "+contador);			
						
			n = PedirDatos.pedirNombre();
			e = PedirDatos.pedirEdad();
									
			p = new Persona(n,e);			
			p.mostrarNombre();
			if (p.esMayorDeEdad()){
				System.out.print(" es mayor de edad. ");
			}
			else{
				System.out.print(" es menor de edad. ");
			}
			System.out.print("Tiene ");
			p.mostrarEdad();
			System.out.println(" años.");
			 
			if (contador == numeroPersonas)
			{
				System.out.println("Esto es to esto to esto es todo amigos!");
			}
		}		
	}
}
