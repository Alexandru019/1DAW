#!/bin/bash
numAsteriscos=1
echo ""
for ((a=7;a>1;a--));
do
    for ((i=0;i<$(($a-1));i++));
    do
        echo -n " "
    done
    for ((i=0;i<numAsteriscos;i=i+1));
    do
        echo -n "*"
    done
    for ((i=0;i<$(($a-1));i++));
    do
        echo -n " "
    done
    echo ""
    numAsteriscos=$(($numAsteriscos+2))
done
numAsteriscos=13
for ((a=0;a<7;a++));
    do
        
        for ((i=0;i<a;i++));
        do
            echo -n " "
        done
        for ((i=0;i<numAsteriscos;i=i+1));
        do
            echo -n "*"
        done
        
        echo ""
        numAsteriscos=$(($numAsteriscos-2))
    done
echo ""