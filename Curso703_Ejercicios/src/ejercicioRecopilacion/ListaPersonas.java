package ejercicioRecopilacion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Properties;

import prueba.Persona;
import ejercicioRecopilacion.exceptions.InsertarPersonaException;

public class ListaPersonas {
	
	public static final int CAPACIDAD = 10;
	
	private Persona[] array_personas;
	
	private int totalPersonas;
	
	/**
	 * Es muy posible que haga falta añadir algún campo más
	 */
	
	public ListaPersonas()
	{
		//TODO HAY QUE HACER UN CONSTRUCTOR
		//RECUERDA QUE EL CONSTRUCTOR SIRVE PARA
		//RESERVAR MEMORIA
		//INICIALIZAR EL ESTADO DEL OBJETO Y SUS ATRIBUTOS
		this.array_personas = new Persona[CAPACIDAD];
		this.totalPersonas = 0;
	}
	
	public Persona[] getListaPersonas ()
	{
		//TODO HAY QUE DEVOLVER EL ARRAY DE PERSONAS QUE CONFORMAN LA LISTA
		return this.array_personas;
	}
	
	public Persona buscarPersona (String nombre)
	{
		//TODO BUSCAR PERSONA POR NOMBRE Y DEVOLVERLA
		//SI NO ESTÁ, DEVOLVER NULO
		boolean encontrado = false;
		Persona persona = null;
		int i = 0;
		do
		{
			if (this.array_personas[i].getNombre().equals(nombre))
			{
				encontrado = true;
			}
			i++;
		}
		while ((encontrado!= true)&&(i < this.array_personas.length));
		
		if (encontrado)
		{
			persona = this.array_personas[i];
		}
		return persona;
	}
	
	public Persona buscarPersona (int edad)
	{
		//TODO BUSCAR PERSONA POR EDAD Y DEVOLVERLA
		//SI NO ESTÁ, DEVOLVER NULO
		boolean encontrado = false;
		Persona persona = null;
		int i = 0;
		do
		{
			if (this.array_personas[i].getEdad()==edad)
			{
				encontrado = true;
				persona = this.array_personas[i];
			}
			i++;
		}
		while ((encontrado!= true)&&i < this.array_personas.length);
		return persona;
	}
	
	public boolean serializar ()
	{
		//Hacer uso del fichero de propiedades serializa.properties, 
		//para obtener de él el valor de la clave destino, 
		//que representa el nombre del fichero de salida
		boolean todoOk = true;
		Properties properties = new Properties();
		try {
			properties.load(new FileInputStream("serializa.properties"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			todoOk = false;
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			todoOk = false;
			e.printStackTrace();
		}
		
		String ficheroDestino = properties.getProperty("destino");
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ficheroDestino));
			oos.writeObject(this);
			oos.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			todoOk = false;
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			todoOk = false;
			e.printStackTrace();
		}
		return todoOk;
	}
	
	public ListaPersonas deserializar()
	{
		//recojo de propiedades el archivo donde esta la serialización
		Properties properties = new Properties();
		
		try {
			properties.load(new FileInputStream("serializa.properties"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String ficheroDestino = properties.getProperty("destino");
		//leo el objeto		
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ficheroDestino));
			this.equals((ListaPersonas)ois.readObject());
			ois.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return this;
	}
	
	public void insertarPersona (Persona p) throws InsertarPersonaException
	{
		if (!estaLlena())
		{
			int i = 0;
			boolean salir = false;
			do {
				if ((this.array_personas[i]==null)&&!(this.array_personas[i].getNombre().equals(p.getNombre()))&&!(this.array_personas[i].getEdad()==p.getEdad()))
				{
					array_personas[i] = p;
					salir = true;
				}
				
			} while ((salir=false)&&(i<this.array_personas.length));
			this.totalPersonas++;
		}
		else
		{
			throw new InsertarPersonaException();
		}
	}
	
	public int numeroPersonas()
	{
		return this.totalPersonas;
	}
	
	public boolean estaLlena()
	{
		return this.totalPersonas==CAPACIDAD;
	}
	
	public void mostrar()
	{
		//TODO MOSTRAR LA LISTA DE PERSONAS
		// pista: ayudarse del método toString de persona
		for (int i = 0; i < this.array_personas.length; i++) {
			array_personas[i].toString();
		}
	}

}
