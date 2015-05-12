package prueba;

import java.io.File;
/**
 * 
 * @author alumno
 *
 */
public class MainFicheros {
	/**
	 * método para recorrer un directorio
	 * @param ruta
	 */
	public static void recorrer(String ruta)
	{
		File f = null;
		f = new File(ruta);
		File [] arrayFicheros = f.listFiles();
		for (int i = 0; i < arrayFicheros.length; i++) {
			System.out.println(arrayFicheros[i]);
			if (arrayFicheros[i].isDirectory())
			{
				recorrer(arrayFicheros[i].getPath());
			}
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		recorrer(".");		
	}

}
