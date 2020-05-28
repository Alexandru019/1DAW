package com.example.listview;

public class Entidad {
    private int imgFoto;
    private String titulo;
    private String Contenido;

    public Entidad(int a,String b,String c){
        imgFoto=a;
        titulo=b;
        Contenido=c;

    }

    public int getImgFoto(){ return imgFoto;}

    public String getTitulo(){ return titulo;}

    public String getContenido(){ return Contenido;}
}
