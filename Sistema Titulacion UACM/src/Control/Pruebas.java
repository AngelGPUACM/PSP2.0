package Control;

import java.sql.SQLException;

public class Pruebas 
{
    public static void main(String[] args)
	{	
		try 
		{
			ConexionJDBC.crearConexion();
		}
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
		ConexionJDBC.cerrarConexion();
	}
	
}
