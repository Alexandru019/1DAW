#!/bin/bash
validate_number='^-?[0-9]+([.][0-9]+)?$'
echo "Dime un número"
read num
echo ""
resultado=1
if [ -n "$num" ] && [[ $num =~ $validate_number ]];then
    echo -n "$num! = 1"
    for ((i=2;i<$((num+1));i++));
    do
        echo -n " x $i"
        resultado=$(($resultado * $i))
    done
    echo " = $resultado"
else
    exit
fi