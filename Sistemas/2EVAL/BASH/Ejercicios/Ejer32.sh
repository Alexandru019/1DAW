#!/bin/bash
contador=0
for i in /bin/*
do
    if [ -f $i ] && [ -x $i ];then
        contador=$(( $contador + 1 ))
    fi
done
echo $contador