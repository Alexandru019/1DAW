#!/bin/bash

echo ""
echo "-----MENÚ-----"
echo "1-Procesos del usuario"
echo "2-Tamaño del archivo"
echo "3-¿Está el fichero en la carpeta?"
echo "Selecciona una opción"
read opcion
instruccion=$(cut -f1 -d ":" /etc/passwd)
case $opcion in
    "1")
        echo "Escribe el nombre del usuario"
        read usuario
        if id -u "$usuario" >/dev/null 2>&1; then
            echo "Usuario comprobado"
            ps -u $usuario
        else
            echo "Usuario inexistente"
            exit
        fi
         
        
    ;; 
    "2")
        echo ""
        echo "Escribe la ruta del archivo"
        read ruta
        if [ -f $ruta ];then
            echo "El tamaño del archivo es :"
            du -s $ruta
            echo ""
        else
            echo "La ruta o el archivo no exiten"
        fi
        
        
    ;;
    "3")
        
    ;;
    *)
        echo "Opcion inexistente"
        exit
esac