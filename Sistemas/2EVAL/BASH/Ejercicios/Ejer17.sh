#!/bin/bash
validate_number='^-?[0-9]+([.][0-9]+)?$'
echo "-----Bienvenido-----"
echo "Dime el precio del producto:"
read precio
if [ -n "$precio" ] && [[ $precio =~ $validate_number ]];then
    echo "Le aplicamos descuento (S/N)"
    read opcion
    case $opcion in
    "S")
        descuento=$(( $precio * 10 / 100 ))
        IVA=$(( $precio * 21 / 100 ))
        echo "El precio final del producto aplicando el descuento es de "$(( ($precio - $descuento) + $IVA ))""
        ;;
    "N")
        IVA=$(( $precio * 21 / 100 ))
        echo "El precio final del producto sin aplicar el descuento es de "$(( $precio + $IVA ))""
        ;;
    *)
        echo "opcion incorrecta"
    esac
else
    echo "El campo precio no está completado de forma correcta,no se aceptan letras"
fi