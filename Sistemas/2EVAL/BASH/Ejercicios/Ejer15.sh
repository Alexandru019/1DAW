#!/bin/bash
directorio="/home/alumno/scriptsSI"
if [ -d "$directorio" ];then
    echo "Sí existe el directorio,lo renombraré"
    mv /home/alumno/scriptsSI /home/alumno/scriptsBash
else
    echo "El directorio no existe, lo crearé"
    mkdir /home/alumno/scriptsBash    
fi