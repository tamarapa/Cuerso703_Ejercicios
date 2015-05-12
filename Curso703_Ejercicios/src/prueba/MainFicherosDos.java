package prueba;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MainFicherosDos {
	//1 - leer de un fichero de texto y almacenarlo en un array de strings.
	public static String [] ficheroToArray (String ruta)
	{
		String [] arrayContenido = null;
		File f = new File(ruta);
		if (f.exists()&&f.isFile()&&f.canRead())
		{
			FileReader fr = null;
			try {
				fr = new FileReader(f);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			BufferedReader br = new BufferedReader(fr);
			//br.lines().count()
			try {
				String linea = null;
				int i = 0;
				while ((linea = br.readLine())!=null)
				{
					i++;
				}
				br.close();
				fr.close();
				fr = new FileReader(f);
				br = new BufferedReader(fr);
				if (i!=0)
				{
					arrayContenido = new String[i];
					for (int j = 0; j < arrayContenido.length; j++) {
						arrayContenido[j] = br.readLine();
					}
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return arrayContenido;
	}
		
	//2 - arrayToFichero
	// devuelve un boolean indicando si ha salido bien.
	public static void arrayToFichero (String nombreDestino, String[] contenido)
	{
		//boolean todoOk = false;
		File f = new File(nombreDestino);
		if (f.exists()&&f.isFile()&&f.canRead())
		{
			FileWriter fw;
			try {
				fw = new FileWriter(nombreDestino, true);
				BufferedWriter bw = new BufferedWriter(fw);
				for (int i = 0; i < contenido.length; i++) {
					System.out.println(contenido[i]);
					bw.write(contenido[i]);
					bw.newLine();
				}
				bw.close();
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		//return todoOk;
	}
	//3 - método que copie un fichero de bytes de uno a otro
	
	public static void ficheroToFichero (String nombreInicio, String nombreDestino) throws IOException
	{
		File fi = null;
		FileInputStream fis = null;
		
		File fd = null;
		FileOutputStream fos = null;
				
		try {
			fi = new File(nombreInicio);
			fis = new FileInputStream(fi);
			
			fd = new File(nombreDestino);
			fos = new FileOutputStream(fd);
			
			if (fi.exists()&&fi.isFile()&&fi.canRead()&&fd.exists()&&fd.isFile()&&fd.canRead())
			{
				fd.createNewFile();
				int linea = 0;
				while ((linea = fis.read())!=-1)
				{
					fos.write(linea);
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ficheroToArray("fich1.txt");
		arrayToFichero("fich2.txt",ficheroToArray("fich1.txt"));
		try {
			ficheroToFichero("foto1.png","foto2.png");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
