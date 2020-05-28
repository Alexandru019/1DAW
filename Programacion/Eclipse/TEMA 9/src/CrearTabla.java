import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class CrearTabla {
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
		String sql = "CREATE TABLE proveedores (proveedores_id int NOT NULL, proveedores_nombre char(50) NOT NULL, contacto_nombre char(50),CONSTRAINT proveedores_pk PRIMARY KEY (proveedores_id))";
		stmt.executeUpdate(sql);
		 sql = "CREATE TABLE productos (productos_id int not null,proveedores_id int not null,descripcion char(50),precio int,CONSTRAINT productos_pk PRIMARY KEY (productos_id),FOREIGN KEY (proveedores_id)REFERENCES proveedores(proveedores_id))";
		stmt.executeUpdate(sql);
		 sql = "CREATE TABLE clientes (clientes_id int NOT NULL,clientes_nombre char(50) NOT NULL,direccion char(50),ciudad char(50),pais char(25),codigo_postal char(5),CONSTRAINT clientes_pk PRIMARY KEY (clientes_id))";
		stmt.executeUpdate(sql);
		 sql = "CREATE TABLE departamentos (departamentos_id int NOT NULL,departamentos_nombre char(50) NOT NULL,CONSTRAINT departamentos_pk PRIMARY KEY (departamentos_id))";
		stmt.executeUpdate(sql);
		 sql = "CREATE TABLE empleados (empleados_num int NOT NULL,empleados_nombre char(50) NOT NULL,departamentos_id int,salario int,edad int,CONSTRAINT empleados_pk PRIMARY KEY (empleados_num),CONSTRAINT fk_departamentos FOREIGN KEY (departamentos_id)REFERENCES departamentos(departamentos_id))";
		stmt.executeUpdate(sql);
		System.out.println("TABLAS CREADAS...");
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