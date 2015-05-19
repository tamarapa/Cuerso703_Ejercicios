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
	
	public static Persona[] array_personas;
	
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
		Persona persona = null;
		if (estaVacia()== false)
		{
			boolean encontrado = false;
			int i = 0;
			while ((encontrado!= true)&&(i < this.array_personas.length))
			{
				if (this.array_personas[i]!=null)
				{
					if (this.array_personas[i].getNombre()==nombre)
					{
						encontrado = true;
						persona = this.array_personas[i];
					}
				}
				i++;
			}
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
		while ((encontrado!= true)&&i < this.array_personas.length)
		{
			if (this.array_personas[i].getEdad()==edad)
			{
				encontrado = true;
				persona = this.array_personas[i];
			}
			i++;
		}
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
		Properties properties = new Properties();
		ListaPersonas listaNueva = null;
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
			listaNueva = (ListaPersonas)ois.readObject();
			ois.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return listaNueva;
	}
	
	public void insertarPersona (Persona p) throws InsertarPersonaException
	{
		//TODO para evitar duplicdor utilizar el método de buscar persona
		System.out.println("Buscando a "+ p.getNombre()+ " -> " + buscarPersona(p.getNombre()));
		if (buscarPersona(p.getNombre())==null)
		{
			System.out.println(p.getNombre() + " NO encontrado");
			if (!estaLlena())
			{
				System.out.println("Insertando a "+p.getNombre());
				int i = 0;
				boolean insertado = false;
				do
				{
					if (array_personas[i]==null)
					{
						array_personas[i] = p;
						insertado = true;
					}
					i++;
				}while ((insertado == false)&&(this.array_personas[i]==null)&&(i<this.array_personas.length));
				this.totalPersonas++;
			}
			else
			{
				System.out.println("La lista esta llena, "+p.getNombre() + " no se ha podido insertar");
				throw new InsertarPersonaException();
			}
		}
		else
		{
			System.out.println(p.getNombre() + " ya existe");
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
		for (int i = 0; i < this.array_personas.length; i++) {
			if (this.array_personas[i]!=null)
			{
				this.array_personas[i].toString();
			}
		}
	}

	//métodos nuevos
	
	public boolean estaVacia()
	{
		return this.totalPersonas==0;
	}
	
	public void eliminarPersona(Persona p)
	{
		System.out.println("Eliminando a "+p.getNombre());
		if (!estaVacia())
		{
			if (buscarPersona(p.getNombre())!=null)
			{
				System.out.println(p.getNombre() + " existe en el array");
				int i = 0;
				boolean borrado = false;
				do {
					//if (this.array_personas[i].getNombre().equals(p.getNombre()))
					if (this.array_personas[i].getNombre()==p.getNombre())
					{
						this.array_personas[i] = null;
						borrado = true;
					}
					i++;
				} while (!(borrado)&&(i<this.array_personas.length));
			}
			else
			{
				System.out.println(p.getNombre() + " NO existe en el array");
			}
		}
	}
	
	public ListaPersonas combinarListas(ListaPersonas l1, ListaPersonas l2)
	{
		int tamanio = l1.numeroPersonas() + l2.numeroPersonas();
		ListaPersonas listaCombinada = new ListaPersonas();
		
		return listaCombinada;
	}

}
