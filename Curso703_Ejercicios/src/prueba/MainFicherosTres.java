package prueba;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainFicherosTres {
	public static boolean esFicheroCorrecto (File f)
	{
		return f.exists()&&f.isFile()&&f.canRead();
	}
	
	public static void mostrarArray (String[] array)
	{
		for (int i = 0; i < array.length; i++) {
			System.out.println((i+1)+"-> "+array[i]);
		}
	}
	
	public static String procesarLineaExprReg(String linea)
	{
		String emails = "";
		String expresion_regular_mails = "[ \\S\\s]*[\\*\\*\\*]{1}[\\S]+@[\\S]+/{3}[\\S\\s]*";
		Pattern pat = Pattern.compile(expresion_regular_mails);
		Matcher mat = pat.matcher(linea);
		while (mat.matches())
		{
			int posicionInicio = linea.indexOf("***")+3;
			int posicionFinal = linea.indexOf("///");
			String email = linea.substring(posicionInicio, posicionFinal);
			emails =  emails + "#" +email;
			linea = linea.substring(linea.indexOf("///")+3);
			mat = pat.matcher(linea);
		}
		return emails;
	}
	
	public static String procesarLinea(String linea)
	{
		String emails = "";
		// busca en la línea recibida ***
		// si no lo encuentra
		// mientras encuentre al menos una vez ***
		while (linea.indexOf("***")!=-1)
		{
			if ((linea.indexOf("***")!=-1)&&(linea.substring(linea.indexOf("***")).indexOf("///")!=-1))
			{
				int posicionInicio = linea.indexOf("***")+3;
				int posicionFinal = linea.indexOf("///");
				String email = linea.substring(posicionInicio, posicionFinal);
				emails =  emails + "#" +email;
			}
			//convierto línea en una nueva cadena desde donde encontró los asteriscos hasta el final
			linea = linea.substring(linea.indexOf("///")+3);
		}		
		return emails;
	}
	
	public static String [] ficheroToArrayOrdenado (String ruta)
	{
		String [] arraysplit = null;
		File f = new File(ruta);
		if (esFicheroCorrecto(f))
		{			
			try {
				FileReader fr = null;
				fr = new FileReader(f);
				BufferedReader br = new BufferedReader(fr);
				String linea = null;
				String emails = "";
				int i = 0;
				while ((linea = br.readLine())!=null)
				{
					//String lineaProcesada = procesarLinea(linea);
					String lineaProcesada = procesarLineaExprReg(linea);
					if (lineaProcesada!="")
					{
						emails =emails + lineaProcesada;
						System.out.println("EMAILS DESPUES DE LINEAPROCESADA: "+ emails);
						System.out.println();
						i++;
					}
				}
				//System.out.println(emails);
				arraysplit = emails.substring(1).split("#");
				Arrays.sort(arraysplit);
				br.close();
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return arraysplit;
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mostrarArray(ficheroToArrayOrdenado("fichero.txt"));
	}

}
