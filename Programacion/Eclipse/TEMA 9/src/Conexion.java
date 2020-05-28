
import java.sql.*;

public class Conexion {
		public static Connection conexion;
		public static Statement sentencia;
			public static void main(String[] args) {
		    
		    try{
		    	
		        Class.forName("com.mysql.jdbc.Driver");
		        
		        conexion=DriverManager.getConnection("jdbc:mysql://xlex.com.es:3306/COMERCIO","Alex","Tostus33,");
		        
		        System.out.println("Conexión realizada");
		        
		    }catch (ClassNotFoundException e){
		    	System.err.print("No se ha cargado el controlador");
		    	e.printStackTrace();
		    }catch (Exception e){
		    	System.err.print("Error en la conexión");
		    	e.printStackTrace();
		    }
		   
			}


}