#!/bin/bash
echo "  -----MENU-----  "
echo "1-Dar la Bienvenida"
echo "2-Dar la despedida"
echo "3-Salir"
echo ""
echo "Introduce el número de la opcion"
read opcion
case $opcion in
    "1")
        echo "Bienvenido"
        ;;
    "2")
        echo "Despedida"
        ;;
    "3")
        exit
        ;;
    *)
        echo "No has seleccionado ninguna opcion correcta"
esac