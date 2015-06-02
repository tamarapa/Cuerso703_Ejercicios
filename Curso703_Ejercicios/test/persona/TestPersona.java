package persona;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import prueba.Persona;

public class TestPersona {
	
	public static Persona persona;
	public static String nombre;
	public static int edad;
	
	@Before
	public void inicia()
	{
		nombre = "tam";
		edad = 31;
		persona = new Persona(nombre, edad);
	}
	
	@Test
	public void testPersona()
	{
		Persona p1 = new Persona("tam", 31);
		Persona p2 = new Persona("tam", 31);
		assertTrue(p1.equals(p2));
	}
	
	@Test
	public void testGetNombre()
	{
		assertEquals("test get nombre: tam", "tamara", persona.setNombre("tamara"));
	}
	
	@Test
	public void testGetEdad()
	{
		assertEquals("test get edad: 31", 31, persona.getEdad());
	}
	
	@Test
	public void testSetEdad()
	{
		persona.setEdad(20);
		assertEquals("test set edad 20", 20, persona.getEdad());
	}
	
	

}
