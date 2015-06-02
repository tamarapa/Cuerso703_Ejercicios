package jdbc;

public class InstruccionesSQL {
	

	public static String consultaSaldo() {
		// TODO Auto-generated method stub
		String consultaSQL = null;
		consultaSQL = "select * from employees where salary>3000 order by salary desc";
		return consultaSQL;
	}
}
