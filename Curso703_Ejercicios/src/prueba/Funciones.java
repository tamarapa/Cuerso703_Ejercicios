package prueba;

import java.util.Scanner;

public class Funciones {
	static Scanner sc = new Scanner(System.in);
	
	public static int pedirNumero()
	{
		int numero = 0;
		System.out.print("Introduzca número: ");
		numero = sc.nextInt();
		return numero;
	}
	
	public static int devuelveMayor(int numero, int mayor)
	{
		//mayor = (numero > mayor) ? mayor = numero : mayor;
		
		if (numero>mayor)
		{
			mayor = numero;
		}		
		return mayor;
	}

}
