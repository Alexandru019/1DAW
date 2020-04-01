#!/bin/bash
suma=0
for ((i=0;i<200;i++))
do
    suma=$(( $suma + $i ))

done
echo "El resultado de la suma es : "$suma""