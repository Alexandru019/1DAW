#!/bin/bash
validate_number='^-?[0-9]+([.][0-9]+)?$' 
pasar=1
while [ $pasar -ne 0 ];do
    echo "Dime un número"
    read num1
    echo "Dime otro número"
    read num2 
    echo ""
    if [ -n "$num1" ] && [ -n "$num2" ] && [[ $num1 =~ $validate_number ]] && [[ $num2 =~ $validate_number ]];then
        if [ "$num2" -gt "$num1" ];then
            pasar=0
            echo""
            for ((i=$(($num1+1));i<$num2;i++));
            do
                echo "$i"
            done
        fi
    else
        echo "Algo está mal introducido"
    fi
done
