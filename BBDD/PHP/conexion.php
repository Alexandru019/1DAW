<?php
    include 'conexion-datos.php';

    $conexion=new mysqli($server,$user,$pass,$bd);
    if($conexion->connect_error){
        die('No se pudo cargar la base de datos');
    }
?>

<!DOCTYPE html>
<html>
    <head>

    </head>
    <body>
        <h1>Página De La Base de Datos</h1>
        <p><a href="BD_LIBROS/libros.php">Libros</a>
        <p><a href="categorias.php">Categorias</a>


    </body>




</html>

