//package val.examples.basic.recursion;

/**
 * 
 * 
 * @author Val
 *
 *El c�digo de esta clase, es un poco misterioso. Alg�n programador Clase "C", no ha usado
 *nombres descriptivos y ahora, nos toca pegarnos y descubrir qu� narices hace este c�digo, 
 *para poder usarlo en nuestro proyecto.
 *
 *
 *Se pide:
 *
 *1) Adivinar la funcionalidad del m�todo adivinaQueHace
 *2) Una vez descubierto, aplicar un nombre apropiado al m�todo y a la clase
 *3) Idear un m�todo equivalente, pero distinto. Es decir, crear un m�todo 
 *que haga lo mismo que adivinaQueHace, pero de otra manera.
 *4) EXTRA: S�lo si resolviste los puntos anteriores, implementa una versi�n recursiva
 *
 */
public class DaleNombre {
	
	private static boolean adivinaQueHace (String cad)
	{
		boolean bd = true;
		// inicializo i a 0
		int i = 0;
		// inicializo j con la longitud de la cadena -1
		int j = cad.length()-1;
		
		// mientras i<=j y bd sea verdadero... que se cumpla que los caracteres que est� comparando dentro del while son iguales
		while ((i<=j)&&(bd))
		{
			// comparamos el primer caracter de la palabra con el �ltimo
			bd = cad.charAt(i)==cad.charAt(j);
			// i + 1
			i++;
			// j - 1
			j--;
		}	
		
		return bd;
	}
	
	public static void main(String[] args) {
		if (adivinaQueHace("ana"))
		{
			System.out.println("VERDADERO");
		} else 
		{
			System.out.println("FALSO");
		}
	}

}
