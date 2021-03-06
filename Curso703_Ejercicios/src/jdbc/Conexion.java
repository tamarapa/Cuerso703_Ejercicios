package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;

public class Conexion {
	
	private static Conexion conn = new Conexion();
	
	private Conexion()
	{
		conn.setAutoCommit(false);
		Savepoint sp;
		sp = conn.setSavepoint();
		
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "HR", "YAKO");
		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
			conn.rollback(sp);
		}
	}
	
	public static Connection obtenerConexion() throws SQLException
	{		
		return conn;
	}
	
	public static Statement obtenerStatement(Connection conn, Statement stmt)
	{
		try {
			stmt = conn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return stmt;
	}
	
	public static void liberarRecursos(Connection conn, Statement stmt, ResultSet rset)
	{
		if (rset != null) 	{ try { rset.close(); } catch (Exception e2) { e2.printStackTrace(); }}
		if (stmt != null)	{ try {	stmt.close(); } catch (Exception e2) { e2.printStackTrace(); }}
		if (conn != null) 	{ try { conn.close(); } catch (Exception e3) { e3.printStackTrace(); }}
	}
}
