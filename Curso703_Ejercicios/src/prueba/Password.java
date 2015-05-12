package prueba;

public class Password {

	private String palabraClave = null;	
	
	public Password(String palabra)
	{
		this.palabraClave = palabra;
	}
	
	public String encriptacion()
	{
		String claveEncriptada = "";
		int longitud = this.palabraClave.length();
		
		int caracterEncriptado = 0;
		for (int contador = 0; contador<longitud; contador++)
		{
			char caracter = 'x';
			caracter = this.palabraClave.charAt(contador);
			if (Character.isUpperCase(caracter))
			{
				caracterEncriptado = caracter*2;
			}
			else
			{
				caracterEncriptado = caracter*1;
			}
			if (Character.isDigit(caracter))
			{
				caracterEncriptado = caracter*3;
			}
			claveEncriptada = claveEncriptada + "@" + caracterEncriptado;			
		}
		return claveEncriptada;
	}
	
	public String desencriptacion(String claveEncriptada)
	{
		String caracteres[] = claveEncriptada.split("@");
		String clave = "";
		/*
		for (int x=0;x<a.length;x++)
			 System.out.println(a[x]);
			 */
		/**
		//int longitud = claveEncriptada.length();
		
		char caracter = 'x';
		
		// guardo el caracter de la posición 1 en clave 
		caracter = this.palabraClave.charAt(1);
		clave = clave + caracter;
		
		// el código de ese caracter lo multiplico por 2 y al convertirlo en string, 
		// pillo su longitud para avanzar en la posición de la 
		Integer codigoCaracter = caracter *2;
		String cadenaCodigoCaracter = codigoCaracter.toString();
		int longitudCadenaCodigoCaracter = cadenaCodigoCaracter.length();
		
		char caracter2 = 'x';
		caracter2 = this.palabraClave.charAt(1+longitudCadenaCodigoCaracter+1);
		clave = clave + caracter2;
		
		codigoCaracter = caracter2 *1;
		cadenaCodigoCaracter = codigoCaracter.toString();
		longitudCadenaCodigoCaracter = cadenaCodigoCaracter.length();
		
		
		for (int contador = 0; contador<longitud;contador++)
		{
			
			caracter = this.palabraClave.charAt(contador);			
		}
		*/
		return clave;
		
	}
	
	public String fortaleza()
	{
		String tipoFortaleza = "MIERDER";
		int longitud = this.palabraClave.length();
		if (longitud>6)
		{		
			if (Character.isUpperCase(this.palabraClave.charAt(0)))
			{
				if (this.palabraClave.charAt(longitud-3)==',')
				{
					if (Character.isDigit(this.palabraClave.charAt(longitud-2)))
					{
						if (Character.isDigit(this.palabraClave.charAt(longitud-1)))
						{
							tipoFortaleza = "GÜENA";
						}
						else
						{
							tipoFortaleza = "La clave deber terminar con dos números";
						}
					}
					else
					{
						tipoFortaleza = "La clave deber terminar con dos números";
					}
				}
				else
				{
					tipoFortaleza = "el antepenúltimo caracter tiene que ser una ,";
				}
			}
			else
			{
				tipoFortaleza = "La clave deber comenzar con una letra mayúscula";
			}
		}
		else
		{
			tipoFortaleza = "La clave debetener más de 6 caracteres";
		}
		return tipoFortaleza;
	}
}
