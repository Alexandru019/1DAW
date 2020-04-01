#!/bin/bash
opcion=0
while [ $opcion -ne 1 ] && [ $opcion -ne 2 ];do
    echo "---MENÚ---"
    echo "-1.HOLA"
    echo "-2.ADIOS"
    read opcion
    echo ""
done

case $opcion in
    "1")
        echo "Bienvenido"
        ;;
    "2")
        echo "Despedida"
        ;;
    *)
        echo "No has seleccionado ninguna opcion correcta"
esac