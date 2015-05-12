
package prueba;

public class MainEjercicios {
	/**
	 * EJERCICIO 1:HACER UN MÉTODO QUE RECIBA UNA CADENA Y UN CARACTER Y DIGA SI ESE CARACTER 
	 * PERTENECE A LA CADENA O NO 
	 */
	public static boolean ejercicio1 (String cadena, char c)
	{
		boolean pertenece = false;
		if (cadena.indexOf(c)!=-1)
		{
			pertenece = true;
		}
		/*
		int i=0;
		do
		{
			if (cadena.charAt(i)==c)
			{
				pertenece = true;
			}
			i++;
		}
		while ((pertenece == false)&&(i<cadena.length()-1));
		*/ 
		return pertenece;
		
	}
	/**
	 * EJERCICIO 2: HACER UN MÉTODO QUE RECIBA UNA CADENA Y UN CARACTER Y DIGA CÚANTAS 
	 * VECES APARECE ESE CARACTER EN LA CADENA
	 */
	public static int ejercicio2 (String cadena, char c)
	{
		int cuantos = 0;
		for (int i=0; i<cadena.length();i++)
		{
			if (cadena.charAt(i)==c)
			{
				cuantos++;
			} 
		}
		return cuantos;
		
	}
	/**
	 * EJERCICIO 3: HACER UN MÉTODO QUE DADO UN NÚMERO, DIGA SI ES PAR O NO
	 */
	public static boolean ejercicio3 (int numero)
	{
		boolean par = false;
		if (numero%2==0)
		{
			par = true;
		}
		return par;
	}
	/**
	 * EJERCICIO 6: HACER UN MÉTODO QUE RECIBA UNA CADENA Y LA DEVUELVA ALREVÉS
	 */
	public static String ejercicio6 (String cadena)
	{
		String cadenaInvertida = "";
		int longitudCadena = cadena.length();
		for (int i=longitudCadena-1; i>=0;i--)
		{
			cadenaInvertida = cadenaInvertida + cadena.charAt(i);
		}
		return cadenaInvertida;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * EJERCICIO 1: HACER UN MÉTODO QUE RECIBA UNA CADENA Y UN CARACTER Y 
		 * DIGA SI ESE CARACTER PERTENECE A LA CADENA O NO
		 */
		System.out.println(ejercicio1("cadena",'c'));
		
		/**
		 * EJERCICIO 2: HACER UN MÉTODO QUE RECIBA UNA CADENA Y UN CARACTER Y DIGA CÚANTAS 
		 * VECES APARECE ESE CARACTER EN LA CADENA
		 */
		System.out.println(ejercicio2("cadena",'a'));
		
		/**
		 * EJERCICIO 3: HACER UN MÉTODO QUE DADO UN NÚMERO, DIGA SI ES PAR O NO
		 */
		System.out.println(ejercicio3(6));
		/**
		 * EJERCICIO 6: HACER UN MÉTODO QUE RECIBA UNA CADENA Y LA DEVUELVA ALREVÉS
		 */
		System.out.println(ejercicio6("cadena"));
		
		
	}

}
