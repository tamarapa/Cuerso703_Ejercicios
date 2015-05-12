//package val.examples.basic.recursion;

/**
 * 
 * 
 * @author Val
 *
 *El código de esta clase, es un poco misterioso. Algún programador Clase "C", no ha usado
 *nombres descriptivos y ahora, nos toca pegarnos y descubrir qué narices hace este código, 
 *para poder usarlo en nuestro proyecto.
 *
 *
 *Se pide:
 *
 *1) Adivinar la funcionalidad del método adivinaQueHace
 *2) Una vez descubierto, aplicar un nombre apropiado al método y a la clase
 *3) Idear un método equivalente, pero distinto. Es decir, crear un método 
 *que haga lo mismo que adivinaQueHace, pero de otra manera.
 *4) EXTRA: Sólo si resolviste los puntos anteriores, implementa una versión recursiva
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
		
		// mientras i<=j y bd sea verdadero... que se cumpla que los caracteres que está comparando dentro del while son iguales
		while ((i<=j)&&(bd))
		{
			// comparamos el primer caracter de la palabra con el último
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
