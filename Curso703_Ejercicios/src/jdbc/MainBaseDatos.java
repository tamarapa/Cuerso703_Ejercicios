package jdbc;


import java.sql.Savepoint;
import java.util.List;

public class MainBaseDatos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//
		List<EmpleadoDTO> al_e = EmpleadoDAO.recuperarTodos();	
		System.out.println(al_e.toString());   

	}

}
