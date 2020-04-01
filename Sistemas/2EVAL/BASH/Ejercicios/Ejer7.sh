#!/bin/bash
#7.- Demana 3 numeros i determina si estan introduïts en ordre ascendent.

validate_number='^-?[0-9]+([.][0-9]+)?$'
echo "Escribe un número"
read num1
echo "Escribe otro número"
read num2
echo "Escribe un último número"
read num3
if [ -n "$num1" ] && [ -n "$num2" ] && [ -n "$num3" ] && [[ $num1 =~ $validate_number ]] && [[ $num2 =~ $validate_number ]] && [[ $num3 =~ $validate_number ]];then
    echo "hola"
    if ([ "$num1" -lt "$num2" ] && [ "$num2" -lt "$num3" ]) ;then
    echo "Los números estan ordenados de forma ascendete"
    else 
    echo "No estan ordenados"
    fi
fi