package prueba;

import java.util.Scanner;


public class MainPassword {

	/**
	 * @param args
	 */
	static Scanner sc = new Scanner(System.in);
	
	public static String pedirPassword()
	{
		String password = null;
		System.out.print("Introduzca la contraseña: ");
		password = sc.next();
		return password;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Password p = null;
		String palabra = pedirPassword();
		p = new Password(palabra);
		System.out.println("FORTALEZA: "+ p.fortaleza());
		System.out.println("CLAVE ENCRIPTADA: "+p.encriptacion());
	}

}
