#!/bin/bash
validate_number='^-?[0-9]+([.][0-9]+)?$'
opcion=0
while [ $opcion -ne 1 ] && [ $opcion -ne 2 ] && [ $opcion -ne 3 ] && [ $opcion -ne 4 ] && [ $opcion -ne 5 ];do
    echo "  -----MENU CONVERTIR KILOGRAMOS A:-----  "
    echo "1-Miligramos"
    echo "2-Centigramos"
    echo "3-Decigramos"
    echo "4-Gramos"
    echo "5-Salir"
    echo "Introduce el número de la opcion"
    read opcion
    echo ""
done

case $opcion in
    "1")
        echo "Introduce una masa en kilogramos"
        read num1
        if [ -n "$num1" ] && [[ $num1 =~ $validate_number ]];then
            echo "La masa a miligramos es igual a "$(( $num1 * "1000000" ))""
        else
            exit
        fi
        ;;
    "2")
        echo "Introduce una masa en kilogramos"
        read num
        if [ -n "$num1" ] && [[ $num1 =~ $validate_number ]];then
            echo "La masa a centigramos es igual a "$(( "$num" * "100000"))""
        else
            exit
        fi
        ;;
    "3")
        echo "Introduce una masa en kilogramos"
        read num
        if [ -n "$num1" ] && [[ $num1 =~ $validate_number ]];then
            echo "La masa a decigramos es igual a "$(( "$num" * "10000"))""
        else
            exit
        fi
        ;;
    "4")
        echo "Introduce una masa en kilogramos"
        read num
        if [ -n "$num1" ] && [[ $num1 =~ $validate_number ]];then
            echo "La masa a gramos es igual a "$(( "$num" * "1000"))""
        else
            exit
        fi
        ;;
    "5")
        exit
        ;;
    *)
        echo "No has seleccionado ninguna opcion correcta"
esac

