package prueba;

import java.util.Comparator;

public class OrdenarPorEdad implements Comparator<Persona>{

	@Override
	public int compare(Persona p1, Persona p2) {
		// TODO Auto-generated method stub
		int comp = 0;
		if (p1.getEdad()<p2.getEdad())
		{
			comp = -1;
		}
		else
		{
			if (p1.getEdad()>p2.getEdad())
			{
				comp = 1;
			}
			else
			{
				comp = 0;
			}
		}
		return comp;
	}
}
