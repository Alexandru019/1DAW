package Necesario;

public class Asignatura {
	
private int Nota;
private String Nombre;
private String Aprobar;

public Asignatura(){
	this.Nota=0;
	this.Nombre="Programacion";
}

public Asignatura(String a,int b){
	this.Nota=b;
	this.Nombre=a;
}

public void setNombre(String d) {
	this.Nombre= d;
}

public String getNombre() {
	return this.Nombre;
}

public void setNota(int d) {
	this.Nota= d;
}

public int getNota() {
	return this.Nota;
}

public String Aprobado() {
	if (this.Nota >= 5) {
		this.Aprobar="Aprobado";
	}else {
		this.Aprobar="Reprobado"; 
	}
	return this.Aprobar;
}
}
