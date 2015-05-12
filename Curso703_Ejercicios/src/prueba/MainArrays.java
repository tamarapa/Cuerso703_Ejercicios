package prueba;

public class MainArrays {
	int[] array_de_enteros = new int[10];
	int[] array_de_entero2;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array1 = {1,2,3,4,5, 6, 7, 8, 9, 10};
		int aux = 0;	
		for(int i=0; i<array1.length; i++)
		{
			aux = array1[i];
			System.out.println(aux);
		}
	}

}
