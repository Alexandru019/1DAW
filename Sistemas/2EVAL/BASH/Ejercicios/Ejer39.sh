#!/bin/bash
validate_number='^-?[0-9]+([.][0-9]+)?$'
echo ""
echo "Hola Usuario"
echo "Soy un creador de rectangulos"
echo "Escribe la base del rectangulo"
read base
echo "Escribe la altura del rectangulo"
read altura

if [ -n "$base" ] && [ -n "$altura" ] && [[ $base =~ $validate_number ]] && [[ $altura =~ $validate_number ]];then
    for ((i=1;i<=base;i++))
    do
        echo -n "*"
    done
    echo ""
    for (( a=1;a<=$(( $altura - 2));a++ ))
    do  
        echo -n "*"
        for (( i=1;i<=$(( $base - 2));i++ ))
        do
            echo -n " "
        done
        echo -n "*"
        echo ""
    done
    for ((i=1;i<=base;i++))
    do
        echo -n "*"
    done

else
    echo "No puedes dejar los campos vacios y no puedes introducir letras,solo números"
fi
echo ""