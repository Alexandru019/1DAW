#!/bin/bash
base=2
while [ "$(($base % 2))" -eq 0 ];do
    echo "ESCRIBE EL NUMERO DE LA BASE(Ha de ser un numero impar)"
    read base
    echo ""
done
numAsteriscos=1
total=$(( (base / 2) + 1))

if [ "$(($base % 2))" -ne 0 ] && [ -n "$base" ];then 

    for ((a=total;a>0;a--));
    do
        
        for ((i=0;i<a;i++));
        do
            echo -n " "
        done
        for ((i=0;i<numAsteriscos;i=i+1));
        do
            echo -n "*"
        done
        for ((i=0;i<2;i++));
        do
            echo ""
        done
        numAsteriscos=$(($numAsteriscos+2))

    done
fi