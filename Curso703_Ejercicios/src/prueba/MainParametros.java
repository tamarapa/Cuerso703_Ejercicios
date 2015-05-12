package prueba;

public class MainParametros {

	// metodo que con un array de enteros y un valor incrementarl me devuelva un nuevo 
	// array que sea el resultado de sumar el valor incremental al array de entrada
	public static void arraySumaEntero(int [] arrray,int inc)
	{
		for (int j=0; j<arrray.length;j++)
		{
			arrray[j] = arrray[j]+ inc;
		}
	}
	
	public static int [] sumaArray(int [] array2, int valor)
	{
		int [] array3 = new int [array2.length];
		for (int i=0;i<array2.length;i++)
		{
			array3[i] = array2[i]+valor;
		}
		return array3;
	}
	

	
	public static void mostrarArraySumaEntero(int [] arrray)
	{
		for (int j=0; j<arrray.length;j++)
		{
			System.out.println(arrray[j]);
		}
	}
	
	public static void porValor (int a)
	{
		a = a+7;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int a = 5;
		porValor(a);
		System.out.println(a);
		*/
		int inc = 2;
		int [] arrray = {3,5,8};
		arraySumaEntero(arrray, inc);
		mostrarArraySumaEntero(arrray);
	}

}
