package evaluacion.primera;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import jdbc.EmpleadoDTO;



public class RegionDAO {
	
	public static List<RegionDTO> obtenerTodasLasRegiones () throws SQLException
	{
		ResultSet rset = null;
		Statement stmt = null;		
		Connection conn = null;
		try {
			conn = Conexion.obtenerConexion();
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			//conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "HR", "YAKO");
			
			//stmt = Conexion.obtenerStatement(conn, stmt);
			stmt = conn.createStatement();
			rset = stmt.executeQuery(InstruccionesSQL.CONSULTAR_TODAS_REGIONES);
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		//System.out.println(rset.toString());
		
		//hacer métodos para todas las opciones del ejercicio
		//crear otro método para meter ese recordset en un arraylist
		/**
		 * desde aqui
		 */
		ArrayList<RegionDTO> lista_regiones = new ArrayList<RegionDTO>();
		
		RegionDTO objeto_region = null;
		try {
			while (rset.next())
			{
				System.out.println(rset.getInt(1)+"|"+rset.getString(2));
				objeto_region = new RegionDTO(rset.getInt(1),rset.getString(2));
				lista_regiones.add(objeto_region);
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		Conexion.liberarRecursos(conn, stmt, rset);
		
		return lista_regiones;
		/**
		 * hasta aqui
		 */
		
	}
	public static List<RegionDTO> obtenerRegionPorId (String id) throws SQLException
	{
		ResultSet rset = null;
		Statement stmt = null;		
		Connection conn = null;
		try {
			conn = Conexion.obtenerConexion();
			stmt = conn.createStatement();
			System.out.println(InstruccionesSQL.CONSULTAR_REGION_ID + id);
			rset = stmt.executeQuery(InstruccionesSQL.CONSULTAR_REGION_ID + id);
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		//System.out.println(rset.toString());
		
		//hacer métodos para todas las opciones del ejercicio
		//crear otro método para meter ese recordset en un arraylist
		/**
		 * desde aqui
		 */
		ArrayList<RegionDTO> lista_regiones = new ArrayList<RegionDTO>();
		
		RegionDTO objeto_region = null;
		try {
			while (rset.next())
			{
				System.out.println(rset.getInt(1)+"|"+rset.getString(2));
				objeto_region = new RegionDTO(rset.getInt(1),rset.getString(2));
				lista_regiones.add(objeto_region);
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		Conexion.liberarRecursos(conn, stmt, rset);
		
		return lista_regiones;
		/**
		 * hasta aqui
		 */
		
	}
}
