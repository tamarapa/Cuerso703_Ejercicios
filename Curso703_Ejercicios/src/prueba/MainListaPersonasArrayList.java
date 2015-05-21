package prueba;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;


public class MainListaPersonasArrayList  {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p1 = new Persona("Pepe",32);
		Persona p2 = new Persona("Juan",56);
		/*
		ArrayList<Persona> al = new ArrayList<Persona>();
		
		al.add(p1);
		al.add(p2);
		
		System.out.println("FOR EACH:");
		System.out.println("------------------------------");
		for (Persona elementoLista : al) {
			System.out.println(elementoLista.getNombre());//for each, válido para recorrer Colecciones
		}
		//System.out.println();
		System.out.println("\nITERATOR:");
		System.out.println("------------------------------");
		Iterator <Persona> puntero = al.iterator();
		while (puntero.hasNext()) 
		{
			Persona p = puntero.next();
			System.out.println(p.getNombre());
		}
		
		Persona j = new Alumno();
		List<Persona> l = new ArrayList <Persona>();
		*/
		/*
		Map<String,Persona> m = new HashMap <String, Persona>();
		m.put("1", p1);
		m.put("2", p2);
		m.put("3", p1);
		m.put("3", p2);
		System.out.println(m);
		System.out.println("2 -> " + m.get("2"));
		m.remove("2");
		System.out.println(m);
		*/
		
		Persona a1 = new Alumno("pepe", (byte) 32, 10);
		Persona a2 = new Alumno("juan", (byte) 24, 2);
		Persona a3 = new Alumno("ana", (byte) 24, 8);
		/*
		Map<String,Persona> m2 = new LinkedHashMap<String,Persona>();
		m2.put("2", p2);
		m2.put("5", p1);
		m2.put("1", p1);
		System.out.println("LinkedHashMap-> "+m2);
		
		Map<Integer,Alumno> m3 = new TreeMap<Integer,Alumno>();
		
		m3.put(((Alumno)a1).getNota(), a1);
		m3.put(((Alumno)a2).getNota(), a2);
		m3.put(((Alumno)a3).getNota(), a3);
		
		System.out.println("TreeMap-> "+m3);
		*/
		/*
		System.out.println("p1.edad = :"+p1.getEdad());
		System.out.println("p2.edad = :"+p2.getEdad());
		System.out.println(p1.compareTo(p2));
		
		Set<Persona> s = new TreeSet<Persona>();
		s.add(a1);
		s.add(a2);
		s.add(a3);
		System.out.println(s);
		*/
		ArrayList<Persona> al = new ArrayList<Persona>();
		OrdenarPorNombre opn = new OrdenarPorNombre();
		OrdenarPorEdad ope = new OrdenarPorEdad();
		
		al.add(p1);
		al.add(p2);
		
		Collections.sort(al,opn);
		System.out.println("Lista ordenadarrrr por nombreeeer: "+al);
		
		Collections.sort(al,ope);
		System.out.println("Lista ordenadarrrr por edad: "+al);
		
		
	}

}
