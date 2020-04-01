#!/bin/bash
echo "Escribe palabras, Escribe \"Exit\" para salir"
palabra=""
contador=0
while [ "$palabra" != "Exit" ];do
    read palabra
    if [ "$palabra" == "Bye" ];then
        contador=$(( "$contador" + 1 ))
    fi
done
echo "Has escrito \"Bye\" $contador veces" 