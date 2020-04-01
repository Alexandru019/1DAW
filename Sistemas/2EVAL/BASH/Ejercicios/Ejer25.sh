#!/bin/bash
validate_number='^-?[0-9]+([.][0-9]+)?$' 
pasar=1
while [ $pasar -ne 0 ];do
    echo "Dime un número"
    read num1
    echo "Dime otro número"
    read num2 
    if [ -n "$num1" ] && [ -n "$num2" ] && [[ $num1 =~ $validate_number ]] && [[ $num2 =~ $validate_number ]];then
        pasar=0
        for ((a=$num1;a<=$num2;a++));
        do
            for ((i=0;i<=10;i++));
            do
            echo "$a X $i = $((a * $i))"
            done
            echo ""
        done
        

    else
        echo "Algo malo ha ocurrido"
    fi
done