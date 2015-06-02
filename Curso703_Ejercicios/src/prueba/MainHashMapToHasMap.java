package prueba;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class MainHashMapToHasMap {

	public static Map<Integer, Integer> ordenaPorClave (HashMap<Integer, Integer> hm)
	{
		LinkedHashMap<Integer, Integer> lhm = null;
		TreeMap<Integer, Integer> tm = new TreeMap<Integer, Integer>(); //me creo un árbol
		tm.putAll(hm);//él solito va a ordenar todos los valores
		
		lhm = new LinkedHashMap<Integer, Integer>();//me creo un hashmap enlazado, que respeta el orden de inserción
		lhm.putAll(tm);//y vuelco allí la colección, ya ordenada previamente por TreeMap
		return lhm;
	}
	
	
	public static Map<Integer,Integer> ordenaPorValor(HashMap<Integer,Integer> hm)
	{
		LinkedHashMap<Integer, Integer> lhm = null;
		Integer int_aux = null;
		
		ArrayList<Integer> al_valores = new ArrayList<Integer>();//en este array, guardaré los valores del hashmap
		ArrayList<Integer> al_claves = new ArrayList<Integer>();//y en este, las claves
		
		al_valores.addAll(hm.values());//despues de estas lineas, tengo dos arrays, uno con personas y otros con coches, 
		al_claves.addAll (hm.keySet());//pero lo importante, es que el orden en que se guardan, es igual que el original
		
		TreeSet<Integer> tm = new TreeSet<Integer>();//ahora me creo el TreeSet, 
		tm.addAll(hm.values());//que ordenará a las personas (values) por el orden natural
		
		
		lhm = new LinkedHashMap<Integer, Integer>(); //iniciaizo la estructura de salida
		Iterator<Integer> it = tm.iterator();//y me dispongo a recorrer el árbol ordenado
		
		while (it.hasNext())
		{
			int_aux = (it.next());//Obteno la persona en curso ( la primera vez, sera la de menor edad)
			lhm.put(al_claves.get(al_valores.indexOf(int_aux)), int_aux);//aquí está la clave: en la salida, pongo a esa persona, y para recoger su clave asociada, uso los arrays de claves y valores, donde habia guardado su correspondencia
			//en el indice (posicion), donde estuviera la persona, estara tambien la clave (en el otro array, pero en la misma posicion)
		}
		
		
		return lhm;		
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Persona p1 = new Persona("Pepe",32);
		//Persona p2 = new Persona("Juan",56);
		
		HashMap<Integer,Integer> m = new HashMap <Integer, Integer>();
		m.put(1, 7);
		m.put(2, 5);
		System.out.println(ordenaPorClave(m));
		System.out.println(ordenaPorValor(m));
		
	}

}
