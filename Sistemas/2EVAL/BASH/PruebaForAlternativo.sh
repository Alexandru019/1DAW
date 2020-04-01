#!/bin/bash
for i in /bin/*
do
    echo "soy $i"
    if [ -f $i ] && [ -x $i ];then
        echo $i
    
    fi
done