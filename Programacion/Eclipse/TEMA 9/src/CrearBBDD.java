
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class CrearBBDD {
	 static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	 static final String DB_URL = "jdbc:mysql://xlex.com.es/";
	 static final String USER = "Alex";
	 static final String PASS = "Tostus33,";
	
	 public static void main(String[] args) {
	 Connection conn = null;
	 Statement stmt = null;
	 try{
		 Class.forName("com.mysql.jdbc.Driver");
		 System.out.println("Conectando ...");
		 conn = DriverManager.getConnection(DB_URL, USER, PASS);
		 System.out.println("Creando base...");
		 stmt = conn.createStatement();
		
		 String sql = "CREATE DATABASE COMERCIO";
		 stmt.executeUpdate(sql);
		 System.out.println("BASE CREADA...");
	 }catch(SQLException se){
		 se.printStackTrace();
	 }catch(Exception e){
		 e.printStackTrace();
		 }finally{
	 try{
		 if(stmt!=null)
			 stmt.close();
	 }catch(SQLException se2){
	 }
	 try{
		 if(conn!=null)
		 conn.close();
	 }catch(SQLException se){
		 se.printStackTrace();
	 }//end finally try
	 }//end try
	 System.out.println("ADIOS!");
}
}