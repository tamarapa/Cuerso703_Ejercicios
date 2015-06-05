package evaluacion.primera;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class RegionDAO {
	
	public static List<RegionDTO> obtenerTodasLasRegiones () throws SQLException
	{
		ResultSet rset = null;
		Statement stmt = null;		
		Connection conn = null;
		try {
			conn = Conexion.obtenerConexion();
			stmt = conn.createStatement();
			rset = stmt.executeQuery(InstruccionesSQL.CONSULTAR_TODAS_REGIONES);
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		ArrayList<RegionDTO> lista_regiones = new ArrayList<RegionDTO>();
		
		RegionDTO objeto_region = null;
		try {
			while (rset.next())
			{
				objeto_region = new RegionDTO(rset.getInt(1),rset.getString(2));
				lista_regiones.add(objeto_region);
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		finally{
			Conexion.liberarRecursos(conn, stmt, rset);
		}
			
		return lista_regiones;
		
	}
	
	public static List<RegionDTO> obtenerRegionPorId (String id) throws SQLException
	{
		ResultSet rset = null;
		Statement stmt = null;		
		Connection conn = null;
		try {
			conn = Conexion.obtenerConexion();
			stmt = conn.createStatement();
			rset = stmt.executeQuery(InstruccionesSQL.CONSULTAR_REGION_ID + id);
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		ArrayList<RegionDTO> lista_regiones = new ArrayList<RegionDTO>();
		
		RegionDTO objeto_region = null;
		try {
			while (rset.next())
			{
				objeto_region = new RegionDTO(rset.getInt(1),rset.getString(2));
				lista_regiones.add(objeto_region);
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		finally{
			Conexion.liberarRecursos(conn, stmt, rset);
		}
		
		return lista_regiones;		
	}

	public static void insertarRegion(String nombreRegion, int posicion) throws SQLException 
	{
		Connection conn = null;
		PreparedStatement ps = null;
		conn.setAutoCommit(false);
		Savepoint sp;
		sp = conn.setSavepoint();
		try {
			conn = Conexion.obtenerConexion();
			posicion++;
			
		    ps = conn.prepareStatement(InstruccionesSQL.INSERTAR_REGION_PS);
		    ps.setInt(1,posicion);
		    ps.setString(2,nombreRegion);
		    ps.execute();					
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
			conn.rollback(sp);
		}
		finally{
			Conexion.liberarRecursos(conn, ps);
		}
	}
}
