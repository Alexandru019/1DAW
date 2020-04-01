#!/bin/bash
#10.- Pregunta un numero i digues si es par o impar.

validate_number='^-?[0-9]+([.][0-9]+)?$'
echo "Escribe un número"
read num 
if [ -n "$num" ] && [[ $num =~ $validate_number ]];then
    if [ "$(($num%2))" -eq "0" ];then
        echo "Este número es par"
    else 
        echo "Este número es impar"
    fi
fi