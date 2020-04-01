#!/bin/bash
validate_number='^-?[0-9]+([.][0-9]+)?$'
echo "  -----MENU-----  "
echo "Escribe un numero entre el 1 y el 7"
read opcion
echo ""
case $opcion in
    "1")
        echo "Lunes"
        ;;
    "2")
        echo "Martes"
    
        ;;
    "3")
        echo "Miercoles"
        ;;
    "4")
        echo "Jueves"
        ;;
    "5")
        echo "Viernes"
        ;;
    "6")
        echo "Sabado"
        ;;
    "7")
        echo "Domingo"
        ;;
    *)
        echo "No has seleccionado ninguna opcion correcta"
esac