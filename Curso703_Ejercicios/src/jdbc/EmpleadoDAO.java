package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmpleadoDAO {
	public static List<EmpleadoDTO> recuperarTodos()
	{
		ResultSet rset = null;
		Statement stmt = null;		
		Connection conn = null;
		conn = Conexion.obtenerConexion(conn);
		stmt = Conexion.obtenerStatement(conn, stmt);
		try {
			rset = stmt.executeQuery(InstruccionesSQL.consultaSaldo());
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		ArrayList<EmpleadoDTO> al_e = new ArrayList<EmpleadoDTO>();
		EmpleadoDTO e = null;
		try {
			while (rset.next())
			{				
				e = new EmpleadoDTO(
						rset.getInt(1),
						rset.getString(2),
						rset.getString(3),
						rset.getString(4),
						rset.getString(5),
						rset.getString(6),
						rset.getString(7),
						rset.getString(8),
						rset.getString(9),
						rset.getString(10),
						rset.getString(11));
				//System.out.println(e.toString());
				al_e.add(e);
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Conexion.liberarRecursos(conn, stmt, rset);
		return al_e;
		
	}
}
