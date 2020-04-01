#!/bin/bash
echo "Dime un numero"
read num

for ((cont=0;cont<$num;cont++));
do
    echo ""
    echo $cont
done