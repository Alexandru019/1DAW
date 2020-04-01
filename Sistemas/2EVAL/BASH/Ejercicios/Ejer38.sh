#!/bin/bash
ruta=$1
numFicheros=$2
instruccion="$( find $ruta -type f | wc -l )"
validate_number='^-?[0-9]+([.][0-9]+)?$'
echo "$instruccion"
for ((i=1;i<=$instruccion;i++))
do  
    if [ -f "$ruta/ficherocreado$i" ];then
        echo "$i"
        rm -rf "$ruta/ficherocreado$i"
    fi
done
echo "$instruccion"
echo "Se han eliminado los ficheros creados por el programa Ejer38.sh"
echo ""

if ([ "$ruta" == "" ] || [[ $ruta =~ $validate_number ]]);then
    echo "El primer argumento ha de ser una ruta del sistema"
else
    if [ -d $ruta ] ;then
        if [[ $numFicheros =~ $validate_number ]];then
            if [ "$instruccion" -lt "$numFicheros" ];then
                echo "De acuerdo crearé $(( $numFicheros - $instruccion )) archivos"
                for ((i=1;i<=$(( $numFicheros - $instruccion ));i++))
                do
                    touch "$ruta/ficherocreado$i"
                done
                echo "Ya se han creado $(( $numFicheros - $instruccion )) archivos"
            else
                echo "En esta ruta hay mas o igual que $numFicheros archivos"
            fi
        else
            echo "El segundo argumento ha de ser un numero"
        fi
    else
        echo "El primer argumento no es una ruta valida"
    fi
    

fi
echo "$instruccion"


