
public class Empleado {
	private String nombre;
	private String cod_empleado;
	private int edad;
	private boolean casado;
	private double salario;
	public Empleado(String nombre, String cod_empleado, int edad, boolean casado, double salario) {
		this.nombre = nombre;
		this.cod_empleado = cod_empleado;
		this.edad = edad;
		this.casado = casado;
		this.salario = salario;
	}
	public Empleado() {
		nombre="";
		cod_empleado="";
		edad=18;
		casado=false;
		salario=0;
	}
	public void hallarNivel() {
		if(edad<=21) {
			System.out.println("Principiante");
		}
		if(edad>=22 && edad<=35) {
			System.out.println("Intermedio");
		}else 
			System.out.println("Senior");
	}
	public void MostrarDatos() {
		System.out.println("Nombre: "+nombre+"\nCodigo Empleado: "+cod_empleado+"\nEdad: "+edad+"\nCasado: "+casado+"\nSalario: "+salario);
	}
	public void AumentaSalario(double a) {
		salario=salario+(salario*a/100);
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCod_empleado() {
		return cod_empleado;
	}
	public void setCod_empleado(String cod_empleado) {
		this.cod_empleado = cod_empleado;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public boolean isCasado() {
		return casado;
	}
	public void setCasado(boolean casado) {
		this.casado = casado;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}

	
	
}
