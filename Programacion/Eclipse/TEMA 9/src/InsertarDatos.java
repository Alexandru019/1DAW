import java.sql.*;
public class InsertarDatos {
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
			String sql = "INSERT INTO proveedores VALUES (1, 'Alex','Ismael')";
			stmt.executeUpdate(sql);
			sql = "INSERT INTO proveedores VALUES (2, 'Victor','Arcadio')";
			stmt.executeUpdate(sql);
			sql = "INSERT INTO proveedores VALUES (3, 'Anais','Kevvo')";
			stmt.executeUpdate(sql);
			
			//Productos
			sql = "INSERT INTO productos VALUES (11, 1,'Chocolate',2)";
			stmt.executeUpdate(sql);
			sql = "INSERT INTO productos VALUES (12, 2,'Galletas Maria',1)";
			stmt.executeUpdate(sql);
			sql = "INSERT INTO productos VALUES (13, 3,'Leche',3)";
			stmt.executeUpdate(sql);
			
			//Clientes
			sql = "INSERT INTO clientes VALUES (21,	'Elen Nano','Calle Pérdida','Valencia','ESPAÑA','46580')";
			stmt.executeUpdate(sql);
			sql = "INSERT INTO clientes VALUES (22, 'Armando Armarios','Mirador del Cementerio','Murcia','ESPAÑA','47950')";
			stmt.executeUpdate(sql);
			sql = "INSERT INTO clientes VALUES (23, 'Elsa Patito','Calle Glorieta','Galicia','ESPAÑA','42610')";
			stmt.executeUpdate(sql);
			
			//Departamentos
			sql = "INSERT INTO departamentos VALUES (31,'Departamento de Marketing')";
			stmt.executeUpdate(sql);
			sql = "INSERT INTO departamentos VALUES (32, 'Departamento de Informática')";
			stmt.executeUpdate(sql);
			sql = "INSERT INTO departamentos VALUES (33, 'Departamento de Recursos Humanos')";
			stmt.executeUpdate(sql);
			
			//Empleados
			sql = "INSERT INTO empleados VALUES (41,'Jhay Cortez',31,2100,27)";
			stmt.executeUpdate(sql);
			sql = "INSERT INTO empleados VALUES (42,'Myke Towers',32,2100,26)";
			stmt.executeUpdate(sql);
			sql = "INSERT INTO empleados VALUES (43,'Cosculluela',33,2500,39)";
			stmt.executeUpdate(sql);
			
			System.out.println("Datos Insertados con exito...");
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