#!/bin/bash
#9.- Demana 8 numeros i ordena'ls de menor a major en un fitxer de text.

echo "" > Prueba.txt
validate_number='^-?[0-9]+([.][0-9]+)?$'
echo "Escribe un número"
read n1

if [ -n "$n1" ] && [[ $n1 =~ $validate_number ]];then
    echo $n1 >> Prueba.txt
fi

echo "Escribe un número"
read n2

if [ -n "$n2" ] && [[ $n2 =~ $validate_number ]];then
    echo $n2 >> Prueba.txt
fi

echo "Escribe un número"
read n3

if [ -n "$n3" ] && [[ $n3 =~ $validate_number ]];then
    echo $n3 >> Prueba.txt
fi

echo "Escribe un número"
read n4

if [ -n "$n4" ] && [[ $n4 =~ $validate_number ]];then
    echo $n4 >> Prueba.txt
fi

echo "Escribe un número"
read n5

if [ -n "$n5" ] && [[ $n5 =~ $validate_number ]];then
    echo $n5 >> Prueba.txt
fi

echo "Escribe un número"
read n6

if [ -n "$n6" ] && [[ $n6 =~ $validate_number ]];then
    echo $n6 >> Prueba.txt
fi

echo "Escribe un número"
read n7

if [ -n "$n7" ] && [[ $n7 =~ $validate_number ]];then
    echo $n7 >> Prueba.txt
fi

echo "Escribe un número"
read n8

if [ -n "$n8" ] && [[ $n8 =~ $validate_number ]];then
    echo $n8 >> Prueba.txt
fi

sort Prueba.txt
