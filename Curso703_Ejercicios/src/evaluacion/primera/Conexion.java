package evaluacion.primera;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;
import java.util.Properties;

public class Conexion {
	private static Connection conn;
	private static Conexion conexion = new Conexion();
	
	private Conexion ()  
	{
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Properties properties = new Properties();
			properties.load(new FileInputStream("conexion.properties"));
			String cadenaConexion;
			cadenaConexion = "jdbc:oracle:thin:@ " + properties.getProperty("server")+ ":" + properties.getProperty("port") + ":" +properties.getProperty("db");
			this.conn = DriverManager.getConnection(cadenaConexion, properties.getProperty("user"), properties.getProperty("pass"));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
					
	}
	
	public static Connection obtenerConexion ()
	{
		try {
			conexion.conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "HR", "YAKO");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conexion.conn;
	}
	
	public static void liberarRecursos(Connection conn, Statement stmt, ResultSet rset)
	{
		if (rset != null) 	{ try { rset.close(); } catch (Exception e2) { e2.printStackTrace(); }}
		if (stmt != null)	{ try {	stmt.close(); } catch (Exception e2) { e2.printStackTrace(); }}
		if (conn != null) 	{ try { conn.close(); } catch (Exception e3) { e3.printStackTrace(); }}
	}
	
	public static void liberarRecursos(Connection conn, PreparedStatement ps)
	{
		if (ps != null)	{ try {	ps.close(); } catch (Exception e2) { e2.printStackTrace(); }}
		if (conn != null) 	{ try { conn.close(); } catch (Exception e3) { e3.printStackTrace(); }}
	}
}
