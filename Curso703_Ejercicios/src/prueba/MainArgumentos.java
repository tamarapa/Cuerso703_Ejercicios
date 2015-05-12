package prueba;

public class MainArgumentos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String straux = null;
		String palabraMasLarga = null;
		int longitudPalabraMasLarga = 0;
		int posicionPalabraMasLarga = 0;
		int longitudPalabra = 0;
		for (int i = 0; i < args.length; i++) {
			straux = args[i];
			longitudPalabra = straux.length();
			if (longitudPalabra>longitudPalabraMasLarga)
			{
				longitudPalabraMasLarga = longitudPalabra;
				posicionPalabraMasLarga = i;
				palabraMasLarga = args[i];
			}
		}
		System.out.println("PALABRA:"+palabraMasLarga);
		System.out.println("LONGITUD:"+longitudPalabraMasLarga);
		System.out.println("POSICION:"+posicionPalabraMasLarga);
	}

}
