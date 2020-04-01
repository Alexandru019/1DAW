#!/bin/bash
#8.- Demana 5 numeros i digues quin és el mínim i quin és el màxim.

validate_number='^-?[0-9]+([.][0-9]+)?$'
echo "Escribe un número"
read num1

if [ -n "$num1" ] && [[ $num1 =~ $validate_number ]];then
    max=$num1
    min=$num1
else
    exit
fi

echo "Escribe otro número"
read n2

if [ -n "$n2" ] && [[ $n2 =~ $validate_number ]];then
    if [ "$n2" -gt "$max" ];then
        max=$n2
    fi
    if [ "$n2" -lt "$min" ];then
        min=$n2
    fi
else
    exit
fi

echo "Escribe otro número"
read n3

if [ -n "$n3" ] && [[ $n3 =~ $validate_number ]];then
    if [ "$n3" -gt "$max" ];then
        max=$n3
    fi
    if [ "$n3" -lt "$min" ];then
        min=$n3
    fi
else
    exit
fi

echo "Escribe otro número"
read n4
if [ -n "$n4" ] && [[ $n4 =~ $validate_number ]];then
    if [ "$n4" -gt "$max" ];then
        max=$n4
    fi
    if [ "$n4" -lt "$min" ];then
        min=$n4
    fi
fi
echo "Escribe el último número"
read n5
if [ -n "$n5" ] && [[ $n5 =~ $validate_number ]];then
    if [ "$n5" -gt "$max" ];then
        max=$n5
    fi
    if [ "$n5" -lt "$min" ];then
        min=$n5
    fi
fi
echo "El mayor numero es $max"
echo "El menor numero es $min"

