package prueba;

public class EsCapicua {

	public static String cadenaInvertida (String cadena)
	{
		String cadenaInvertida = "";
		int longitudCadena = cadena.length();
		for (int i=longitudCadena-1; i>=0;i--)
		{
			cadenaInvertida = cadenaInvertida + cadena.charAt(i);
		}
		return cadenaInvertida;
	}
	
	public static boolean esCapicuaRecursiva (String cadena)
	{
		boolean esIgual = true;
		if (cadena.length()==1)
		{
			esIgual = true;
		}
		else
		{
			if (cadena.toUpperCase().charAt(0)==cadena.toUpperCase().charAt((cadena.length()-1)))
			{
				esIgual = esCapicuaRecursiva(cadena.substring(1, cadena.length()-1));
			}
			else
			{
				esIgual = false;
			}
		}
		return esIgual;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena = "Arribalabirra";
		System.out.println(cadenaInvertida(cadena));
		if (cadena.equals(cadenaInvertida(cadena)))
		{
			System.out.println("VERDADERO");
		}
		else
		{
			System.out.println("FALSO");
					
		}
		System.out.println("FORMA RECURSIVA: "+esCapicuaRecursiva(cadena));
	}

}
