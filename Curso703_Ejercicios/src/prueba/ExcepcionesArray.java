package prueba;

public class ExcepcionesArray extends ArrayIndexOutOfBoundsException
{
	/**
	 * 
	 */
	private static final String MENSAJE_ERROR = "Te has salido del array ;)"; 

	public ExcepcionesArray ()
	{
		super(MENSAJE_ERROR);
	}
	
	@Override
	public void printStackTrace() {
		// TODO Auto-generated method stub
		//super.printStackTrace();
		System.out.println("ya no sale na, pringao!");
	}
}
