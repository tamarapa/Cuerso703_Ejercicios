package prueba;

import java.util.Scanner;

public class QueHace {

	int a;// por estar declarada aquí, fuera de cualquier método; a es un
			// atributo de la clase. Por lo tanto, es accesible y visible desde
			// todos los métodos de la clase
	static int b = 50;

	void metodo() {
		System.out.println(a);
		a++; // equivalente --> a = a + 1;
	}
	public QueHace (){
		a = 0;
	}
	public QueHace (int valor){
		a = valor;
	}

	public static void main(String args[]) {
		QueHace qh1 = null;
		QueHace qh2 = null;
		String nombre = null;
		int edad = 0;

		qh1 = new QueHace();
		qh2 = new QueHace();
		qh1.metodo();
		qh1.metodo();
		qh1.a = 33;
		qh1.metodo();
		System.out.println(qh1.a);
		System.out.println(qh1.b);
		qh2.metodo();
		qh1.b++;
		System.out.println(qh1.b);
		System.out.println(qh2.b);
		System.out.println(QueHace.b);
		
		/*
		Scanner sc = new Scanner(System.in); //clase scanner para introducir datos por teclado
		System.out.print("Introduzca nombre: ");
		nombre = sc.next();
		System.out.print("Introduzca edad: ");
		edad = sc.nextInt();
		System.out.println("NOMBRE:"+nombre);
		System.out.println("EDAD:"+edad);
		*/
		QueHace qh7 = null;
		qh7 = new QueHace();
		System.out.println("método sin parámetro:" +qh7.a);
		qh7 = new QueHace(7);
		System.out.println("método con parámetro:" +qh7.a);
	}

}
