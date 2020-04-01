#!/bin/bash
fichero="/home/alumno/usuariNormal.txt"
if [ -s "$fichero" ];then
    echo "Fichero ya existente"
else
    echo "El meu primer fitxer des de script" > /home/alumno/usuariNormal.txt
fi
