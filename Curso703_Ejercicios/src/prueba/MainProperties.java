package prueba;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class MainProperties {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String idioma = "NO";
		idioma = args[0];
		Properties properties = new Properties();
		switch (idioma)
		{
			case "IT": try {
							properties.load(new FileInputStream("story_it.properties"));
						} catch (FileNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						System.out.println("Has especificado el idioma (IT)");
				break;
			case "EN": try {
							properties.load(new FileInputStream("story_en.properties"));
						} catch (FileNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						System.out.println("Has especificado el idioma (EN)");
				break;
			case "ES": try {
							properties.load(new FileInputStream("story_es.properties"));
						} catch (FileNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						System.out.println("Has especificado el idioma (ES)");
				break;
			default: System.out.println("No has especificado el idioma (EN/ES/IT)");
				
				break;
		}
		/*
		 Set<String> prop = properties.stringPropertyNames();  
		 System.out.println("" + prop);
		 System.out.println("" + prop.size());
		 for (int i = 0; i < prop.size(); i++) 
		 {
			 
		 }
		 */
		if (idioma!="NO")
		{
			String cuento = null;
			cuento = properties.getProperty("start")+" "+properties.getProperty("body")+" "+properties.getProperty("end");
			System.out.println(cuento);
			String ficheroDestino = properties.getProperty("outfile");
			FileWriter fw;
			try {
				fw = new FileWriter(ficheroDestino, false);
				BufferedWriter bw = new BufferedWriter(fw);
				bw.write(cuento);
				bw.newLine();
				bw.close();
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else
		{
			System.out.println(idioma);
		}
		
			
	}

}
