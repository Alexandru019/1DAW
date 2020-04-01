#!/bin/bash
resultado=1
for ((i=1;i<100;i++));
do
    resultado=$(($resultado + ($i*$i) ))
done
echo "$resultado"