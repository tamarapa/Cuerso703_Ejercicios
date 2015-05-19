package prueba;

public class Alumno extends Persona{

	public enum RangoNotas {SUSPENSO,APROBADO,BIEN,NOTABLE,SOBRESALIENTE,MATRICULA}
	
	private int nota;
	private RangoNotas notaConLetras = RangoNotas.SUSPENSO;

	public RangoNotas getNotaConLetras() {
		return notaConLetras;
	}

	
	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}
	
	private RangoNotas notasPalabras()
	{
		RangoNotas notaPalabra = null;
		switch (this.nota)
		{
			case 10:
			case 9: 	notaPalabra = RangoNotas.SOBRESALIENTE;
						break;
			case 8:
			case 7: 	notaPalabra = RangoNotas.NOTABLE;
						break;
			case 6: 	notaPalabra = RangoNotas.BIEN;
						break;
			case 5: 	notaPalabra = RangoNotas.APROBADO;
						break;
			default: 	notaPalabra = RangoNotas.SUSPENSO;
						break;
		
		}
		return notaPalabra;
	}
	
	public String toString(){
		String estado = null;
		estado = "NOMBRE: "+this.getNombre()+" / EDAD: "+this.getEdad()+" / NOTA: "+this.getNota()+" / NOTA CON LETRA: "+getNotaConLetras();
		return estado;
	}

	public Alumno(String r_nombre, byte r_edad) {
		//super(r_nombre, r_edad);
		// TODO Auto-generated constructor stub
	}

	public Alumno(String r_nombre, byte r_edad, int r_nota) {
		//llamo al constructor del padre
		//comentario para ver si actualiza
		super(r_nombre, r_edad);
		this.nota = r_nota;
		this.notaConLetras = this.notasPalabras();
	}


	public Alumno() {
		// TODO Auto-generated constructor stub
	}

}
