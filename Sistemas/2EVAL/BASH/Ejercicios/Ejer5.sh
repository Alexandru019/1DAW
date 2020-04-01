#!/bin/bash
curso=$1
grado=$2
if ([ "$curso" != "1" ] && [ "$curso" != "2" ]) || ([ "$grado" != "SMR" ] && [ "$grado" != "DAW" ]);then
    echo "No está registrado"
    else
    echo "Bienvenido a Solvam"
fi