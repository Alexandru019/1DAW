#!/bin/bash
rutaSolvam="/home/alumno/CarpetaAlex/Sistemas/Solvam/clase*"
rutaClases="/home/alumno/CarpetaAlex/Sistemas/Solvam/clase1/alumno*"
numClases=$( ls $rutaSolvam -d | wc -l )
numAlumnos=$( ls $rutaClases -d | wc -l )

echo "Escribe el nombre del fichero que quieres buscar"
read fichero
echo "¿Donde quieres buscarlo?Introduce la ruta"
read ruta
echo ""
echo "-----MENÚ-----"
echo "1-Toda la estructura"
echo "2-Carpetas clases"
echo "3-Carpetas alumnos"
read opcion

case $opcion in
    "1")
        echo ""
        for ((a=1;a<=numClases;a++))
        do
            for i in /home/alumno/CarpetaAlex/Sistemas/Solvam/clase$a/*
            do  
                if [ -f $i ] && [ $i==$fichero ];then
                    echo " fichero encontrado en clase$a" 
                fi
            done
            for ((b=1;b<=numAlumnos;b++))
            do
                for i in /home/alumno/CarpetaAlex/Sistemas/Solvam/clase$a/alumno$b/*
                do
                    
                    if [ -f $i ] && [ $i==$fichero ];then
                        echo " fichero encontrado en clase$a/alumno$b" 
                    fi
                done
            done
        done
        
    ;; 
    "2")
        echo ""
        echo "  EXAMINANDO CARPETAS CLASES  "
        for ((a=0;a<numClases;a++))
        do
            for i in /home/alumno/CarpetaAlex/Sistemas/Solvam/clase$a/*
            do
                if [ -f $i ] && [ $i==$fichero ];then
                    echo " fichero encontrado en clase$a" 
                fi
            done
        done

    ;;
    "3")
        echo ""
        echo "  EXAMINANDO CARPETAS ALUMNO  "
        for ((a=0;a<numClases;a++))
        do
            for ((b=0;b<numAlumnos;b++))
            do
                for i in /home/alumno/CarpetaAlex/Sistemas/Solvam/clase$a/alumno$b/*
                do
            
                    if [ -f $i ] && [ $i==$fichero ];then
                      echo " fichero encontrado en clase$a/alumno$b" 
                    fi
                done
            done
        done
    ;;
    *)
        echo "Opcion inexistente"
        exit
esac