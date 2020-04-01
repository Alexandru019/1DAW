#!/bin/bash
echo "ESCRIBE EL NUMERO DE LA BASE"
read base
total=$(( (base / 2) + 1))
if [ "$(($base % 2))" -ne 0 ] && [ -n "$base" ];then 
    for ((a=0;a<total;a++));
    do
        
        for ((i=0;i<a;i++));
        do
            echo -n " "
        done
        for ((i=0;i<base;i=i+1));
        do
            echo -n "*"
        done
        for ((i=0;i<2;i++));
        do
            echo ""
        done
        base=$(($base-2))
    done
else 
    echo "numero no impar"
fi