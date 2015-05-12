package prueba;

public class MainArrays2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//asigno el caracter buscado que esta en la última posición
		char c = args[args.length-1].charAt(0);
		int numeroCaracteres = 0;
		//recorro el array hasta la penúltima posición
		for (int i=0;i<args.length-2;i++)
		{		
			//recorro las letras de la palabra buscando el caracter
			for (int j=0;j<args[i].length();j++)
			{
				if (args[i].charAt(j)==c)
				{
					numeroCaracteres++;
				}
			}
		}
		System.out.println("EL CARACTER BUSCADO ES: "+c);
		System.out.println("Nº DE VECES QUE APARECE: "+numeroCaracteres);
	}

}
