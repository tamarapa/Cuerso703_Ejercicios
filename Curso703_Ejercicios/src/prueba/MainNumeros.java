package prueba;


public class MainNumeros {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = 0;
		int mayor = 0;
		for (int contador=1;contador<4;contador++)
		{
			System.out.println("NÚMERO "+contador);			
			numero = Funciones.pedirNumero();
			mayor = Math.max(numero, mayor);
			//mayor = Funciones.devuelveMayor(numero,mayor);
		}
		System.out.println("EL MAYOR ES: "+mayor);

	}

}
