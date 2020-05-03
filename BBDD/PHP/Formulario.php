<?php

if (isset($_POST['nombre'])){
    if (empty($_POST['nombre'])){
        echo "Campo nombre vacío";
    }else{
        echo "El nombre es ".$_POST['nombre'];
    }
    if (empty($_POST['apellidos'])){
        echo "<br />Campo apellidos vacío";
    }else{
        echo " ".$_POST['apellidos'];
    }
    if (empty($_POST['password'])){
        echo "<br />Campo contraseña vacío";
    }else{
        echo "<br /> Campo contraseña procesado";
    }
    if (empty($_POST['apellidos'])){
        echo "<br />Campo radio vacío";
    }else{
        echo "<br/> Seleccionada la ".$_POST['ejemploradio']." de los radios";
    }
    if (empty($_POST['encontrar'])){
        echo "<br />Campo desplegable vacío";
    }else{
        echo "<br/> Seleccionada la ".$_POST['encontrar']." del desplegable";
    }
    if (empty($_POST['mensaje'])){
        echo "<br />Campo texto vacío";
    }else{
        echo "<br/> El texto introducido es: ".$_POST['mensaje'];
    }
}
?>
<!DOCTYPE html>
<html>
    <head>

    </head>
    <body>
        <h1>Test de formulario</h1>
            <form action="Formulario.php" method="POST">
                <p>Nombre: <input type="text" name="nombre" size="25%" placeholder="Nombre"></p>
                <p>Apellidos: <input type="text" name="apellidos" size="25%" placeholder="Apellidos"></p>
                <p>Contraseña: <input type="password" name="password" size="25%" placeholder="******"></p>
                <p>Radio de ejemplo:</p>
                <p>
                    <input type="radio" name="ejemploradio" value="opcion1"> Opción1
                    <input type="radio" name="ejemploradio" value="opcion2"> Opción2
                </p>
                <p>Desplegable de ejemplo:
                    <select name="encontrar">
                        <option value="desplegable1" selected="">Opcion1</option>
                        <option value="desplegable2">Opcion2</option>
                        <option value="desplegable3">Opcion3</option>
                        <option value="desplegable4">Opcion4</option>
                    </select>
                </p>
                <p>Textarea de ejemplo:</p>
                <p>
                    <textarea name="mensaje" cols="50" rows="10"></textarea>
                </p>
                <p align="center">
                    <input type="submit" name="enviar" value="Enviar">
                </p>
            </form>


    </body>




</html>