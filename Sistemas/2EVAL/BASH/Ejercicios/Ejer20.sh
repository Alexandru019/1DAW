#!/bin/bash
contador=0
for ((i=0;i<100;i++))
do
    if [ $(("$i" % 2 )) -eq 0 ];then
        contador=$(( $contador + 1 ))
    fi

done
echo "El numero total de pares es : "$contador""