package prueba;

import java.util.Comparator;

public class OrdenarPorNombre implements Comparator<Persona>{

	public OrdenarPorNombre()
	{
		
	}
	@Override
	public int compare(Persona p1, Persona p2) {
		// TODO Auto-generated method stub
		return p1.getNombre().compareTo(p2.getNombre());
	}
}
