#!/bin/bash
validate_number='^-?[0-9]+([.][0-9]+)?$'
echo "---Bienvenido---"
echo "Ingrese el dinero ganado al año"
read dinero
if [ -n "$dinero" ] && [[ $dinero =~ $validate_number ]];then
    salario=$(( $dinero / 12 ))
else
    exit
fi
echo "Ingresa el numero de años que lleva en la empresa"
echo "Si lleva menos de 1 año indique 0"
echo ""
read opcion
if [ -n "$opcion" ] && [[ $opcion =~ $validate_number ]];then
    if [ "$opcion" -ge "10" ];then
        echo ""
        echo "Su incremento es del 10%"
        echo "El salario total es de "$(( ($salario * 10 / 100) + $salario ))"€"
    fi
    if [ "$opcion" -lt "10" ] && [ "$opcion" -ge "5" ];then
        echo ""
        echo "Su incremento es del 7%"
        echo "El salario total es de "$(( ($salario * 7 / 100) + $salario ))"€"
    fi
    if [ "$opcion" -lt "5" ] && [ "$opcion" -ge "3" ];then
        echo ""
        echo "Su incremento es del 5%"
        echo "El salario total es de "$(( ($salario * 5 / 100) + $salario ))"€"
    fi
    if [ "$opcion" -lt "3" ] && [ "$opcion" -ge "1" ];then
        echo ""
        echo "Su incremento es del 3%"
        echo "El salario total es de "$(( ($salario * 3 / 100) + $salario ))"€"
    fi
    if [ "$opcion" -lt "1" ];then
        echo ""
        echo "El salario es de "$(( $dinero / 12 ))"€"
    fi
else 
    exit
fi
