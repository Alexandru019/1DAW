#!/bin/bash
validate_number='^-?[0-9]+([.][0-9]+)?$'
echo "Dime un número"
read num
echo ""
if [ -n "$num" ] && [[ $num =~ $validate_number ]];then
    for ((i=0;i<11;i++));
    do
        echo "$num X $i = $(($num * $i))"
    done
    echo ""
else
    exit
fi