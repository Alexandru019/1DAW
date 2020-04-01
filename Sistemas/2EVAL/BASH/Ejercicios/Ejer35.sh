#!/bin/bash
contador=$(cut -f6 -d":" /etc/passwd | grep -c ^/home/*)
echo "numero de usuarios con el escritorio en el directorio /home: $contador"
