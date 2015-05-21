package prueba;

import java.io.Serializable;

public class Persona implements Serializable, Comparable<Persona>{
	private String nombre;
	private int edad;
	static final int MAYOR_EDAD = 18;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * Constructor de la clase persona que recibe los parámetros
	 * @param r_nombre nombre de la persona
	 * @param r_edad edad de la persona
	 */
	public Persona (String r_nombre, int r_edad) {
		this.nombre = r_nombre;
		this.edad = r_edad;
	}
	
	public Persona() {
		// TODO Auto-generated constructor stub
	}

	public void mostrarNombre (){
		System.out.print(this.nombre);
	}
	
	public void mostrarEdad (){
		System.out.print(this.edad);
	}
	
	public boolean esMayorDeEdad (){
		return (this.edad>=MAYOR_EDAD);
	}
	
	public String toString() {
		// TODO Auto-generated method stub
		String estado = null;
		estado = this.nombre + "|" +this.edad;
		return estado;
	}
	
	/**
	 * 
	 * 
	 * @param ob
	 * @return  
	 */
	public boolean equals(Object ob) {
	// TODO Auto-generated method stub
		Persona p_aux = null;
		
		/**
		 * código del profesor para hacer la misma comparación
		 */
		
		/*
		boolean dev = false;
		dev = 	(null!=ob)&&
				(	
					(ob==this)||
					(
						(null!=(p_aux=esTipoPersona(ob))
					)&&
					(contienenLoMismo(this,p_aux))
					)
				)
		return dev;
		*/
		
		boolean sonIguales= false;
		if (ob == this)
		{
			sonIguales = true;
		}
		else
		{
			if (ob instanceof Persona) {
				p_aux = (Persona) ob;
				if ((this.nombre.equals(p_aux.nombre))&&(this.edad==p_aux.edad))
				{
					sonIguales = true;
				}
			}
		}
		//p_aux = (Persona) ob;
		
		return sonIguales;
	}
	
	public Persona UNO_sumaEdad(Persona p, int annos)
	{
		Persona pNuevo = null;
		pNuevo = new Persona(p.getNombre(),p.getEdad()+annos);
		return pNuevo;
	}
	
	public void DOS_sumaEdad(int annos)
	{
		this.edad = this.edad + annos;
	}
	
	public static void TRES_sumaEdad(Persona p, int annos)
	{
		p.setEdad(p.getEdad() + annos);
	}

	@Override
	public int compareTo(Persona p) {
		// TODO Auto-generated method stub
		int comp = 0;
		if (this.edad==p.getEdad())
		{
			comp = 0;
		}
		else
		{
			if (this.edad>p.getEdad())
			{
				comp = 1;
			}
			else
			{
				comp = -1;
			}
		}
		return comp;
	}
	
}
