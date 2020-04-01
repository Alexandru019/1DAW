package Necesario;

public class Alumno {
	private int Edad;
	private String Nombre;
	Asignatura a1;
	
	public Alumno() {
		this.Nombre="";
		this.Edad=16;
		a1=new Asignatura("Programacion",10);
	}
	public Alumno(int a,String b,Asignatura c) {
		this.Edad=a;
		this.Nombre=b;
		this.a1=c;
	}
	
	public void setNombre(String a) {
		this.Nombre=a;
	}
	public void setEdad(int a) {
		this.Edad=a;
	}
	public String getNombre() {
		return this.Nombre;
	}
	public int getEdad() {
		return this.Edad;
	}
	
}
