package prueba;

import java.util.Scanner;

public class PedirDatos {
	static Scanner sc = new Scanner(System.in);
	
	public static String pedirNombre()
	{
		String nombre = null;
		System.out.print("Introduzca nombre: ");
		nombre = sc.next();
		return nombre;
	}
	
	public static byte pedirEdad()
	{
		byte edad = 0;
		System.out.print("Introduzca edad: ");
		edad = sc.nextByte();
		return edad;
	}
	
	public static byte pedirNumeroDePersonas()
	{
		byte contador = 0;
		System.out.print("Número de personas a introducir: ");
		contador = sc.nextByte();
		return contador;
	}
}
