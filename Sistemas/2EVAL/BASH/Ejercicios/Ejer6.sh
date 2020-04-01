#!/bin/bash
arg1=$1
arg2=$2
echo "  -----MENU-----  "
echo "1-Comparar Strings desde argumentos"
echo "2-Comparar Strings desde entrada de usuario"
echo "3-Sortir"
echo ""
echo "Introduce el número de la opcion"
read opcion 

if [ "$opcion" == "1" ];then
    if [ $# == 2 ];then
        if [ -n "$arg1" ] && [ -n "$arg2" ];then
            if [ "$arg1" == "$arg2" ];then
                echo "Los argumentos son iguales"
            else
                echo "Los argumentos no son iguales"
            fi
        fi
    fi
fi

if [ "$opcion" == "2" ];then
    echo "Escribe 3 cadenas"
    echo "Cadena 1"
    read Cadena1
    echo "Cadena 2"
    read Cadena2
    echo "Cadena 3"
    read Cadena3
        if [ -z "$Cadena1" ] || [ -z "$Cadena2" ] || [ -z "$Cadena3" ];then
            echo "Alguna de las cadenas está vacia"
            else
                echo "Enhorabuena"
        fi
fi
if [ "$opcion" == "3" ];then
    echo "¿Estas seguro que quieres salir?"
    read salir
    if [ "$salir" == "si" ] || [ "$salir" == "Si" ] || [ "$salir" == "sI" ] || [ "$salir" == "SI"];then
        exit
    else
        echo "Igualmente salimos"
        exit
    fi
fi

