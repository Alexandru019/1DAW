#!/bin/bash
fichero="/home/alumno/fitxer3.txt"
if [ -f "$fichero" ];then
    echo "Sí existe el fichero y estos son su permisos"
    if [ -r "$fichero" ];then
        echo "Permisos de lectura"
    fi
    if [ -w "$fichero" ];then
        echo "Permisos de lectura"
    fi
    if [ -x "$fichero" ];then
        echo "Permisos de lectura"
    fi
else
    if [ -d "/home/alumno" ];then
        ls "/home/alumno"
    else
        echo "La carpeta /home/alumno no exite"
    fi 
fi