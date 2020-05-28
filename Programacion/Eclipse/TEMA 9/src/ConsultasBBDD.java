import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConsultasBBDD {
	 static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	 static final String DB_URL = "jdbc:mysql://xlex.com.es/COMERCIO";
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
				//Proveedores
				try {
					Statement st = conn.createStatement();
					 ResultSet rs = st.executeQuery("SELECT * FROM proveedores");
					 while (rs.next()) {
						 int idClientes = rs.getInt(1);
						 String nombre = rs.getString(2);
						 String direccion = rs.getString(3);
					 System.out.println(idClientes + ", " + nombre + ", " + direccion);
					 
					}
					 System.out.println("Tabla proveedores Mostrada con Éxito");System.out.println();
					} catch (Exception e) {
					 System.out.println("Error al visualizar datos de proveedores");
					} 
				
				//Productos
				try {
					Statement st = conn.createStatement();
					 ResultSet rs = st.executeQuery("SELECT * FROM productos");
					 while (rs.next()) {
						 int idDepartamentos = rs.getInt(1);
						 int idClientes = rs.getInt(2);
						 String direccion = rs.getString(3);
						 int precio = rs.getInt(4);
					 System.out.println(idDepartamentos + ", " + idClientes + ", " + direccion + ", " + precio);
					 
					}
					 System.out.println("Tabla productos Mostrada con Éxito");System.out.println();
					} catch (Exception e) {
					 System.out.println("Error al visualizar datos de productos");
					} 
				//Clientes
				try {
					Statement st = conn.createStatement();
					 ResultSet rs = st.executeQuery("SELECT * FROM clientes");
					 while (rs.next()) {
						 int idClientes = rs.getInt(1);
						 String direccion = rs.getString(2);
						 String ciudad = rs.getString(3);
						 String pais = rs.getString(4);
						 String codigo_postal = rs.getString(5);
					 System.out.println(idClientes + ", " + direccion + ", " + ciudad + ", " + pais +  ", " + codigo_postal );
					 
					}
					 System.out.println("Tabla clientes Mostrada con Éxito");System.out.println();
					} catch (Exception e) {
					 System.out.println("Error al visualizar datos de clientes");
					} 
				//Departamentos
				try {
					Statement st = conn.createStatement();
					 ResultSet rs = st.executeQuery("SELECT * FROM departamentos");
					 while (rs.next()) {
						 int idDepartamentos = rs.getInt(1);
						 String nombre = rs.getString(2);
					 System.out.println(idDepartamentos +", "+nombre );
					 
					}
					 System.out.println("Tabla departamentos Mostrada con Éxito");System.out.println();
					} catch (Exception e) {
					 System.out.println("Error al visualizar datos de departamentos");
					} 
				//Empleados
				try {
					Statement st = conn.createStatement();
					 ResultSet rs = st.executeQuery("SELECT * FROM empleados");
					 while (rs.next()) {
						 int idEmpleados=rs.getInt(1);
						 String nombre = rs.getString(2);
						 int idDepartamento = rs.getInt(3);
						 int salario =  rs.getInt(4);
						 int edad = rs.getInt(5);
						 System.out.println(idEmpleados + ", " + nombre + ", " + idDepartamento + ", " + salario + ", " + edad);
					 
					}
					 System.out.println("Tabla empleados Mostrada con Éxito");System.out.println();
					} catch (Exception e) {
					 System.out.println("Error al visualizar datos de empleados");
					} 

				
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
