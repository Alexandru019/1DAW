#!/bin/bash
echo "Escribe el nombre del fichero que quieres buscar"
read fichero
echo "¿Donde quieres buscarlo?Introduce la ruta"
read ruta
echo ""
echo "-----MENÚ-----"
echo "1-Toda la estructura"
echo "2-Carpetas clases"
echo "3-Carpetas alumnos"
read opcion
case $opcion in
    "1")
       
        
    ;; 
    "2")
        
    ;;
    "3")
        
    ;;
    *)
        echo "Opcion inexistente"
        exit
esac