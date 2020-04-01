#!/bin/bash
validate_number='^-?[0-9]+([.][0-9]+)?$'
function comprueba {
    if  [ -n $1 ] && [[ $1 =~ $validate_number ]] && [ -n $2 ] && [[ $2 =~ $validate_number ]];then
        echo ""
    else 
        echo "No puedes dejar campos vacios ni poner letras"
        exit 
    fi
}
echo "  -----MENU-----  "
echo "1-Sumar"
echo "2-Restar"
echo "3-Multiplicar"
echo "4-Dividir"
echo "5-Salir"
echo "Introduce el número de la opcion"
read opcion
echo ""
case $opcion in
    "1")
        echo "Escribe un numero"
        read n1
        echo "Escribe otro numero"
        read n2
        comprueba $n1 $n2 
        echo "El resultado de la suma es: "$(( $n1 + $n2 ))""
            
        ;;
    "2")
        echo "Escribe un numero"
        read n1
        echo "Escribe otro numero"
        read n2
        comprueba $n1 $n2 
        "El resultado de la resta es: "$(( $n1 - $n2 ))""

        ;;
    "3")
        echo "Escribe un numero"
        read n1
        echo "Escribe otro numero"
        read n2
        comprueba $n1 $n2 
        echo "El resultado de la multiplicacion es: "$(( $n1 * $n2 ))""
        ;;
    "4")
        echo "Escribe un numero"
        read n1
        echo "Escribe otro numero"
        read n2
        comprueba $n1 $n2 
        echo "El resultado de la division es: "$(( $n1 / $n2 ))""
        ;;
    "5")
        exit
        ;;
    *)
        echo "No has seleccionado ninguna opcion correcta"
esac