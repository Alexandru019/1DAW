#!/bin/bash
numAsteriscos=1
for ((espacios=7;espacios>0;espacios--));
do

    for ((i=0;i<espacios;i++));
    do
        echo -n " "
    done
    for ((i=0;i<numAsteriscos;i=i+1));
    do
        echo -n "*"
    done
    echo ""
    numAsteriscos=$(($numAsteriscos+2))

done


