package Control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionJDBC 
{
	private static String url = "jdbc:postgresql://localhost:5432/Empresa";
	private static String usuario = "postgres";
	private static String password = "p057gr35";
	private static Connection conexion;
	 
	public static Connection crearConexion() throws ClassNotFoundException, SQLException
	{
		Class.forName("org.postgresql.Driver");
		conexion = DriverManager.getConnection(url, usuario, password);
		
		if (conexion != null)
		{
			System.out.print("Conexion establecida...\n");
			return conexion;
		}
		
		return null;
	}
	
	public static void cerrarConexion()
	{
		try 
		{
			conexion.close();
			System.out.print("Conexion finalizada");
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}
}
