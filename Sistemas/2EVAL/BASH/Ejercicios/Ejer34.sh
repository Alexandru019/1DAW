#!/bin/bash
validate_number='^-?[0-9]+([.][0-9]+)?$'
rutaWindows="C:\Users\alexi\Desktop\MiCarpeta\Sistemas\Solvam"
rutaLinux="/home/alumno/CarpetaAlex/Sistemas/Solvam"
if [ -d "$rutaWindows" ];then
    echo "Directorio existente"
    rm -rf "$rutaWindows"
    echo "Borrando directorio y creando uno nuevo"
    mkdir "$rutaWindows"
else
    "Creando directorio"
    mkdir "$rutaWindows"
fi
echo ""

pasar=1
while [ $pasar -ne 0 ];do
    echo "Hola usuario"
    echo "¿Cuantas clases hay en SOLVAM?(introduce un numero)"
    read numClases
    echo "¿Cuantos alumnos tienen las clases?(introduce un numero)"
    read numAlumnos
    if [ -n "$numClases" ] && [ -n "$numAlumnos" ] && [[ $numClases =~ $validate_number ]] && [[ $numAlumnos =~ $validate_number ]];then
        pasar=0
        for ((a=1;a<=numClases;a++))
        do
            mkdir "$rutaWindows/clase$a"
        done
        for ((a=1;a<=numClases;a++))
        do
            for ((i=1;i<=numAlumnos;i++))
            do
                mkdir "$rutaWindows/clase$a/alumno$i"
            done
            
        done
        echo "Perfecto se han creado $numClases Clases de $numAlumnos Alumnos cada una"
    else
        echo "Algo malo ha pasado"
        echo ""
    fi
done