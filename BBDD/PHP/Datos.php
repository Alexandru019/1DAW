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
        <title>Datos del Formulario</title>
    </head>
    <body>
        <p><a href="Formulario.php">Volver al Formulario</a></p>
        


    </body>




</html>