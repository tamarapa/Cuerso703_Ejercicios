package prueba;

public class Prueba {
    //creo el objeto
    
    public int calcula(){ //declaro una función
            return 1+1;//una operación
    }
    public static void main (String []argumentos){
            
            Prueba prueba = null; //declaración e inicialización de un objeto de la clase Prueba
            
            int resultado = 0; //declaro la variable auxiliar resultado
            //todas las variables se deben incializar al principio...
            
            prueba = new Prueba (); //creo el objeto de la clase Prueba con el constructor
            
            resultado = prueba.calcula(); //igualo la variable resultado al valor de la función 
            
            System.out.println(resultado);
    }

}
